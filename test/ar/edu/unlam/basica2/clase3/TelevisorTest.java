package ar.edu.unlam.basica2.clase3;

import org.junit.Test;

import ar.edu.unlam.basica2.clase3.Televisor;

import static org.junit.Assert.*;

public class TelevisorTest {
	
	@Test
	public void testQueElVolumenArrancaEn10(){
		// Instanciamos la clase televisor
		Televisor televisorSony = new Televisor();
		assertEquals(10, televisorSony.getVolumen());
	}

	@Test
	public void incrementarElVolumenUnaVez(){
		// Instanciamos la clase televisor
		Televisor televisorSony = new Televisor(0,0);
		
		televisorSony.ajustarVolumen("subir");

		assertEquals(1, televisorSony.getVolumen());
	}
	
	@Test
	public void asignarElVolumenDirectamente(){
		// Instanciamos la clase televisor
		Televisor televisorSony = new Televisor();
		int volumenExpected = -10;
		
		televisorSony.setVolumen(volumenExpected);

		assertNotEquals(volumenExpected, televisorSony.getVolumen());
	}
}
