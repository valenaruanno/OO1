package ar.edu.unlp.objetos.uno.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CilindroTest {
	Cilindro cilindro;
	
	@BeforeEach
	void setUp() throws Exception{
		cilindro = new Cilindro ("Metal","Negro", 5, 10);
	}
	
	@Test
	void volumenTest () {
		assertEquals(98174.7, this.cilindro.volumen(), 0.1);
	}
	
	@Test
	void superficieTest () {
		assertEquals(19949.113350295185, this.cilindro.superficie());
	}
}
