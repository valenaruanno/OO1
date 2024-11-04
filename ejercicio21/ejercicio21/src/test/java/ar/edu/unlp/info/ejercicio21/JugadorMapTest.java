package ar.edu.unlp.info.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadorMapTest {
	private Map<Jugador, Integer> map;
	private Jugador j1;
	private Jugador j2;
	
	@BeforeEach
	public void setUp () {
		map = new HashMap <>();
		j1 = new Jugador ("Valentin", "Aruanno");
		j2 = new Jugador ("Abril", "Manzur");
		map.put(j1, 10);
		map.put(j2, 3);
	}
	
	@Test
	public void eliminarTest() {
		assertEquals(10,map.remove(j1));
	}
	
	@Test 
	public void actualizarValor () {
		map.replace(j1, 12);
		assertEquals(12,map.get(j1));
	}
	
	@Test 
	public void verificarDuplicado() {
		
	}
	
	@Test
	public void obtenerTotalGoles() {
		assertEquals(13,map.values().stream().mapToInt(Integer::intValue).sum());
		//Del map obtengo los valores ( .values ), les hago un stream y los mapeo a enteros (para cada uno los tengo que convertir
		// Integer::intValue)
	}
}
