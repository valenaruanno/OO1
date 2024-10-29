package ar.edu.unlp.objetos.uno.ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTets {
	private Usuario u;
	private Propiedad p;
	
	@BeforeEach 
	public void setUp () {
		u = new Usuario ("Valentin","1 y 54", 46004);
		p = new Propiedad ("Casa", "1 y 54", 1000.0, "Flexible ");
	}
	
	@Test
	public void calcularPrecioTest() {
		p.crearReserva(LocalDate.of(2024,10,29), LocalDate.of(2024,11,05));
		u.agregarPropiedad(p);
		assertEquals(5250, u.calcularIngresos(LocalDate.of(2024,10,29), LocalDate.of(2024,11,05)));
	}
}
