package ar.edu.unlp.info.ejercicio20;

import java.time.LocalDate;
import java.time.Period;

public abstract class Contrato {
	private LocalDate inicio;

	public Contrato(LocalDate inicio) {
		this.inicio = inicio;
	}
	
	
	public LocalDate getInicio() {
		return inicio;
	}


	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}


	public abstract boolean estaVigente ();
	public abstract double calcularMonto();
	public int calcularDuracion () {
		return Period.between(this.inicio, LocalDate.now()).getYears();
	}
}
