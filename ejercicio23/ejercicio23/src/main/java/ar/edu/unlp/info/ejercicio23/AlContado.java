package ar.edu.unlp.info.ejercicio23;

public class AlContado implements FormaPago {

	@Override
	public double calcularCosto(double precio) {
		return precio;
	}

}
