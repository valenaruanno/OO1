package ar.edu.unlp.info.ejercicio23;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RetirarCorreoTest {
private RetirarCorreo rc;
	
	@BeforeEach
	public void setUp () {
		rc = new RetirarCorreo ();
	}
	
	@Test 
	public void calcularCostoTest () {
		assertEquals (3000, rc.calcularCosto());
	}
}
