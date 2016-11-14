package ar.edu.unlam.basica2.clase11;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestManejarNullPointerException {

	@Test
	public void testManejarElNullPointerException(){
		// Capturando la excepción
		Animal zoologicoDeMendoza[];
		
		zoologicoDeMendoza = TestNaturaleza.ingresarAnimales();
		
		System.out.println("Los animales en este zoologico son:");
		try{
			for(Animal a:zoologicoDeMendoza){
				System.out.println(a.toString());
			}
		}catch(NullPointerException e){
			System.err.println("**** El zoologico no está completo *****");
		}catch(Exception e){
			System.err.println("Excepción no determinada");
		}finally{
			// Bloque de código que se ejecuta siempre
			// Ocurra la excepción o no.
			// Cerrar archivos abiertos, cerrar la conexión con la base de datos
			System.out.println("Chau");
		}
	}
}
