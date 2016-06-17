package ar.edu.unlam.basica2.clase11;

public abstract class Vertebrado extends Animal{
	private String cabeza;
	private String tronco;
	private String extremidades;
	
	public void reproducir(){
		System.out.println("Vertebrados.Reproducir");
	}
	
	public Vertebrado(String cabeza, String tronco, String extremidades){
		this.cabeza = cabeza;
		this.tronco = tronco;
		this.extremidades = extremidades;
	}

	public String getCabeza() {
		return cabeza;
	}

	public String getTronco() {
		return tronco;
	}

	public String getExtremidades() {
		return extremidades;
	}
}
