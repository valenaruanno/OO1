package ar.edu.unlp.objetos.uno.ejercicio12;

public abstract class Pieza extends ReporteConstruccion {
	String material;
	String color;
	
	
	public Pieza(String material, String color) {
		super();
		this.material = material;
		this.color = color;
	}
	
	
	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double volumenDeMaterial (String material) {
		return 0;
	}
	public double superficieDeColor(String color) {
		return 0;
	}
	
	public abstract double volumen();
	public abstract double superficie();
}
