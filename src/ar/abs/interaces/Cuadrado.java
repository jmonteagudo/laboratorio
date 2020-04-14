package ar.abs.interaces;

public class Cuadrado extends Figura implements Perimetro  {

	private Double base;
	
	public Cuadrado(Double base) {
	
		this.base = base;
	}

	@Override
	public Double calcularArea() {
		
		return base*base;
	}

	@Override
	public Double calcuarPerimetro() {
		
		return base*4;
	}

}
