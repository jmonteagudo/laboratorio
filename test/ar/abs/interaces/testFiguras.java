package ar.abs.interaces;

import static org.junit.Assert.*;

import org.junit.Test;

public class testFiguras {

	@Test
	public void testAreaCuadrado() {
		
		Figura miCuadrado =new Cuadrado(10.0);
		assertEquals(100.0,miCuadrado.calcularArea(),0.01);
		Figura figura = new Trinagulo(1d, 2d, 3d);
		
	}
	
//	
//	@Test
//	public void testcuadradoArea() {
//		
//		Figura miTrinagulo =new o(10d, 20d, 30d);
//		assertEquals(60.0,miTrinagulo.calcularArea(),0.01);
//		
//	}

//	@Test
//	public void testperimetroCuadrado() {
//		
//		Cuadrado miCuadrado =new Cuadrado (10d);
//		assertEquals(40.0,miCuadrado. ,0.01);		
//	}

}
