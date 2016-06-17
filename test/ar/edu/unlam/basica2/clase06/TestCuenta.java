package ar.edu.unlam.basica2.clase06;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.basica2.clase06.Cuenta;

public class TestCuenta {
	/*
	@Test
	public void testCompararCuentasEnElModoErroneo(){
		Cuenta cuentaDeJuan = new Cuenta(1000.0, 1, "Perez", "Juan");
		Cuenta cuenta = new Cuenta(1000.0, 1, "Perez", "Juan");
		
		if(cuentaDeJuan.equals(cuenta)){
			System.out.println("Los objetos son iguales");
		}
		else{
			System.out.println("Los objetos son distintos");
		}
	}
	
	@Test
	public void testCompararCuentasEnElModoAdecuado(){
		Cuenta cuentaDeJuan = new Cuenta(1000.0, 1, "Perez", "Juan");
		Cuenta cuenta = new Cuenta(1000.0, 1, "Perez", "Juan");
		
		assertEquals(cuentaDeJuan, cuenta);
	}	
	
	@Test
	public void testCompararCuentasDistintas(){
		Cuenta cuentaNueva = new Cuenta(1000.0, 1, "Gomez", "Carlos");
		Cuenta cuentaDiferenteALaAnterior = new Cuenta(1000.0, 2, "Alvarez", "Camila");
		
		assertNotEquals(cuentaNueva, cuentaDiferenteALaAnterior);
	}
	
	@Test 
	public void compararString(){
		String cadena1 = "Subir";
		if(cadena1=="Subir"){
			System.out.println("No podemos incluir la pregunta");
		}
	}
	*/
	
	@Test
	public void testCompararCuentas(){
		Cuenta cuentaNueva = new Cuenta(1000.0, 1, "Gomez", "Carlos");
		Cuenta cuentaDiferenteALaAnterior = new Cuenta(1000.0, 2, "Alvarez", "Camila");
		
		if(cuentaNueva.equals(cuentaDiferenteALaAnterior)){
			System.out.println("Las cuentas son iguales");
		}
		else{
			System.out.println("Las cuentas son diferentes");
		}
		
		
		
		
	}
}
