package ar.edu.unlam.basica2.clase09;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class NuevoTestFigura {

	@Test
	public void test() {
		ArrayList<Figura> cuadricula = new ArrayList<Figura>();
		
		cuadricula.add(new Triangulo(2.0, 2.0, 2.0, 45.0, 45.0, 45.0));
		cuadricula.add(new Rectangulo(6.0, 8.0));
		cuadricula.add(new Circulo(10.0D));
		
		for(Figura actual: cuadricula) {
			System.out.println(actual.dibujarFigura());
		}
		
	}
	
	@Test
	public void testQueVerificaQuePuedaSetearElRadioDeUnCirculoEnUnaVariableDeTipoFigura() {
		ArrayList<Figura> cuadricula = new ArrayList<Figura>();
		
		//cuadricula.add(new Triangulo(2.0, 2.0, 2.0, 45.0, 45.0, 45.0));
		//cuadricula.add(new Rectangulo(6.0, 8.0));
		cuadricula.add(new Circulo(10.0D));
		
		if(cuadricula.get(0) instanceof Circulo) {
			((Circulo)cuadricula.get(0)).setRadio(5.0);		
		}
	
		System.out.println(cuadricula.get(0).dibujarFigura());
		
	}

}
