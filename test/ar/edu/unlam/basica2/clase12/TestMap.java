package ar.edu.unlam.basica2.clase12;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class TestMap {
	
	/*
	 * Map (Mapa): Grupo de pares de objetos clave-valor.
	 * Si bien a simple vista parecería una colección de pares, cuando se la busca implementar de 
	 * esta manera su diseño se vuelve complicado.
	 * Un mapa puede devolver un conjunto (Set) de sus claves, una colección de sus valores, o un 
	 * conjunto de sus pares.
	 * Los mapas al igual que los arrays pueden extenderse a múltiples dimensiones, simplemente
	 * construyendo mapas cuyos valores son mapas.
	 */
	
	ManejoContenedores c;

	@Test
	public void testRellenarHasMap() {
		c = new ManejoContenedores();
		
		System.out.println(c.rellenar(new HashMap()));
	}

}
