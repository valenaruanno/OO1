package ejercicio11;

import org.junit.jupiter.api.BeforeEach;

import ar.edu.unlp.info.ejercicio11.InversionEnAcciones;
import ar.edu.unlp.info.ejercicio11.PlazoFijo;

public class testInversor {
	private PlazoFijo plazo;
	private InversionEnAcciones acciones;
	
@BeforeEach
void setUp() throws Exception {
	this.plazo = new PlazoFijo(1000, 10);
	this.acciones = new InversionEnAcciones("aplle", 10, 1000);
}


}
