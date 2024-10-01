package ar.edu.unlp.objetos.uno.ejercicio12;

public class Cilindro extends Pieza{
	int radio;
	int altura;
	
	public Cilindro(String material, String color, int radio, int altura) {
		super(material, color);
		this.radio = radio;
		this.altura = altura;
	}
	
	
	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	@Override
	public double volumen() {
		return Math.PI * (Math.pow(this.radio, this.radio)) * this.altura;
	}

	@Override
	public double superficie() {
		return (2 * Math.PI * this.radio * this.altura) + (2 * Math.PI * (Math.pow(this.radio,this.radio)));
	}
	
	
}
