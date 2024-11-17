package ar.edu.unlp.info.ejercicio23;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Vendedor(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto> ();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public void addProducto (Producto p) {
		this.productos.add(p);
	}
	
}
