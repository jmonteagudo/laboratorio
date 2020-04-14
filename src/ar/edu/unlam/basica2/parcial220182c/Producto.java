package ar.edu.unlam.basica2.parcial220182c;

public abstract class Producto {
	private Integer id;

	private Double precio;
	private Integer cantidadDisponible;
	private Integer cantidadMinima;
	
	public Producto(Integer id, Double precio, Integer cantidadDisponible, Integer cantidadMinima) {
		super();
		this.id = id;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
		this.cantidadMinima = cantidadMinima;
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getCantidadDisponible() {
		return cantidadDisponible;
	}
	public void setCantidadDisponible(Integer cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	public Integer getCantidadMinima() {
		return cantidadMinima;
	}
	public void setCantidadMinima(Integer cantidadMinima) {
		this.cantidadMinima = cantidadMinima;
	}
	
	
	

}
