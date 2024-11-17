package ar.edu.unlp.info.ejercicio23;

public class Producto {
	private String nombreP;
	private String categoria;
	private double precio;
	private int stock;
	
	public Producto(String nombreP, String categoria, double precio, int stock) {
		super();
		this.nombreP = nombreP;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
