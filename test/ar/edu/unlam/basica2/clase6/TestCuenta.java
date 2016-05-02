package ar.edu.unlam.basica2.clase6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuenta {
	
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
}
