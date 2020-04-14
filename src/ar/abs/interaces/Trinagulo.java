package ar.abs.interaces;

public class Trinagulo extends Figura implements Perimetro {

	private Double ladoA;
	private Double ladoc;
	private Double ladob;
	
	

	
	public Trinagulo(Double ladoA, Double ladoc, Double ladob) {
	
		this.ladoA = ladoA;
		this.ladoc = ladoc;
		this.ladob = ladob;
	}

	@Override
	public Double calcuarPerimetro() {
		
		return ladoA + ladob + ladoc;
	}

	@Override
	public Double calcularArea() {
		// TODO Auto-generated method stub
		return null;
	}

}
