package ar.edu.unlam.basica2.clase12;

import org.junit.Test;

public class TestExcepcionPropia {

	public void f() throws ExceptionProgramacionBasica2{
		System.out.println("Lanzando excepción sensilla");
		//throw new ExceptionProgramacionBasica2("No es un error, sino una prueba");
		throw new ExceptionProgramacionBasica2();
	}
	
	@Test
	public void testManejoExcepcion(){
		TestExcepcionPropia exc = new TestExcepcionPropia();
		try{
			exc.f();
		}catch(ExceptionProgramacionBasica2 e){
			e.printStackTrace();
			System.err.println("Esta es una prueba del lanzamiento de una excepción");
		}finally{
			// Bloque de código que se ejecuta siempre..
		}
	}
}
