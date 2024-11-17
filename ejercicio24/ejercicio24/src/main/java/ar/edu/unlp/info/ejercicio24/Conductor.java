package ar.edu.unlp.info.ejercicio24;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Conductor extends Usuario{
	private Vehiculo vehiculo;
	
	public Conductor(String nombre, double saldo) {
		super(nombre, saldo);
	}

	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}


	@Override
	public void descontarSaldo(double monto) {
		double total = monto + (this.vehiculo.getValorMercado() * 0.1);
		this.setSaldo(this.getSaldo() - total);
		
	}

	@Override
	public void cargarSaldo(double monto) {
		this.setSaldo(this.getSaldo() + monto);
		if (this.vehiculo.getAnioFabricacion().until(LocalDate.now(), ChronoUnit.YEARS) > 5)
			this.setSaldo(this.getSaldo() * 0.99);
		else 
			this.setSaldo(this.getSaldo() * 0.9);
		
	}

}
