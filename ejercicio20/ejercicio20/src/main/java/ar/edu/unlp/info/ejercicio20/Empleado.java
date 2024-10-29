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
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCuil() {
		return cuil;
	}


	public void setCuil(String cuil) {
		this.cuil = cuil;
	}


	public LocalDate getNacimiento() {
		return nacimiento;
	}


	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}


	public boolean isaCargoHijo() {
		return aCargoHijo;
	}


	public void setaCargoHijo(boolean aCargoHijo) {
		this.aCargoHijo = aCargoHijo;
	}


	public boolean isaCargoConjugue() {
		return aCargoConjugue;
	}


	public void setaCargoConjugue(boolean aCargoConjugue) {
		this.aCargoConjugue = aCargoConjugue;
	}


	public List<Contrato> getContratos() {
		return contratos;
	}


	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}


	public List<Recibo> getRecibos() {
		return recibos;
	}


	public void setRecibos(List<Recibo> recibos) {
		this.recibos = recibos;
	}


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

	public Contrato getContratoActivo () {
		return this.contratos.stream().filter(c -> c.estaVigente()).findFirst().orElse(null);
	}
}
