package ar.edu.unlam.basica2.clase11;

public class Pez extends Vertebrado implements Nadador {
	
	private String aletas;
	private String branqueas;

	public Pez(String cabeza, String tronco, String extremidades) {
		super(cabeza, tronco, extremidades);
	}
	
	public Pez(String cabeza, String tronco, String extremidades, String branqueas, String aletas) {
		super(cabeza, tronco, extremidades);
		this.aletas = aletas;
		this.branqueas = branqueas;
	}
	public void nadar(){
		System.out.println("Mover las aletas para desplazarse de un lugar a otro");
	}
	
	public void nacer(){
		System.out.println("Romper el huevo y salir al mundo");
	}
	
	public void comer(){
		System.out.println("A través de la boca, comer algas y otros peces");
	}
	
	public void reproducir(Pez otroPez){
		System.out.println(this.toString() + "copula con" + otroPez + "y tienen pecesitos");
		otroPez.ponerHuevo();
	}
	
	public void ponerHuevo(){
		System.out.println("Poner huevo. Luego de unos meces nace un nuevo pez");
	}
	
	public String toString(){
		return ("Pez con cabeza " + super.getCabeza() + " tronco " + super.getTronco() + ", extremidades " + super.getExtremidades() + " branqueas " + branqueas + " y aletas: " + aletas);
	}
}
