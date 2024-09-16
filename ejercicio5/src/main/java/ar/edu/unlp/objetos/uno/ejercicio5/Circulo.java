package ar.edu.unlp.objetos.uno.ejercicio5;

public class Circulo implements Cara {
	private double diametro;
	private double radio;
	
	public Circulo() {

	}
	
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
		this.diametro = this.radio * 2;
	}
	
	public double getArea() {
		return Math.PI * (this.radio * this.radio);
	}
	public double getPerimetro() {
		return 2 * Math.PI * this.radio;
	}
	
	
}
