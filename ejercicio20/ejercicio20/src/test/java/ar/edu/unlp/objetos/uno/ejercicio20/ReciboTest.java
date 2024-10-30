package ar.edu.unlp.objetos.uno.ejercicio20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.ejercicio20.Contrato;
import ar.edu.unlp.info.ejercicio20.DePlanta;
import ar.edu.unlp.info.ejercicio20.Empleado;
import ar.edu.unlp.info.ejercicio20.Recibo;

public class ReciboTest {
	private Recibo r;
	private Empleado e;
	private Contrato c;
	private Contrato c2;
	private Contrato c3;
	private Contrato c4;
	private Contrato c5;
	
	@BeforeEach
	public void setUp () {
		e = new Empleado("valentin", "apellido", "123", LocalDate.of(2004, 10, 13), false, false);
		r = new Recibo (e);
	}
	
	@Test 
	public void calcularMonto5 () {
		c = new DePlanta(LocalDate.of(2019, 10, 28), 500, 0, 0);
		e.agregarContrato(c);
		assertEquals (150,r.calcularMonto());
	}
}
