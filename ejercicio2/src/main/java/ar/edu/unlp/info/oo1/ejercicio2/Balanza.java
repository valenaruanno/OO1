package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Balanza {
	private int cantidadProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza () {
	     this.cantidadProductos = 0;
	     this.precioTotal = 0;
	     this.pesoTotal = 0;
	}

	public int getCantidadProductos() {
		return cantidadProductos;
	}

	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	public void ponerEnCero () {
		this.cantidadProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
	}
	

	public void agregarProducto (Producto p) {
		this.pesoTotal += p.getPeso();
		this.precioTotal += p.getPrecioPorKilo() * p.getPeso();
		this.cantidadProductos++;
	}
	
	public Ticket emitirTicket () {
		Ticket t = new Ticket (this.cantidadProductos, this.precioTotal, this.pesoTotal);
		return t;
	}
	
}
