package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuenta {

	@Test
	public void testCrearCuentaVacia() {
		Cuenta cuentaVacia = new Cuenta();
		
		Double expected = new Double(0.0);
		assertEquals(expected, cuentaVacia.consultarSaldo());
	}
	
	@Test
	public void testCrearCuentaConSaldo(){
		Cuenta cuentaConSaldo = new Cuenta(100.00);
		
		assertEquals(new Double(100.0), cuentaConSaldo.consultarSaldo());
		
	}
	
	@Test
	public void testDepositar(){
		Cuenta cuentaADepositar = new Cuenta(new Double(50.0));
		
		cuentaADepositar.depositarDinero(new Double(150.0));
		
		assertEquals(new Double(200.00), cuentaADepositar.consultarSaldo());
	}
	
	@Test
	public void testExtraerMontoValido(){
		
		Double dineroAExtraer = 100.0, dineroExtraido;
		Cuenta cuentaAExtraer = new Cuenta(100.0);
		
		dineroExtraido = cuentaAExtraer.extraerDinero(dineroAExtraer);
		
		assertEquals(dineroAExtraer, dineroExtraido);
		assertEquals(new Double(0.00), cuentaAExtraer.consultarSaldo());
	}
	
	@Test
	public void testExtraerMontoInvalido(){
		
		Double dineroAExtraer = new Double(100.0), dineroExtraido;
		Cuenta cuentaAExtraer = new Cuenta();
		
		dineroExtraido = cuentaAExtraer.extraerDinero(dineroAExtraer);
		
		assertNotEquals(dineroAExtraer, dineroExtraido);
		assertEquals(new Double(0.00), cuentaAExtraer.consultarSaldo());
	}
	
	@Test
	public void testConsultarSaldo(){
		Cuenta cuentaAConsultar = new Cuenta(new Double(100.00));
		
		// Sólo para ver que existe. No se recomienda su uso en los ejemplos que vamos a ver.
		System.out.println("El saldo de su cuenta es: " + cuentaAConsultar.consultarSaldo());
		System.out.printf("El saldo de su cuenta es: %s ", cuentaAConsultar.consultarSaldo());
	}
}
