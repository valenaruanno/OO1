package ar.edu.unlp.info.ejercicio20;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private String nombre;
	private String apellido;
	private String cuil;
	private LocalDate nacimiento;
	private boolean aCargoHijo;
	private boolean aCargoConjugue;
	private List<Contrato> contratos = new ArrayList<Contrato> ();
	private List<Recibo> recibos;
	
	
	public Empleado(String nombre, String apellido, String cuil, LocalDate nacimiento, boolean aCargoHijo,
			boolean aCargoConjugue, Contrato contrato) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.nacimiento = nacimiento;
		this.aCargoHijo = aCargoHijo;
		this.aCargoConjugue = aCargoConjugue;
		this.contratos.add(contrato);
		this.recibos = new ArrayList <Recibo> ();
	}

	
}
