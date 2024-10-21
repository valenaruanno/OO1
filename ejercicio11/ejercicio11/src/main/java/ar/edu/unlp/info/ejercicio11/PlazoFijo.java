package ar.edu.unlp.info.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresesDiarios;
	
	
	public PlazoFijo(double monto, double porcentajeDeInteresesDiarios) {
		this.fechaDeConstitucion = LocalDate.now();
		this.porcentajeDeInteresesDiarios = porcentajeDeInteresesDiarios;
		this.montoDepositado = monto;
	}

	

	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}



	public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
	}



	public double getMontoDepositado() {
		return montoDepositado;
	}



	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}



	public double getPorcentajeDeInteresesDiarios() {
		return porcentajeDeInteresesDiarios;
	}



	public void setPorcentajeDeInteresesDiarios(double porcentajeDeInteresesDiarios) {
		this.porcentajeDeInteresesDiarios = porcentajeDeInteresesDiarios;
	}


	public double calcularIntereses() {
	        long dias = ChronoUnit.DAYS.between(fechaDeConstitucion, LocalDate.now());
	        return dias * this.porcentajeDeInteresesDiarios; 
	}

	public double valorActual() {
		return (this.getMontoDepositado() + (this.getMontoDepositado() * this.calcularIntereses()));
	}
	
	
}
