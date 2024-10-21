package ar.edu.unlp.objetos.uno.ejercicio12;

public class PrismaRectangular extends Pieza{
	int ladoMayor;
	int ladoMenor;
	int altura;
	public PrismaRectangular(String material, String color, int ladoMayor, int ladoMenor, int altura) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	
	
	public int getLadoMayor() {
		return ladoMayor;
	}


	public void setLadoMayor(int ladoMayor) {
		this.ladoMayor = ladoMayor;
	}


	public int getLadoMenor() {
		return ladoMenor;
	}


	public void setLadoMenor(int ladoMenor) {
		this.ladoMenor = ladoMenor;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public double volumen() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}


	@Override
	public double superficie() {
		return 2 * ((this.ladoMayor * this.ladoMenor) + (this.ladoMayor * this.altura) + (this.ladoMenor * this.altura));
	}


	@Override
	public double volumenDeMateral(String material) {
		// TODO Auto-generated method stub			//Por que??
		return 0;
	}
	
	
}
