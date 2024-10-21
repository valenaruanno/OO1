package ar.edu.unlp.info.ejercicio13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Carpeta extends ClienteDeCorreo {
	private String nombre;
	private List<Email> listaEmails;
	
	public Carpeta (String nombre) {
		this.nombre = nombre;
		listaEmails = new ArrayList<Email>();
	}

	public String getNombre() {
		return nombre;
	}
	
	
	public List<Email> getListaEmails() {
		return listaEmails;
	}

	public void mover (Email email, Carpeta destino) {
		destino.recibir(email);
		this.listaEmails.remove(email);
	}
	
	public void recibir (Email email) {
		this.listaEmails.add(email);
	}
	
	public Email buscar (String texto) {
		return this.listaEmails.stream().filter(e -> e.contieneTexto(texto)).findFirst().orElse(null);
	}
	
	public int espacioOcupado () {
		return this.listaEmails.stream().mapToInt(e -> e.tamaño()).sum();
	}
}
