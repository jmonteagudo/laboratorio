package ar.edu.unlam.basica2.clase06;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClasesDeEnvoltorio {

	@Test
	public void queSePuedaInstanciarUnInteger() {
		int enteros;
		double realesLargos;
		long enterosLargos;
		float reales;
		char caracteres;
		boolean booleanos;
		short enterosCortos;
		byte enterosMasCortosTodavia;
		
		enteros = 5;
		
		Integer enteroComoObjeto = 5;

		assertEquals(enteros, enteroComoObjeto.intValue());
		
		Double valorEsperado = 3.33;
		Double valorObtenido = (10.0/3);
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
		
	}

}
