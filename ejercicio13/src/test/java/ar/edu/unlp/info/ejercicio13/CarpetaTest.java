package ar.edu.unlp.info.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
	private Carpeta carpeta;
	private Carpeta carpeta2;
	private Email e1;
	private Email e2;
	private Archivo a1;
	private Archivo a2;
	
	@BeforeEach
	void setUp() throws Exception {
		carpeta = new Carpeta ("tp1");
		carpeta2 = new Carpeta ("tp2");
	}
	
	@Test
	void recibirTest () {
		e1 = new Email ("Saludo","Hola");
		e2 = new Email ("Saludo", "Chau");
		carpeta.recibir(e1);
		carpeta2.recibir(e2);
		assertEquals(e1, carpeta.getListaEmails().getFirst());
		assertEquals(e2, carpeta2.getListaEmails().getFirst());
	}
	
	@Test
	void moverTest() {
		carpeta.mover(e1, carpeta2);
		assertEquals (0, carpeta.getListaEmails().size());
		assertEquals (e1, carpeta2.getListaEmails().getLast());
		
	}
	
	@Test
	void buscarTest () {
		assertEquals(e1, carpeta2.buscar("Saludo"));
	}
	
	@Test
	void espacioOcupadoTest () {
		carpeta.recibir(e1);
		assertEquals(10, carpeta.espacioOcupado());
	}
}
