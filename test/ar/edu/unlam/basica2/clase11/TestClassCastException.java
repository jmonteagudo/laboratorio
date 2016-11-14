package ar.edu.unlam.basica2.clase11;

import org.junit.Test;

public class TestClassCastException {
	
	@Test
	public void testClassCastException(){
		Animal animal = TestNaturaleza.crearAnimales();
		Vertebrado unVertebrado = (Vertebrado)animal; 
		String cabeza = unVertebrado.getCabeza();
		System.out.println("La cabeza del vertebrado creado es:" + cabeza);
	}
}
