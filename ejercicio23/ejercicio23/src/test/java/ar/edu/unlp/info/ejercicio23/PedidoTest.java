package ar.edu.unlp.info.ejercicio23;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
	private Pedido p;
	private Producto p1;
	private SeisCuotas seis;
	private AlContado contado;
	private RetirarCom rc;
	private RetirarCorreo rco;
	private EnvioEx re;
	
	@BeforeEach
	public void setUp () {
		p1= new Producto ("Banana", "verdura", 100, 15);
		seis = new SeisCuotas();
		contado = new AlContado ();
		rc = new RetirarCom ();
		rco = new RetirarCorreo();
		re = new EnvioEx ();
	}
	
	@Test 
	public void calcularContadoRetirarCorreoTest() {
		Pedido p = new Pedido (p1, 15, contado, rco);
		assertEquals (4500, p.calcularCostoTotal());
	}
	
	@Test
	public void calcularContadoRetirarComTest() {
		Pedido p = new Pedido (p1, 15, contado, rc);
		assertEquals (1500, p.calcularCostoTotal());
	}
	@Test
	public void calcularContadoEnvioExTest() {
		Pedido p = new Pedido (p1, 15, contado, re);
		assertEquals (1550, p.calcularCostoTotal());
	}
	
	@Test
	public void calcularSeisCuotasRetirarCorreoTest() {
		Pedido p = new Pedido (p1, 15, seis, rco);
		assertEquals (4800, p.calcularCostoTotal());
	}
	
	@Test
	public void calcularSeisCuotasRetirarComTest() {
		Pedido p = new Pedido (p1, 15, seis, rc);
		assertEquals (1800, p.calcularCostoTotal());
	}
	
	@Test
	public void calcularSeisCuotasEnvioExTest() {
		Pedido p = new Pedido (p1, 15, seis, re);
		assertEquals (1850, p.calcularCostoTotal());
	}
}
