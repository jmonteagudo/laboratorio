package ar.edu.unlam.basica2.equals;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPersonaEquals {

	@Test
	public void test() {
Persona persona1= new Persona("Juan","Perez",30); 
Persona persona2 = new Persona("Juan","Perez",30);
	assertTrue(persona1.equals(persona2));

	}

}
