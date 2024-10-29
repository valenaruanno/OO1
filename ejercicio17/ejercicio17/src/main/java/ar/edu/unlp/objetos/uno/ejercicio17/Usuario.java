package ar.edu.unlp.objetos.uno.ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private int dni;
	private List<Propiedad> propiedades;
	private List <Reserva> reservas;
	
	public Usuario(String nombre, String direccion, int dni) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.propiedades = new ArrayList<Propiedad> ();
		this.reservas = new ArrayList<Reserva> ();
	}
	
	public void agregarPropiedad (Propiedad propiedad) {
		propiedades.add(propiedad);
	}
	public double calcularIngresos (LocalDate inicial, LocalDate finalR){
		double total = propiedades.stream().mapToDouble(p -> p.calcularMisReservas(inicial, finalR)).sum();
		return total * 0.75;
	}
}
