package ar.edu.unlp.info.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class mapTest {
	private Map<String, Integer> map;
	
	@BeforeEach
	public void setUp () {
		map = new HashMap <>();
		map.put("Lionel Messi", 111);
		map.put("Gabriel Batistuta", 56);
		map.put("Kun Aguero", 42);
	}
	
	@Test
	public void eliminarTest() {
		assertEquals(42,map.remove("Kun Aguero"));
	}
	
	@Test 
	public void actualizarValor () {
		map.replace("Lionel Messi", 112);
		assertEquals(112,map.get("Lionel Messi"));
	}
	
	@Test 
	public void verificarDuplicado() {
		
	}
	
	@Test
	public void obtenerTotalGoles() {
		assertEquals(209,map.values().stream().mapToInt(Integer::intValue).sum());
		//Del map obtengo los valores ( .values ), les hago un stream y los mapeo a enteros (para cada uno los tengo que convertir
		// Integer::intValue)
	}
}
