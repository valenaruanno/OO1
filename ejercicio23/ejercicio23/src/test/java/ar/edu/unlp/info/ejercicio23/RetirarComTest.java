package ar.edu.unlp.info.ejercicio23;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RetirarComTest {
private RetirarCom rc;
	
	@BeforeEach
	public void setUp () {
		rc= new RetirarCom ();
	}
	
	@Test 
	public void calcularCostoTest () {
		assertEquals (0, rc.calcularCosto());
	}
}
