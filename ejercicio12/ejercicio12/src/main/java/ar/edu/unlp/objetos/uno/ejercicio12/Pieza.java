package ar.edu.unlp.objetos.uno.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public abstract class Pieza extends ReporteConstruccion {
	String material;
	String color;
	List<Pieza> lista;
	
	
	public Pieza(String material, String color) {
		super();
		this.material = material;
		this.color = color;
		lista = new ArrayList();
	}
	
	
	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public void añadirPieza (Pieza pieza) {
		lista.add(pieza);
	}
	
	public abstract double volumen();
	public abstract double superficie();
}
