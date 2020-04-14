package ar.edu.unlam.basica2.parcial220182c;

public class DiscoRigido extends Producto {
	
	
	private Double capacidadEnMB;//  capacidad en Mega Bytes
	
	
	public DiscoRigido (Integer id, Double precio, Integer cantidadDisponible, Integer cantidadMinima,Double capacidadEnMB) {
		super (id,precio,cantidadDisponible,cantidadMinima);
		this.capacidadEnMB=capacidadEnMB;
		
		
		
	}
	
	public Double getCapacidadEnMB() {
		return capacidadEnMB;
	}
	public void setCapacidadEnMB(Double capacidadEnMB) {
		this.capacidadEnMB = capacidadEnMB;
	}
	
	
	
	
	
	

}
