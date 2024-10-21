package ar.edu.unlp.objetos.uno.ejercicio12;

public class Esfera extends Pieza {
	int radio;
	
	
	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}

	
	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
	}


	@Override
	public double volumen() {
		return ((4.0/3.0) * Math.PI * (Math.pow(this.radio, 3)));
	}
	
	public double superficie () {
		return 4 * Math.PI * (Math.pow(this.radio, 2));
	}
}
