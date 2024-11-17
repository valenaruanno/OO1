package ar.edu.unlp.info.ejercicio23;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnvioExTest {
	private EnvioEx ex;
	
	@BeforeEach
	public void setUp () {
		ex = new EnvioEx ();
	}
	
	@Test 
	public void calcularCostoTest () {
		assertEquals (50, ex.calcularCosto());
	}
}
