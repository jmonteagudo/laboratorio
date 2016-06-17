package ar.edu.unlam.basica2.clase11;

public class Reptil extends Vertebrado implements Nadador, Caminador {

	public Reptil(String cabeza, String tronco, String extremidades){
		super(cabeza, tronco, extremidades);
	}
	
	public void caminar(){
		System.out.println("Reptil. Caminar");
	}

	@Override
	public void nacer() {
		System.out.println("Reptil. Nacer");
	}

	@Override
	public void comer() {
		System.out.println("Reptil. Comer");
	}
	
	public void nadar(){
		System.out.println("Reptil. Nadar");
	}
	
	public String toString(){
		return ("Reptil con cabeza " + super.getCabeza() + ", tronco " + super.getTronco() + " y extremdidades " + super.getExtremidades());
	}
	
}
