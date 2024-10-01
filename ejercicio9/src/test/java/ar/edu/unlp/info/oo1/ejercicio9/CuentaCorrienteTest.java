package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	private CuentaCorriente cC;
	private CajaDeAhorro cA = new CajaDeAhorro ();
	
	@BeforeEach
	void setUp() throws Exception {
		this.cC = new CuentaCorriente ();
		this.cC.setSaldo(100);
	}
	
	
	@Test
	void testPuedeExtraer () {
		assertTrue(cC.puedeExtraer(30));
	}
	
	@Test
	void testExtraerSinControlar () {
		this.cC.extraerSinControlar(50);
		assertEquals(100,this.cC.getSaldo());
	}
	
	@Test 
	void testExtraer() {
		assertFalse(this.cC.extraer(101));
	}
	
	@Test 
	void testTransferir () {
		assertTrue(this.cC.transferirACuenta(90, cA));
	}
	
}
