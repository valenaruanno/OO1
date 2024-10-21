package ar.edu.unlp.info.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmail {
	private Email email;
	
	@BeforeEach
	void setUp() {
		email = new Email ("Resumen", "Hola soy el resumen");
		Archivo a1 = new Archivo ("r1");
		Archivo a2 = new Archivo ("r2");
		email.añadirArchivo(a1);
		email.añadirArchivo(a2);
	}
	
	@Test
	void testTamaño() {
		assertEquals(30,this.email.tamaño());
	}
}
