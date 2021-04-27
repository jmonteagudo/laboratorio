package ar.edu.unlam.basica2.clase09;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.basica2.clase09.Circulo;
import ar.edu.unlam.basica2.clase09.Figura;
import ar.edu.unlam.basica2.clase09.Rectangulo;
import ar.edu.unlam.basica2.clase09.Triangulo;

public class TestFigura {
	
	public void dibujarUnaFigura(Figura figuraADibujar){
		figuraADibujar.dibujarFigura();
					
		if(figuraADibujar instanceof Triangulo){
			System.out.println("LADO A="+((Triangulo)figuraADibujar).getLadoA());
		}
	}
	
	@Test
	public void dibujarUnCirculo(){
		Circulo circuloNuevo = new Circulo(10.0);
		dibujarUnaFigura(circuloNuevo);
		assertEquals(new Double(314.16), circuloNuevo.calcularElArea(), 0.01);
	}

	@Test
	public void dibujarUnRectangulo(){
		Rectangulo rectanguloNuevo = new Rectangulo(10.0, 5.0);
		dibujarUnaFigura(rectanguloNuevo);
		assertEquals(new Double(50.0), rectanguloNuevo.calcularElArea());
	}
	
	@Test
	public void dibujarUnTriangulo(){
		Triangulo trianguloNuevo = new Triangulo(7.14, 7.0, 10.0, 45.0, 45.0, 90.0);
		dibujarUnaFigura(trianguloNuevo);
		assertEquals(new Double(24.99), trianguloNuevo.calcularElArea(), 0.01);
		assertTrue(trianguloNuevo.esTriangulo());
	}
	
	@Test
	public void intentarDibujarUnTrianguloIrreal(){
		Triangulo trianguloNuevo = new Triangulo(10.0, 7.0, 7.14, 90.0, 45.0, 90.0);
		assertEquals(false, trianguloNuevo.esTriangulo());	
		
		trianguloNuevo = new Triangulo(10.0, 10.0, 30.0, 90.0, 45.0, 45.0);
		assertFalse(trianguloNuevo.esTriangulo());
	}
	
	@Test
	public void dibujarUnaFigura() {
		
		Figura actual = new Circulo(10.0D);
		
		System.out.println(actual.calcularElArea());
			
		actual = new Triangulo(2.0, 2.0, 2.0, 45.0, 45.0, 45.0);
		
		System.out.println(actual.calcularElArea());
		
		actual = new Rectangulo(6.0, 8.0);
		
		System.out.println(actual.calcularElArea());
		/*
		
		
		System.out.println("imprimo metodo abstracto " +actual.calcularElArea());
		((Figura)actual).polimorfismo();
//		
//        Figura figura2 = new Triangulo(10.0, 7.0, 7.14, 90.0, 45.0, 90.0);
//		((Triangulo)figura2)
        Circulo circulo = (Circulo) actual;
				
		circulo.setRadio(5.0);
		circulo.setColor("verde");
		actual.setColor("rojo");
		
		System.out.println(circulo.getColor());
		assertEquals(new Double(78.54), actual.calcularElArea(), 0.01);
		//System.out.println(" ver que pasa "+((Triangulo)figura).calcularElArea());
	*/}	
	
	@Test
	public void queUnMismoObjetoPuedeAdoptarDistintasFormas() {
		Figura figura = new Rectangulo(10.0D, 10.0D);
		assertEquals(new Double(100.0), figura.calcularElArea());
		
		figura = new Circulo(10.0D);
		assertEquals(new Double(314.16), figura.calcularElArea(), 0.01);
	}
	
	@Test
	public void verificarQueSePuedenManipularLasDistintasFigurasEnUnUnicoMetodo(){
		Figura[] figurasADibujar = new Figura[9];
	
		for(Figura f:figurasADibujar){
			switch((int)(Math.random()*3)){
				default:
				case 0: 
						f = new Circulo(10.0);
						break;
				case 1: 
						f = new Rectangulo(10.0, 5.0);
						break;
				case 2: 
						f = new Triangulo(2.0, 2.0, 2.0, 45.0, 45.0, 45.0);
						break;
			}
			dibujarUnaFigura(f);
		}
	}
	@Test
	public void compararCirculos(){
		Circulo c1 = new Circulo(3.14);
		Circulo c2 = new Circulo(3.14);
/*		
		if(c1 == c2){
			System.out.println("Los circulos son iguales");
		}
		
		if(c1.equals(c2)){
			System.out.println("Los circulos son iguales");			
		}
*/
		assertEquals(c1, c2);
	}
	@Test
	public void verAsignacionesPolimorficas(){
		
		System.out.println("-------------------------------------");
		System.out.println("test polimorfismo");
		Figura miFigura;
		Circulo miCirculo = new Circulo(10.0);
		
		Rectangulo miRectangulo = new Rectangulo(2.0, 3.0);
		
		miFigura=miCirculo;

		((Circulo)miFigura).setRadio(8.0);
		
		
//		//Class Exceptions
//		miFigura.dibujarFigura();
//		Figura miFigura2;
//		miFigura2=miCirculo;
//		miRectangulo=(Rectangulo)miFigura2;
//		
//		
		
	
		
		
		miFigura=miRectangulo;
		miFigura.dibujarFigura();
		System.out.println("-------------------------------------");
	
	
		Circulo miCirculo2 = new Circulo(10.0);
		
		Rectangulo miRectangulo2 = new Rectangulo(2.0, 3.0);
		
	
	}
	
	
	
	
	
	
	
	
	
}
