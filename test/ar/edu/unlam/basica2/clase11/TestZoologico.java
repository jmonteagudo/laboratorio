package ar.edu.unlam.basica2.clase11;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestZoologico {

	@Test
	public void testQueVerificaQueAlAcuarioSoloSePuedanIngresarNadadores() {
		ArrayList<Animal> animales = new ArrayList<Animal>();
		ArrayList<Nadador> acuario = new ArrayList<Nadador>();
		
		animales.add(new Pez("Pequeña", "De muchos colores", "De colores"));
		animales.add(new Pez("Con dientes filosos", "Largo", "Largas"));
		animales.add(new Carnivoro("Con melena", "Con pelo corto", "Cuatro patas y cola"));
		animales.add(new Anfibio("Redonda", "Redondo", "Cortas"));
		
		for(Animal actual: animales) {
			acuario.add((Nadador)actual);
			if(actual instanceof Nadador) {
				acuario.add((Nadador)actual);
			}
		}
		
		
		
	}

}
