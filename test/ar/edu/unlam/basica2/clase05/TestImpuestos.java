package ar.edu.unlam.basica2.clase05;

import static org.junit.Assert.*;

import java.util.Date;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

public class TestImpuestos {

	@Test
	public void testQueVerificarElImpuestoDeUnGerente() {
//		ServicioImpuesto impSvc = new ServicioImpuesto ();
//	
//		@SuppressWarnings("deprecation")
//		
//		Gerente gerente = new Gerente("Juan", 5000.0, new Date(1991,05,03), 1, "Informatica");
//		Double impuesto = impSvc.obtenerImpuesto(gerente);
//		Assert.assertEquals(500.0, impuesto, 0.01);

	}
	@Test
	public void testQueVerificarElImpuestoDeUnDirector() {
		ServicioImpuesto impSvc = new ServicioImpuesto ();
	
		Director director = new Director (2,200.0,"juan",100000.0,new Date (1977,10,31),"informatica");
		Double impuesto = impSvc.obtenerImpuesto(director);
		Assert.assertEquals(30000.0, impuesto, 0.01);
	}
	


}
