package ar.edu.unlp.objetos.uno.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteConstruccion {
	private List<Pieza> piezas;
	
	
	public ReporteConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	
	public void addPieza (Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public double volumenDeMateral (String material) {
		return piezas.stream().filter(p -> p.getMaterial().equals(material)).mapToDouble(p -> p.volumen()).sum();
	}
	
	public double superficieDeColor (String color) {
		return piezas.stream().filter(p -> p.getColor().equals(color)).mapToDouble(p -> p.superficie()).sum();
	}
		
}
