package ar.edu.unlp.info.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
	private String descripcion;
	private int capacidad;
	private LocalDate anioFabricacion;
	private double valorMercado;
	private Conductor conductor; 
	private List<Viaje> viajes;
	
	public Vehiculo(String descripcion, int capacidad, LocalDate anioF, double valorMercado, Conductor conductor) {
		super();
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.anioFabricacion = anioF;
		this.valorMercado = valorMercado;
		this.conductor = conductor;
		this.viajes = new ArrayList<Viaje>();
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public LocalDate getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(LocalDate anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public double getValorMercado() {
		return valorMercado;
	}

	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public List<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}

	
	public void altaViaje (String origen, String destino, double costo) {
		Viaje viaje = new Viaje (origen, destino, costo, LocalDate.now(), this);
		this.viajes.add(viaje);
	}
}
