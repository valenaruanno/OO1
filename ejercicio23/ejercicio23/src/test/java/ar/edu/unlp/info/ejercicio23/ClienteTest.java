package ar.edu.unlp.info.ejercicio23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.ejercicio21.BagImpl;

public class ClienteTest {
	private Cliente cli;
	private Producto pro;
	private EnvioEx ex;
	private AlContado c;
	
	@BeforeEach 
	public void setUp () {
		cli = new Cliente ("Abril", "1 y 54");
		pro = new Producto ("banana", "verdura", 150, 10);
	}
	
	@Test
	public void crearPedidoConStockTest() {
		assertTrue(cli.crearPedido(c, ex, pro, 10));
	}
	
	@Test
	public void crearPedidoSinStockTest() {
		assertFalse(cli.crearPedido(c, ex, pro, 15));
	}
	
	@Test
	public void conocerCantidadPorCategoria() {
		BagImpl<String> map = new BagImpl<String>();
		map.add("verdura");
		cli.crearPedido(c, ex, pro, 10);
		assertTrue(map.containsAll(cli.cantProdPedidosPorCategoria()) && cli.cantProdPedidosPorCategoria().containsAll(map));
	}
	
	@Test
	public void conocerCantidadPorCategoriaNull() {
		cli.crearPedido(c, ex, pro, 15);
		assertNull(cli.cantProdPedidosPorCategoria());
	}
}
