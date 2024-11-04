package ar.edu.unlp.info.ejercicio20;

import java.time.LocalDate;

public class DePlanta extends Contrato{
	private double sueldoMensual;
	private double montoPorHijo;
	private double montoPorConjugue;
	
	
	public DePlanta(LocalDate inicio, double sueldoMensual, double montoPorHijo, double montoPorConjugue) {
		super(inicio);
		this.sueldoMensual = sueldoMensual;
		this.montoPorHijo = montoPorHijo;
		this.montoPorConjugue = montoPorConjugue;
	}


	
	public double getSueldoMensual() {
		return sueldoMensual;
	}



	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}



	public double getMontoPorHijo() {
		return montoPorHijo;
	}



	public void setMontoPorHijo(double montoPorHijo) {
		this.montoPorHijo = montoPorHijo;
	}



	public double getMontoPorConjugue() {
		return montoPorConjugue;
	}



	public void setMontoPorConjugue(double montoPorConjugue) {
		this.montoPorConjugue = montoPorConjugue;
	}



	public double calcularMonto(boolean conyugue, boolean hijo) {
		double monto = this.sueldoMensual;
		if (conyugue)
			monto += this.montoPorConjugue;
		if (hijo)
			monto += this.montoPorHijo;
		return monto;
	}

	public boolean estaVigente () {
		return true;
	}

}
