package ar.edu.unlp.objetos.uno.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrismaRectangularTest {
	PrismaRectangular prisma;
	
	@BeforeEach
	void setUp () throws Exception{
		prisma = new PrismaRectangular ("Hierro", "Azul", 12, 6, 10);
	}
	
	@Test
	void volumenTest () {
		assertEquals (720, this.prisma.volumen());
	}
	
	@Test
	void superficie () {
		assertEquals(504, this.prisma.superficie());
	}
}
