package ar.edu.unlp.info.ejercicio23;

public class SeisCuotas implements FormaPago {

	@Override
	public double calcularCosto(double precio) {
		return precio * 1.20;
	}

}
