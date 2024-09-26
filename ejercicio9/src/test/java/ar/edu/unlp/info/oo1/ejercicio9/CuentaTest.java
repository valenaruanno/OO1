package ar.edu.unlp.info.oo1.ejercicio9;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CuentaTest {
	private CuentaCorriente cC;
	private CajaDeAhorro cA;
	
	@BeforeEach
	void setUp() throws Exception {
		this.cC = new CuentaCorriente ();
		this.cA = new CajaDeAhorro ();
		this.cC.setSaldo(100);
		this.cA.setSaldo(100);
	}
	
	@Test
	void testConstructor (){
		assertEquals(0.0,this.cC.getDescubierto());
	}
	
	@Test
	void testPuedeExtraer () {
		assertTrue(cC.puedeExtraer(30));
	}
	
	@Test
	void testGetSaldo () {
		this.cA.depositar(50);
		this.cC.depositar(50);
		assertEquals (150,this.cA.getSaldo());
		assertEquals (150,this.cC.getSaldo());
	}
	
	@Test
	void testExtraerSinControlar () {
		this.cA.extraerSinControlar(50);
		this.cC.extraerSinControlar(50);
		assertEquals(100,this.cA.getSaldo());
		assertEquals(100,this.cC.getSaldo());
	}
	
	@Test 
	void testExtraer() {
		assertTrue(this.cA.extraer(90));
		assertEquals(8,this.cA.getSaldo());
		assertFalse(this.cC.extraer(101));
	}
	
	@Test 
	void testTransferir () {
		assertFalse(this.cA.transferirACuenta(10, cC));
		assertTrue(this.cC.transferirACuenta(90, cA));
	}
	
}
