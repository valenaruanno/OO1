package ar.edu.unlp.info.ejercicio13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
	
	public int cantidadEmails () {
		return this.listaEmails.size();
	}
	
	private String categorizar (Email email) {
		if (email.tamaño() > 0 && email.tamaño() <= 300)
			return "Pequeño";
		else {
			if (email.tamaño() > 300 && email.tamaño() <= 500)
				return "Mediano";
			else 
				return "Grande";
		}
	}
	
	public Map<String, Integer> cantidadPorCategoria (){
		Map<String, Integer> mailCate = new HashMap<>();
		mailCate.put("Pequeño", 0);
		mailCate.put("Mediano", 0);
		mailCate.put("Grande", 0);
		this.listaEmails.stream().forEach(e -> mailCate.put(categorizar(e), mailCate.get(categorizar(e) + 1)));
		return mailCate;
	}
}
