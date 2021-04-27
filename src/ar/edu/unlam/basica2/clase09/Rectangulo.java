package ar.edu.unlam.basica2.clase09;

public class Rectangulo extends Figura {
	
	private Double ladoA;
	private Double ladoB;
	
	public Rectangulo(Double ladoA, Double ladoB){
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	@Override
	public Double calcularElArea() {
		return (this.ladoA * this.ladoB);
	}
	
	@Override
	public Double calcularElPerimetro() {
		return (this.ladoA*2) + (this.ladoB*2);
	}

	public Double getBase() {
		return ladoA;
	}

	public void setBase(Double base) {
		this.ladoA = base;
	}

	public Double getAltura() {
		return ladoB;
	}

	public void setAltura(Double altura) {
		this.ladoB = altura;
	}
	
	public String dibujarFigura(){
		return "Se dibuja un rectángulo con un area de " + calcularElArea() + " y un perímetro de " + calcularElPerimetro();
	}

}
