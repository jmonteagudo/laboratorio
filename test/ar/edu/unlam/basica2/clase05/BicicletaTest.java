package ar.edu.unlam.basica2.clase05;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicicletaTest {

	@Test
	public void testCrearUnObjetoBicicleta() {
		Bicicleta miBici = new Bicicleta();
		assertEquals(miBici.getPlato(), 1, 0);
	}
	
	@Test
	public void testCrearUnObjetoBicicletaPlayera() {
		Playera miBici = new Playera();
		assertEquals(miBici.getPlato(), 1, 0);
	}
	
	@Test
	public void testCrearUnObjetoBicicletaRuta() {
		Ruta miRutera = new Ruta(2, 16);
		miRutera.setPlato(2);
		miRutera.acelerar();
		assertEquals(miRutera.getPlato(), 2, 0);
		assertEquals(miRutera.getVelocidad(), 2, 0);
	}
	
	@Test
	public void testCrearUnObjetoBicicletaTriatlon() {
		Triatlon biciTria = new Triatlon();
		biciTria.setPlato(2);
		biciTria.acelerar();
		assertEquals(biciTria.getPlato(), 2, 0);
		assertEquals(biciTria.getVelocidad(), 2, 0);
	}
	
	@Test
	public void testCrearUnObjetoBicicletaTriatlonCon16Piniones() {
		Triatlon biciTria = new Triatlon(2, 16);
		biciTria.setPlato(3);
		biciTria.setPinion(14);
		assertNotEquals(biciTria.getPlato(), 3, 0);
		assertEquals(biciTria.getPinion(), 14, 0);
	}
}
