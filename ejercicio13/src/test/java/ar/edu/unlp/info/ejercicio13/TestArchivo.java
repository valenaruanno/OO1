package ar.edu.unlp.info.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestArchivo {
	private Archivo archivo;
	
	@BeforeEach
	void setUp() {
		archivo = new Archivo ("Hola");
	}
	
	@Test
	void testTamaño() {
		assertEquals(4,this.archivo.tamaño());
	}
}
