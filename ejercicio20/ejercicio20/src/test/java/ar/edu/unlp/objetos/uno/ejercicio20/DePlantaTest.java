package ar.edu.unlp.objetos.uno.ejercicio20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.ejercicio20.DePlanta;
import ar.edu.unlp.info.ejercicio20.Empleado;

public class DePlantaTest {
	private DePlanta contratoDePlanta;
	private Empleado empleado;
	
	@BeforeEach
	public void setUp() {
		contratoDePlanta = new DePlanta(LocalDate.of(2024, 03, 29), 500, 50, 30);
		empleado = new Empleado("Fabio", "Torrejon", "5-45478924-10", LocalDate.of(2004, 02, 10), false, false);
	}
	
	@Test
	public void noTieneHijosNiConyugue() {
		empleado.agregarContrato(contratoDePlanta);
		assertEquals(500, contratoDePlanta.calcularMonto(empleado));
	}
	
	public void TieneHijos() {
		empleado .agregarContrato(contratoDePlanta);
		assertEquals(500, contratoDePlanta.calcularMonto(empleado));
	}
	
	public void TieneConyugue() {
		empleado.agregarContrato(contratoDePlanta);
		assertEquals(500, contratoDePlanta.calcularMonto(empleado));
	}
}
