package ar.edu.unlp.objetos.uno.ejercicio20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.ejercicio20.PorHoras;

public class PorHorasTest {
	private PorHoras pH;
	private PorHoras pH2;
	
	@BeforeEach 
	public void setUp() {
		pH = new PorHoras (LocalDate.of(2024, 11, 1), LocalDate.of(2025, 11, 1), 500, 5);
		pH2 = new PorHoras (LocalDate.of(2023, 11, 1), LocalDate.of(2024, 10, 1), 500, 5);
	}
	
	@Test
	public void estaVigenteTest () {
		assertTrue(pH.estaVigente());
		assertFalse(pH2.estaVigente());
	}
	
	@Test
	public void calcularMontoTest () {
		assertEquals (2500, pH.calcularMonto());
	}
}
