package ar.edu.unlam.basica2.clase05;

public class Bicicleta {

	private Integer plato;
	private Integer pinion;
	private Integer cadencia;
	private Integer velocidad;

	public Bicicleta(){
		this.plato = 1;
		this.pinion = 1;
		this.cadencia = 0;
		this.velocidad = 0;
	}
	
	public Bicicleta(Integer plato, Integer pinion, Integer cadencia, Integer velocidad){
		this.plato = plato;
		this.pinion = pinion;
		this.cadencia = cadencia;
		this.velocidad = velocidad;
	}
	
	public void acelerar(){
		velocidad++;
	}
	
	public void acelerar(Integer incremento){
		velocidad+=incremento;
	}
	
	public void frenar(){
		velocidad--;
	}
	
	public void frenar(Integer decremento){
		velocidad-=decremento;
	}

	public Integer getPlato() {
		return plato;
	}

	public Integer getPinion() {
		return pinion;
	}

	public Integer getCadencia() {
		return cadencia;
	}

	public void setCadencia(Integer cadencia) {
		this.cadencia = cadencia;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public void setPlato(Integer plato) {
		this.plato = plato;
	}

	public void setPinion(Integer pinion) {
		this.pinion = pinion;
	}
}
