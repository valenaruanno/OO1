package ar.edu.unlp.info.ejercicio24;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pasajero extends Usuario {
	public Pasajero(String nombre, double saldo) {
		super(nombre, saldo);
		// TODO Auto-generated constructor stub
	}

	private boolean viajoEnElPasado () {
		return this.getViajes().stream().filter(v -> v.getFecha().isBefore(LocalDate.now())).count() > 0;
	}
	@Override
	public void descontarSaldo(double monto) {
		double total = monto;
		if (this.viajoEnElPasado())
			total += 500;
		this.setSaldo(this.getSaldo() - total);
		
	}

	private boolean viajoEnLosUltimosTreinta() {
		return this.getViajes().stream().filter(v-> v.getFecha().until(LocalDate.now(), ChronoUnit.DAYS) > 30).count() > 0;
	}
	@Override
	public void cargarSaldo(double monto) {
		this.setSaldo(this.getSaldo() + monto);
		if (!this.viajoEnLosUltimosTreinta())
			this.setSaldo(this.getSaldo() * 0.9);
	}

}
