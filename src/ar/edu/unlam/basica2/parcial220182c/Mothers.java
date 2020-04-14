package ar.edu.unlam.basica2.parcial220182c;

public class Mothers extends Producto {
	private Integer cantidadUSB;
	
	
	public Mothers(Integer id, Double precio, Integer cantidadDisponible, Integer cantidadMinima,Integer cantidadUsb) {
		super(id, precio, cantidadDisponible, cantidadMinima);
		// TODO Auto-generated constructor stub
		
		this.cantidadUSB=cantidadUsb;
	}

	
	public Integer getCantidadUSB() {
		return cantidadUSB;
	}
	public void setCantidadUSB(Integer cantidadUSB) {
		this.cantidadUSB = cantidadUSB;
	}
	
	
	
	

}
