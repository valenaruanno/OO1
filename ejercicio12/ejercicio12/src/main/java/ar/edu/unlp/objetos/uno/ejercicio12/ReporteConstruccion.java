package ar.edu.unlp.objetos.uno.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteConstruccion {
	List<Pieza> lista = new ArrayList<>();
	
	
	public  double volumenDeMateral (String material);
	public  double superficieDeColor (String color);
	
	public double getVolumenDeMaterial (String nombreDeMaterial) {
		return lista.stream().filter(p -> p.getMaterial().equals(nombreDeMaterial)).mapToDouble(p -> p.volumen()).sum();
	}
	
	public double getSuperficieDeColor (String unNombreDeColor) {
		return lista.stream().filter(p -> p.getColor().equals(unNombreDeColor)).mapToDouble(p -> p.superficie()).sum();
	}
}
