package ar.edu.unlp.info.ejercicio23;

public class Pedido {
	private Producto producto;
	private int cantidad;
	private FormaPago formaPago;
	private FormaEnvio formaEnvio;
	
	public Pedido (Producto producto, int cantidad, FormaPago formaPago, FormaEnvio formaEnvio) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.formaPago = formaPago;
		this.formaEnvio = formaEnvio;
	}
	
	
	
	public Producto getProducto() {
		return producto;
	}



	public void setProducto(Producto producto) {
		this.producto = producto;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public FormaPago getFormaPago() {
		return formaPago;
	}



	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}



	public FormaEnvio getFormaEnvio() {
		return formaEnvio;
	}



	public void setFormaEnvio(FormaEnvio formaEnvio) {
		this.formaEnvio = formaEnvio;
	}



	public double calcularCostoTotal () {
		double precio = this.producto.getPrecio() * this.cantidad;
		double total = this.formaPago.calcularCosto(precio);
		total += this.formaEnvio.calcularCosto();
		return total;
	}
}
