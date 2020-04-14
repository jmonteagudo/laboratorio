package ar.edu.unlam.basica2.parcial2.julio1c;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHora {

	@Test
	(expected=Exception.class)
	public void testQueSeVerifiqueQueSeLanceUnaExcepcion() throws Exception {
	Hora hora=new Hora(10, 65);
	}

	@Test
	public void testQueTrateUnaExcepcion()  {
		try {
			Hora hora=new Hora(10, 55);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		}
	
	
}
