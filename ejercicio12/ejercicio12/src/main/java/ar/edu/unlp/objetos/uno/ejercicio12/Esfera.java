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
		return (4/3) * Math.PI * (Math.pow(this.radio, this.radio) * this.radio);
	}
	
	public double superficie () {
		return 4 * Math.PI * (Math.pow(this.radio, this.radio));
	}
}
