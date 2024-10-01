package ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.ejercicio11.InversionEnAcciones;
import ar.edu.unlp.info.ejercicio11.PlazoFijo;

public class PlazoFijoTest {
	private PlazoFijo plazo;
	
	@BeforeEach
	void setUp() throws Exception{
		plazo = new PlazoFijo (100,0.10);
	}

	@Test
	void testValorActual () {
		assertEquals(100,plazo.valorActual());
	}
	
	@Test
	void testCalcularIntereses () {
		assertEquals(0.0,plazo.calcularIntereses());
	}
}
