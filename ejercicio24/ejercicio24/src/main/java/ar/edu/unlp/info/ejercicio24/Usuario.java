package ar.edu.unlp.info.ejercicio24;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
	private String nombre;
	private double saldo;
	private List<Viaje> viajes;
	
	public Usuario(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		viajes = new ArrayList<Viaje> ();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void addViaje (Viaje viaje) {
		this.viajes.add(viaje);
	}
	public List<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}

	public abstract void descontarSaldo(double monto);
	public abstract void cargarSaldo (double monto);
}
