package ar.edu.unlp.info.ejercicio24;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
	private String origen;
	private String destino;
	private double costo;
	private LocalDate fecha;
	private Vehiculo vehiculo;
	private List<Usuario> usuarios;
	
	public Viaje(String origen, String destino, double costo, LocalDate fecha, Vehiculo vehiculo) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.costo = costo;
		this.fecha = fecha;
		this.vehiculo = vehiculo;
		this.usuarios = new ArrayList<Usuario> ();
		this.usuarios.add(this.vehiculo.getConductor());
		this.vehiculo.getConductor().addViaje(this);
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public boolean registrarUsuario (Pasajero p) {
		LocalDate hoy = LocalDate.now();
		if ((this.usuarios.size() < this.vehiculo.getCapacidad()) && (hoy.until(this.fecha, ChronoUnit.DAYS) >= 2) && (p.getSaldo() > 0)) {
			this.usuarios.add(p);
			p.addViaje(this);
			return true;
		} else 
			return false;
	}
	
	public void procesarViaje () {
		double montoApagar = this.costo / this.usuarios.size();
		this.usuarios.stream().forEach(u -> u.descontarSaldo(montoApagar));
	}
}
