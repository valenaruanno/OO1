package ar.edu.unlp.objetos.uno.ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservaTest {
	Reserva r;
	
	@BeforeEach
	public void setUp () {
		r = new Reserva (LocalDate.of(2024, 10,29), LocalDate.of(2024, 11, 05));
	}
	
	@Test
	public void calcularPrecioTest () {
		assertEquals(7000, r.calcularPrecio(1000));
	}
}
