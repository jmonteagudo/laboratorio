package ar.edu.unlam.basica2.clase09;

public abstract class Figura {
	
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Figura(){
		this.color = "Negro";
	}
	
	public abstract Double calcularElArea();
	public abstract Double calcularElPerimetro();
	public abstract void dibujarFigura();

}
