package ar.edu.unlp.objetos.uno.ejercicio12;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EsferaTest {
	Esfera esfera;
	
	@BeforeEach
	void setUp() throws Exception{
		esfera = new Esfera ("Madera", "Roja", 10);
	}
	
	@Test
	void volumenTest() {
		assertEquals(4188.7, this.esfera.volumen(), 0.1);
	}
	
	@Test
	void superficieTest() {
		assertEquals(1256.6, this.esfera.superficie(), 0.1);
	}
}
