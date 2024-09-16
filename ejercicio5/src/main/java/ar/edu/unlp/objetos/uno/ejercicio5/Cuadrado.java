package ar.edu.unlp.objetos.uno.ejercicio5;

public class Cuadrado implements Cara {
	private double lado;

	
	public Cuadrado() {

	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getPerimetro () {
		return 4 * this.lado;
	}
	
	public double getArea() {
		return (this.lado * this.lado);
	}
}
