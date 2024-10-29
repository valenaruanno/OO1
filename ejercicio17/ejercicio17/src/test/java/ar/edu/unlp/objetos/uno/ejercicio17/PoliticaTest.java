package ar.edu.unlp.objetos.uno.ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.ejercicio14.DateLapse;

public class PoliticaTest {
	private Politica p1;
	private Politica p2;
	private DateLapse f1;
	private DateLapse f2;
	private DateLapse f3;
	
	@BeforeEach
	public void setUp () {
		p1 = new Politica ("Moderada");
		p2 = new Politica ("Flexible");
		f1 = new DateLapse (LocalDate.of(2024, 11, 01), LocalDate.of(2024, 11, 05));
		f2 = new DateLapse (LocalDate.of(2024, 11, 8), LocalDate.of(2024, 11, 17));
		f3 = new DateLapse (LocalDate.of(2024, 11, 01), LocalDate.of(2024, 11, 05));
	}
	
	@Test
	public void calcularReembolsoFlexibleTest () {
		assertEquals(4000.0,p2.calcularReembolso(f1, 1000));
	}
	
	@Test
	public void calcularReembolsoModerado7Test () {
		assertEquals(9000.0,p1.calcularReembolso(f2, 1000));
	}
	
	@Test
	public void calcularReembolsoModerado2Test () {
		assertEquals(2000.0,p1.calcularReembolso(f3, 1000));
	}
}
