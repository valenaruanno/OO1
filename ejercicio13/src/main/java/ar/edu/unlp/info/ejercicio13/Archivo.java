package ar.edu.unlp.info.ejercicio13;

public class Archivo {
	private String nombre;
	
	
	public Archivo (String nombre) {
		this.nombre = nombre;
	}
	
	public int tamaño () {
		return this.nombre.length();
	}
}
