package ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.ejercicio11.InversionEnAcciones;

public class InversionEnAccionesTest {
	private InversionEnAcciones accion;
	
@BeforeEach
void setUp() throws Exception{
	accion = new InversionEnAcciones ("apple",10,100);
}

@Test
void testValorActual () {
	assertEquals(1000,accion.valorActual());
}
}
