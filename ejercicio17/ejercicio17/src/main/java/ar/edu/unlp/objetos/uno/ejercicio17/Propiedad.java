package ar.edu.unlp.objetos.uno.ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.ejercicio14.DateLapse;

public class Propiedad {
	private String nombre;
	private String direccion;
	private Double precio;
	private Politica politica;
	private List<Reserva> reservas;
	
	
	public Propiedad(String nombre, String direccion, Double precio, String politica) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.precio = precio;
		this.politica = new Politica (politica);
		this.reservas = new ArrayList<Reserva> ();
	}
	
	public boolean crearReserva (LocalDate inicial, LocalDate finalR) {
		if (disponibilidad(inicial, finalR)) {
			Reserva nueva = new Reserva (inicial, finalR);
			this.reservas.add(nueva);
			return true;
		} else
			return false;
	}
	
	public boolean cancelarReserva (LocalDate inicial, LocalDate finalR) {
		if ((LocalDate.now().isBefore(inicial)) || (LocalDate.now().isAfter(finalR))) {
			DateLapse lapso = new DateLapse (inicial, finalR);
			reservas.remove(lapso);
			System.out.println("El monto de reembolso es de $" + politica.calcularReembolso(lapso, this.precio));
			return true;
		} else
			return false;
	}
	
	/*public boolean disponibilidad (LocalDate inicial, LocalDate finalR) {
		if (reservas.isEmpty())
			return true;
		else
			return reservas.stream().noneMatch(reserva -> reserva.getDuracion().includesDate(inicial) || reserva.getDuracion().includesDate(finalR));
	}*/
	
	public boolean disponibilidad (LocalDate inicial, LocalDate finalR) {
		return reservas.stream().noneMatch(r -> r.getDuracion().getFrom().isBefore(inicial) || r.getDuracion().getTo().isAfter(finalR));
	}
	
	public double calcularMisReservas (LocalDate inicio, LocalDate finalR) {
		return reservas.stream().filter(r -> r.getDuracion().includesDate(inicio) && r.getDuracion().includesDate(finalR)).mapToDouble(r -> r.getDuracion().sizeInDays() * this.precio).sum();
	}
}
