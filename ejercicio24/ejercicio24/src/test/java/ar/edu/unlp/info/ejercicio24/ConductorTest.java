package ar.edu.unlp.info.ejercicio24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConductorTest {
	private Conductor c;
	private Vehiculo v;
	
	@BeforeEach
	public void setUp() {
		c = new Conductor ("valentin", 100);
		v = new Vehiculo ("Hola", 4, LocalDate.of(2022, 10, 10), 100, c);
		c.setVehiculo(v);
	}
	
	@Test
	public void descontarSaldoTest () {
		c.descontarSaldo(10);
		assertEquals(80, c.getSaldo());
		assertNotEquals (81, c.getSaldo());
		assertNotEquals (79, c.getSaldo());
	}
}
