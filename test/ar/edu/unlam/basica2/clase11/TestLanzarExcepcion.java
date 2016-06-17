package ar.edu.unlam.basica2.clase11;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TestLanzarExcepcion {
	
	private void mostrarContenidoDelZoologico(Animal zoologico[]) throws NullPointerException, IOException{
		for(Animal a:zoologico){
			if(a==null){
				throw new IOException();
			}
			System.out.println(a.toString());
		}
			
	}

	@Test
	public void testLanzarExcepcion(){
		//Lanzando la Excepción
		Animal zoologicoDeLujan[];
		
		zoologicoDeLujan = TestNaturaleza.ingresarAnimales();
		System.out.println("Los animales en este zoologico son:");
		try{
			mostrarContenidoDelZoologico(zoologicoDeLujan);
		} catch(IOException E){
			System.out.println("**** El zoologico no está completo ****");
		}
	}
}
