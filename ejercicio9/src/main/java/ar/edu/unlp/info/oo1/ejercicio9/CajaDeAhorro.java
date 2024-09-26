package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta{

	public double calcularPorcentaje () {
		return this.getSaldo() * 0.2;
	}
	protected boolean puedeExtraer(double monto) {
		if ((this.getSaldo() - monto) > 0) {
			return true;
		}
		return false;
	}
	
	public boolean extraer (double monto) {
		if (this.extraer(monto)) {
			if (this.puedeExtraer(this.calcularPorcentaje())) {
				this.setSaldo(this.getSaldo() - this.calcularPorcentaje());
				return true;
			}
		} 
		return false;
	}
	
	public boolean transferirACuenta (double monto) {
		if (this.puedeExtraer(monto)) {
			this.setSaldo(this.getSaldo () - this.calcularPorcentaje());
			return true;
		}
		return false;
	}
}
