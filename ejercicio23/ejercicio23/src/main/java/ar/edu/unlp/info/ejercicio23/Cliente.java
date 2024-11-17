package ar.edu.unlp.info.ejercicio23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.edu.unlp.info.ejercicio21.BagImpl;

public class Cliente {
	private String nombre;
	private String direccion;
	List<Pedido> pedidos;
	public Cliente(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.pedidos = new ArrayList<Pedido> ();
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
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public boolean crearPedido (FormaPago formaPago, FormaEnvio formaEnvio, Producto p, int cant) {
		if (p.getStock() >= cant) {
			Pedido pedido = new Pedido (p, cant, formaPago, formaEnvio);
			pedidos.add(pedido);
			return true;
		} else 
			return false;
	}
	
	public BagImpl<String> cantProdPedidosPorCategoria (){
		if (!pedidos.isEmpty()) {
			BagImpl<String> map = new BagImpl<String>();
			this.pedidos.stream().forEach(p -> map.add(p.getProducto().getCategoria()));
			return map;
		} else 
			return null;
	}
}
