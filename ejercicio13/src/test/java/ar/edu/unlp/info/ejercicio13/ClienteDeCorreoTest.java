package ar.edu.unlp.info.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {
	ClienteDeCorreoConc cli;
	private Carpeta c1;
	private Email e;
	
	@BeforeEach 
	void setUp() throws Exception{
		cli = new ClienteDeCorreoConc ();
		c1 = new Carpeta ("Palabras");
	}
	
	@Test
	void buscarTest () {
		e = new Email ("Casa", "Una casa es");
		c1.recibir(e);
		cli.addCarpeta(c1);
		assertEquals (e, cli.buscar("Casa"));
	}
	
	@Test 
	void espacioOcupadoTest(){
		assertEquals (15, cli.espacioOcupado());
	}
}
