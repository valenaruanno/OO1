package ar.edu.unlp.objetos.uno.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReporteConstruccionTest {
	private ReporteConstruccion r;
	private Cilindro c = new Cilindro ("Metal", "Negro", 5, 10);
	private Esfera e = new Esfera ("Madera", "Roja", 10);
	private PrismaRectangular p = new PrismaRectangular ("Metal", "Azul", 12, 6, 10);
	
	
	@BeforeEach
	void setUp() throws Exception {
		r = new ReporteConstruccion ();
		r.addPieza(e);
		r.addPieza(c);
		r.addPieza(p);
	}
	@Test
	void volumenDeMaterialTest() {
		assertEquals(4188.7, this.r.volumenDeMateral("Madera"), 0.1);
	}
	
	@Test
	void superficieDeColorTest () {
		assertEquals(19949.1, this.r.superficieDeColor("Negro"), 0.1);
	}

}
