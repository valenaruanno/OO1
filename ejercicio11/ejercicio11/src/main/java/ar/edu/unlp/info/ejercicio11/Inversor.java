package ar.edu.unlp.info.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones = new ArrayList<>();
	
	public Inversor() {
		super();
	}

	public Inversor(String nombre, List<Inversion> inversiones) {
		this.nombre = nombre;
		this.inversiones.addAll(inversiones);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Inversion> getInversiones() {
		return inversiones;
	}

	public void setInversiones(List<Inversion> inversiones) {
		this.inversiones = inversiones;
	}
	
	public Inversion getInversion (int pos) {
		return this.inversiones.get(pos);
	}
	
	public void setInversion (Inversion inv) {
		this.inversiones.add(inv);
	}
	
	public void addInversion (Inversion inv) {
		inversiones.add(inv);
	}
	public double valorActual() {
		return inversiones.stream().mapToDouble(inv -> inv.valorActual()).sum();
	}
	
}
