package ar.edu.unlp.objetos.uno.ejercicio17;

import java.time.LocalDate;

import ar.edu.unlp.info.ejercicio14.DateLapse;

public class Politica {
	private String politica;

	public Politica(String politica) {
		this.politica = politica;
	}

	public String getPolitica() {
		return politica;
	}

	public void setPolitica(String politica) {
		this.politica = politica;
	}
	
	public double calcularReembolso (DateLapse fecha, double precio, int cantDias) {
		double reembolso = 0;
		if ((this.politica.equals("Flexible")) && (fecha.getFrom().isAfter(LocalDate.now()))) {
			reembolso = precio * cantDias;
		} else {
			if (this.politica.equals("Moderada")) {
				int cant = fecha.sizeInDays(LocalDate.now(), fecha.getFrom());
				if (cant >= 7)
					reembolso = precio * cantDias;
				else 
					if (cant >= 2)
						reembolso = (precio * cantDias) / 2;
			} 
		}
		return reembolso;
	}
}