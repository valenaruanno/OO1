package ar.edu.unlp.info.ejercicio20;

import java.time.LocalDate;

public class Recibo {
	private Empleado e1;
	private LocalDate fechaActual;
	
	public Recibo(Empleado empleado) {
		this.e1 = empleado;
		this.fechaActual = LocalDate.now();
	}
	
	public double calcularMonto () {
		Contrato contratoActivo = e1.getContratoActivo();
		int duracionContrato = contratoActivo.calcularDuracion();
		System.out.println(duracionContrato + " Duracion");
		double monto = contratoActivo.calcularMonto();
		System.out.println(monto + " Monto");
		if (duracionContrato >= 5)
			monto *= 1.30;
		else {
			if (duracionContrato >= 10)
				monto *= 1.50;
			else {
				if (duracionContrato >= 15)
					monto *= 1.70;
				else {
					if (duracionContrato >= 20)
						monto += monto;
				}
			}
		}
		return monto;
	}
	
	public void generarRecibo () {
	        System.out.println("Recibo de Sueldo");
	        System.out.println("Nombre: " + e1.getNombre());
	        System.out.println("Apellido: " + e1.getApellido());
	        System.out.println("CUIL: " + e1.getCuil());
	        System.out.println("Antigüedad: " + e1.getContratoActivo().calcularDuracion() + " años");
	        System.out.println("Fecha: " + fechaActual);
	        System.out.println("Monto Total: $" + calcularMonto());
	}
}
