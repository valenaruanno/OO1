package ar.edu.unlp.objetos.uno.ejercicio17;

import java.time.LocalDate;

import ar.edu.unlp.info.ejercicio14.DateLapse;


public class Reserva {
	private DateLapse duracion;

	public Reserva(LocalDate from, LocalDate to) {
		this.duracion = new DateLapse(from, to);
	}

	public DateLapse getDuracion() {
		return duracion;
	}

	public void setDuracion(DateLapse duracion) {
		this.duracion = duracion;
	}
	
	public double calcularPrecio (double precio) {
		return duracion.sizeInDays() * precio;
	}
}
