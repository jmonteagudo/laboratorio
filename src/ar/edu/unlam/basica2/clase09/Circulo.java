package ar.edu.unlam.basica2.clase09;

import java.lang.Math;

public class Circulo extends Figura {

	private Double radio;
	
	public Circulo(){
		this.setRadio(new Double(0.00));
	}
	
	public Circulo(double radio){
		this.setRadio(new Double(radio));
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}
	
	public Double calcularElArea(){
		Double area;
		area = (this.radio * this.radio * Math.PI);
		return area;
	}
	
	public Double calcularElPerimetro(){
		Double longitud;
		longitud = (2 * this.radio * Math.PI);
		
		return longitud;
	}
	
	public void dibujarFigura(){
		System.out.println("Se dibuja un circulos con un area de " + calcularElArea() + " y un perímetro de " + calcularElPerimetro());
	}
}
