package ar.edu.unlp.objetos.uno.ejercicio5;

public class Cuerpo3D {
	private double altura;
	private Cara caraBasal;
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(Cara caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen () {
		return this.caraBasal.getArea() * this.altura;
	}
	
	public double getSuperficieExterior () {
		return (this.caraBasal.getPerimetro() * this.altura) + (2 * this.caraBasal.getArea());
	}
	
}
