package ar.edu.unlp.info.ejercicio20;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PorHoras extends Contrato{
	private LocalDate fin;
	private double valorPorHora;
	private int horasPorMes;
	
	public PorHoras(LocalDate inicio, LocalDate fin, double valorPorHora, int horasPorMes) {
		super(inicio);
		this.fin = fin;
		this.valorPorHora = valorPorHora;
		this.horasPorMes = horasPorMes;
	}

	
	
	public LocalDate getFin() {
		return fin;
	}



	public void setFin(LocalDate fin) {
		this.fin = fin;
	}



	public double getValorPorHora() {
		return valorPorHora;
	}



	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}



	public int getHorasPorMes() {
		return horasPorMes;
	}



	public void setHorasPorMes(int horasPorMes) {
		this.horasPorMes = horasPorMes;
	}



	public double calcularMonto(boolean coyugue, boolean hijo) {
		return this.valorPorHora * this.horasPorMes;
	}
	
	public boolean estaVigente () {
		return LocalDate.now().isBefore(fin);
	}
	
	
}
