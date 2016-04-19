package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestString {
	
	@Test
	public void testDesigualdadDeObjetos(){
		String cadena1 = new String("Cadena");
		String cadena2 = new String("Cadena");
		
		assertFalse(cadena1 == cadena2);
	}
	
	@Test
	public void testIgualdadDeObjetos() {
		String cadena1 = "Cadena";
		String cadena2 = "Cadena";
		
		assertEquals(cadena1, cadena2);
	}

}
