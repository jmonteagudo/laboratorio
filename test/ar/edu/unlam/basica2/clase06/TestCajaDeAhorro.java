package ar.edu.unlam.basica2.clase06;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.basica2.clase06.CajaDeAhorro;

public class TestCajaDeAhorro {

	@Test
	public void testAplicarTasaCeroPuntoCinco() {
		Double saldoEsperado = 105.0D;
		CajaDeAhorro miCaja = new CajaDeAhorro(100.0, 0.05F);
		miCaja.aplicarTasaDeInteres();
		assertEquals(saldoEsperado, miCaja.consultarSaldo(), 0.01);
	}

}
