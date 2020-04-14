package ar.edu.unlam.basica2.parcial220182c;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;



public class TestStock {
	Stock stock;
	Producto disco1;
	Producto disco2;
	Producto disco3;
	 Mothers mother1;
	 
	
	@Before
	public void init() {
		 stock = new Stock();
		 disco1 = new DiscoRigido(1,1500.00,5,1,500.00);
		 disco2 = new DiscoRigido(2,2000.00,3,2,1000.00);
		 disco3 = new DiscoRigido(3,3000.00,10,1,2000.00);
		 mother1= new Mothers(4, 3500.00, 10,3,6 );
	}

	
	
	@Test
	public void testQueVerificaElIncrementoDePrecioMasivo() throws ProductoDuplicado {
		
		stock.agregarProductos(disco1);
		stock.agregarProductos(disco2);
		stock.agregarProductos(disco3);
	
		Double porcentaje= 10.00;
		stock.incrementarPrecios(porcentaje);
		
		for (Producto producto :stock.getStock()) {
		
			
			if (producto.getId().equals(disco1.getId()))
				assertEquals(1650.00, producto.getPrecio(),0.01);
			if (producto.getId().equals(disco2.getId()))
				assertEquals(2200.00, producto.getPrecio(),0.01);
		}
		
			
	}
	
	@Test(expected=ProductoDuplicado.class)
	public void testQueLanceUnaExcepcionSiAlAgregarElProductoEstaDuplicado() throws ProductoDuplicado {
		stock.agregarProductos(disco1);
		stock.agregarProductos(disco1);
			
	}

	public void TestQueVerificaLaEliminacionDeUnProducto () {
		try {
			stock.agregarProductos(disco1);
			stock.agregarProductos(disco2);
		} catch (ProductoDuplicado e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			stock.eliminarProducto(disco1);
		} catch (ProductoInexistente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
	@Test (expected=ProductoInexistente.class)
	public void testQueAlEliminarUnProductoInexistenteLanzeUnaExcepcion () throws ProductoInexistente {
		try {
			stock.agregarProductos(disco1);
			stock.agregarProductos(disco2);
		} catch (ProductoDuplicado e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		stock.eliminarProducto(disco3);
		
	}
	
	@Test 
	public void TestQueverificaListaDiscoRigido () throws ProductoDuplicado {
		
		
		stock.agregarProductos(disco1);
		stock.agregarProductos(disco2);
		stock.agregarProductos(mother1);
		
		List <DiscoRigido> miLista=stock.obtenerListaDiscoRigido();
		
		assertEquals(2, miLista.size());
		
		for (DiscoRigido disco : miLista) {
			assertTrue(disco instanceof DiscoRigido);
		}
		
	}
	
	@Test 
	public void testQueVErificaQuePuedeDescontarUnidadesDeUnProducto() throws ProductoDuplicado{
		 //disco1 = new DiscoRigido(1,1500.00,5,1,500.00);
		stock.agregarProductos(disco1);
		try {
			stock.descontarProducto(4, 1);
		} catch (CantidadInvalida | SuperaMaximoADescontarException | ProductoInexistente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Test (expected=SuperaMaximoADescontarException.class)
	public void testQueVErificaUnaExcepcionAlDescontarMasUnidadesDeLoPermitido() throws SuperaMaximoADescontarException{
		 //disco1 = new DiscoRigido(1,1500.00,5,1,500.00);
		try {
			stock.agregarProductos(disco1);
		} catch (ProductoDuplicado e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			stock.descontarProducto(6, 1);
		} catch (CantidadInvalida  | ProductoInexistente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}