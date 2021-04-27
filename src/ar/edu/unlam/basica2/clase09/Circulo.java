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
	
	public String dibujarFigura(){
		return "Se dibuja un circulos con un area de " + calcularElArea() 
		+ " y un perímetro de " + calcularElPerimetro();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((radio == null) ? 0 : radio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (radio == null) {
			if (other.radio != null)
				return false;
		} else if (!radio.equals(other.radio))
			return false;
		return true;
	}
	public void polimorfismo (){
		System.out.println("imprimos circulo");
	}
}
