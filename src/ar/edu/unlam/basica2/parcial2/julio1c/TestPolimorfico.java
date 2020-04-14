package ar.edu.unlam.basica2.parcial2.julio1c;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPolimorfico {

	@Test
	public void testVerificaComisionesDeLasCuentas() {
		Cuenta cuenta;
		CuentaPlus cuentaPlus  = new CuentaPlus();
		//cuentaPlus.setSaldo(300.0); 
		cuenta=cuentaPlus;
		cuenta.setSaldo(300.0);
		assertEquals(6.0, cuenta.calcularComision(),0.01);
		CuentaBasica cuentaBasica = new CuentaBasica();
		//cuentaBasica.setSaldo(100.0);
		cuenta=cuentaBasica;
		cuenta.setSaldo(100.0);
		assertEquals(1.0, cuenta.calcularComision(),0.01);
	}
}
