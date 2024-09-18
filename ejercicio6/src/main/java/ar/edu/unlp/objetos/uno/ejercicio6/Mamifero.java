package ar.edu.unlp.objetos.uno.ejercicio6;

import java.util.Date;

public class Mamifero {
	private String identificador;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	public Mamifero (String identificador) {
		this.identificador = identificador;
	}
	
	public Mamifero () {
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.madre != null && (this.madre.getPadre() != null))
			return this.madre.getPadre();
		else 
			return null;
	}

	public Mamifero getAbuelaMaterna() {
		if (this.madre != null && (this.madre.getMadre() != null))
			return this.madre.getMadre();
		else 
			return null;
	}

	public Mamifero getAbueloPaterno() {
		if (this.padre != null && (this.padre.getPadre() != null))
			return this.padre.getPadre();
		else 
			return null;
	}

	public Mamifero getAbuelaPaterna() {
		if (this.padre != null && (this.padre.getMadre() != null))
			return this.padre.getMadre();
		else 
			return null;
	}

	public boolean tieneComoAncestroA (Mamifero unMamifero) {
		boolean tiene = false;
		if (this.padre != null) {
			if ((this.padre == unMamifero) || (this.getAbuelaPaterna() == unMamifero) || (this.getAbueloPaterno() == unMamifero))
				tiene = true;
		}
		if ((tiene == false) && (this.madre != null)) {
			if ((this.madre == unMamifero) || (this.getAbuelaMaterna() == unMamifero) || (this.getAbueloMaterno() == unMamifero))
				tiene = true;
		}
		return tiene;
	}
	
}
