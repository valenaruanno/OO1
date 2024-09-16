package ar.edu.unlp.objetos.uno.ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Balanza {
	private List<Producto> balanza = new LinkedList<Producto> ();

	public Balanza() {
		
	}
	
	public void ponerEnCero () {
		this.balanza.clear();
	}
	
	public void agregarProducto (Producto p) {
		this.balanza.add(p);
	}
	
	public double getPesoTotal () {
		return balanza.stream().mapToDouble(producto -> producto.getPeso()).sum();
	}
	
	public double getPrecioTotal () {
		return balanza.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}
	
	public int getCantidadProductos () {
		return balanza.size();
	}
	
	public Ticket emitirTicket () {
		double pesoTotal = this.getPesoTotal();
		double precioTotal = this.getPrecioTotal();
		Ticket t = new Ticket (this.getCantidadProductos(), pesoTotal, precioTotal);
		return t;
	}
}
