package ar.edu.unlam.basica2.clase11;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNullPointerException {

	@Test
	public void testNullPointerException(){
		Animal zoologicoDeBuenosAires[];
		
		// El compilador no nos deja cometer errores
		//zoologico[2] = new Anfibio("", "", "");
		
		zoologicoDeBuenosAires = TestNaturaleza.ingresarAnimales();

		System.out.println("Los animales en este zoologico son:");
		for(Animal a:zoologicoDeBuenosAires){
			System.out.println(a.toString());
		}
		// Se podría resolver este problea con lenght?
		
		
	}

}
