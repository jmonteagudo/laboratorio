package ar.edu.unlam.herencia;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaEmpleados {

	@Test
	public void queSePuedaInstanciarUnIngeniero() {
		Ingeniero ingeniero = new Ingeniero("Andres", "Borgeat", 1000.0, "01/10/1993");
		
		assertEquals(1200.0, ingeniero.getConceptoParaLaProductividad().doubleValue(), 0.01);
		
	}
	
	@Test
	public void queSePuedaInstanciarUnGerente() {
		Integer cochera = 4;
		
		Gerente gerente = new Gerente("Andres", "Borgeat", 1000.0, "01/10/1993", cochera);
		
		assertEquals(4, gerente.getCochera().intValue());
		
	}
	
	@Test
	public void queSePuedaInstanciarUnVendedor() {
		Empleado vendedor = new Empleado("Juan", "Monteagudo", 500.0, "01/10/1979");
		
		assertEquals("Juan", vendedor.getNombre());
		
	}
}
