package ar.edu.unlp.info.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	List<Archivo> adjuntos;
	
	public Email (String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		adjuntos = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}
	
	public void añadirArchivo (Archivo a) {
		adjuntos.add(a);
	}
	
	public List<Archivo> adjuntos (){
		return this.adjuntos;
	}
	
	public int tamaño () {
		return this.titulo.length() + this.cuerpo.length() + adjuntos.stream().mapToInt(a -> a.tamaño()).sum();
	}
	
	public boolean contieneTexto (String texto) {
		return  ((this.getTitulo().contains(texto)) || (this.getCuerpo().contains(texto)));
	}
}
