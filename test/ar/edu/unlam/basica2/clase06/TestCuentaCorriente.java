package ar.edu.unlam.basica2.clase06;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.basica2.clase05.CuentaCorriente;
import ar.edu.unlam.basica2.clase06.Cuenta;

public class TestCuentaCorriente {

	@Test
	public void testCuentaCorriente() {
		CuentaCorriente sueldo = new CuentaCorriente();
		System.out.println("El saldo de la cuenta es:" + sueldo.consultarSaldo());
	}
	
	@Test
	public void testExtraerSaldoDisponibleDeCuentaCorriente(){
		CuentaCorriente conSaldoSuficiente = new CuentaCorriente(100.0);
		conSaldoSuficiente.extraerDinero(80.0);
		assertEquals(new Double(20.0), conSaldoSuficiente.getSaldo());
		assertEquals(new Double(300.0), conSaldoSuficiente.getSobregiro());
	}
	
	@Test
	public void testExtraerImporteDelSobregiro(){
		CuentaCorriente conSobregiroSuficiente = new CuentaCorriente(100.0);
		conSobregiroSuficiente.extraerDinero(150.0);
		assertEquals(new Double(0.0), conSobregiroSuficiente.getSaldo());
		assertEquals(new Double(250.0), conSobregiroSuficiente.getSobregiro());
	}
	
	@Test
	public void testExtraerImporteSuperiorAlSobregiro(){
		CuentaCorriente sinFondosSuficientes = new CuentaCorriente(100.0);
		Double importeRetirado = sinFondosSuficientes.extraerDinero(500.0);
		assertNotEquals(new Double(500.0), importeRetirado);
		assertEquals(new Double(100.0), sinFondosSuficientes.getSaldo());
		assertEquals(new Double(0.0), importeRetirado);
		assertEquals(new Double(300.0), sinFondosSuficientes.getSobregiro());
	}
	
	@Test
	public void testSobrecarga(){
		Double saldoInicial = 0.0D;
		CuentaCorriente sobrecarga = new CuentaCorriente(saldoInicial);
		
		sobrecarga.getSaldo();
		sobrecarga.extraerDinero(300.0);
		
		
	}

	@Test
	public void testCuenta(){
		Cuenta sobrecarga = new Cuenta();
		
		sobrecarga.extraerDinero(300.0);
		
	}
	
}
