package ar.edu.unlp.info.ejercicio13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class ClienteDeCorreo {
	List<Carpeta> carpetas;

	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta> ();
	}
	
	
	public void addCarpeta (Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	
	public Email buscar (String texto) {
		return this.carpetas.stream().map(c -> c.buscar(texto)).filter(Objects::nonNull).findFirst().orElse(null);
	}
	
	public int espacioOcupado () {
		return this.carpetas.stream().mapToInt(c -> c.espacioOcupado()).sum();
	}
	public abstract void recibir (Email email);
	
	public int cantidadTotalEmails () {
		return this.carpetas.stream().mapToInt(c -> c.cantidadEmails()).sum();
	}
}
