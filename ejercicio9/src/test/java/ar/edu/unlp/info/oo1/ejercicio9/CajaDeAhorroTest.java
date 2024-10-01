package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	private CajaDeAhorro cA;
	private CuentaCorriente cC = new CuentaCorriente ();
	
	@BeforeEach
	void setUp() throws Exception {
		this.cA = new CajaDeAhorro ();
		this.cA.setSaldo(100);
	}
	
	@Test
	void testPuedeExtraer () {
		assertTrue(cC.puedeExtraer(30));
	}
	
	
	@Test
	void testExtraerSinControlar () {
		this.cA.extraerSinControlar(50);
		assertEquals(100,this.cA.getSaldo());
	}
	
	@Test 
	void testExtraer() {
		assertTrue(this.cA.extraer(90));
		assertEquals(8,this.cA.getSaldo());
	}
	
	@Test 
	void testTransferir () {
		assertFalse(this.cA.transferirACuenta(10, cC));
	}
	
}
