package ar.edu.unlp.objetos.uno.ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropiedadTest {
	private Propiedad p;
	
	@BeforeEach
	public void setUp () {
		p = new Propiedad ("Casa", "493 3057", 100.0, "Flexible");
	}
	
	@Test
	public void disponibilidadArregloVacioTest() {
		assertTrue(p.disponibilidad(LocalDate.of(2024, 10, 29), LocalDate.of(2024, 11, 05)));
	}
	
	@Test
	public void disponibilidadArregloConElementoTest() {
		p.crearReserva(LocalDate.of(2024, 10, 29), LocalDate.of(2024, 11, 05));
		assertFalse(p.disponibilidad(LocalDate.of(2024, 10, 29), LocalDate.of(2024, 11, 05)));
	}
	
	@Test
	public void disponibilidadFechaSuperpuestaTest() {
		p.crearReserva(LocalDate.of(2024, 10, 29), LocalDate.of(2024, 11, 05));
		assertFalse(p.disponibilidad(LocalDate.of(2024, 11, 03), LocalDate.of(2024, 11, 15)));
	}
	
	@Test
	public void disponibilidadFechaNoSuperpuestaTest() {
		p.crearReserva(LocalDate.of(2024, 10, 29), LocalDate.of(2024, 11, 05));
		assertFalse(p.disponibilidad(LocalDate.of(2024, 11, 6), LocalDate.of(2024, 11, 15)));
	}
	
	@Test
	public void cancelarReservaTest() {
		p.crearReserva(LocalDate.of(2024, 10, 29), LocalDate.of(2024, 11, 05));
		assertTrue(p.cancelarReserva(LocalDate.of(2024, 10, 29), LocalDate.of(2024, 11, 05)));
	}
	
	@Test
	public void calcularMisReservasTest() {
		p.crearReserva(LocalDate.of(2024, 10, 29), LocalDate.of(2024, 11, 05));
		assertEquals(700.0, p.calcularMisReservas(LocalDate.of(2024, 10, 29), LocalDate.of(2024, 11, 05)));
	}
}
