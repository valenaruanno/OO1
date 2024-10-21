package ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.ejercicio11.Inversion;
import ar.edu.unlp.info.ejercicio11.InversionEnAcciones;
import ar.edu.unlp.info.ejercicio11.Inversor;
import ar.edu.unlp.info.ejercicio11.PlazoFijo;

public class InversorTest {
	private Inversor inv;
	
@BeforeEach
void setUp() throws Exception {
	inv = new Inversor ();
}

@Test
void testValorActual () {
	InversionEnAcciones accion = new InversionEnAcciones ("apple",10,100);
	PlazoFijo plazo = new PlazoFijo (100,0.10);
	inv.addInversion(accion);
	inv.addInversion(plazo);
	assertEquals(1100,inv.valorActual());
}

}
