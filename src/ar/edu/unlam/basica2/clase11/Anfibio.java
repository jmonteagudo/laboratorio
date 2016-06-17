package ar.edu.unlam.basica2.clase11;

public class Anfibio extends Vertebrado implements Caminador, Nadador {

	public Anfibio(String cabeza, String tronco, String extremidades){
		super(cabeza, tronco, extremidades);
	}
	
	public void nacer() {
		System.out.println("Anfibio. Nacer");
	}
	
	public void nadar(){
		System.out.println("Anfibio. Nadar");		
	}
	
	public void caminar(){
		System.out.println("Anfibio. Caminar");
	}

	@Override
	public void comer() {
		System.out.println("Anfibio. Comer");
		
	}
	
	public String toString(){
		return ("Anfibio con cabeza " + super.getCabeza() + ", tronco " + super.getTronco() + " y extremdidades " + super.getExtremidades());
	}
}
