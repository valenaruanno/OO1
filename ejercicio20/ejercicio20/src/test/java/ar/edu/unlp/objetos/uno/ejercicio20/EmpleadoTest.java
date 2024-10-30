package ar.edu.unlp.objetos.uno.ejercicio20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.ejercicio20.Contrato;
import ar.edu.unlp.info.ejercicio20.DePlanta;
import ar.edu.unlp.info.ejercicio20.Empleado;
import ar.edu.unlp.info.ejercicio20.PorHoras;

public class EmpleadoTest {
	private Empleado empleadoHoras;
	private Empleado empleadoPlanta;
	private PorHoras contratoHoras;
	private PorHoras contratoHorasActivo;
	private DePlanta contratoPlantas;
	private List<Contrato> contratosFabio;
	private List<Contrato> contratosValen;
	
	@BeforeEach
	public void setUp() {
		empleadoHoras = new Empleado("Fabio", "Torrejon", "5-45478924-10", LocalDate.of(2004, 02, 10), false, false);
		empleadoPlanta = new Empleado("valen", "Torrejon", "5-45478924-10", LocalDate.of(2004, 02, 10), false, false);
		contratosFabio = new ArrayList<>();
		contratosValen = new ArrayList<>();
	}
	
	
	@Test
	public void calcularContratosFabio() {
		contratoHoras = new PorHoras(LocalDate.of(2024, 02, 25), LocalDate.of(2024, 03, 29), 500, 50);
		contratoHorasActivo = new PorHoras(LocalDate.of(2024, 02, 25), LocalDate.of(2024, 12, 25), 500, 50);
		empleadoHoras.agregarContrato(contratoHoras);
		empleadoHoras.agregarContrato(contratoHorasActivo);
		assertEquals(contratoHorasActivo, empleadoHoras.getContratoActivo());
	}
	
	@Test
	public void calcularContratosValen() {
		contratoHoras = new PorHoras(LocalDate.of(2024, 02, 25), LocalDate.of(2024, 03, 29), 500, 50);
		contratoPlantas = new DePlanta(LocalDate.of(2024, 03, 29), 500, 50, 30);
		empleadoPlanta.agregarContrato(contratoHoras);
		empleadoPlanta.agregarContrato(contratoPlantas);
		assertEquals(contratoPlantas, empleadoPlanta.getContratoActivo());
	}
}
