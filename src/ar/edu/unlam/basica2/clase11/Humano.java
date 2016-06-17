package ar.edu.unlam.basica2.clase11;

public class Humano extends Omnivoro implements Caminador{

	public Humano(String cabeza, String tronco, String extremidades){
		super(cabeza, tronco, extremidades);
	}
	
	public void hablar(){
		System.out.println("Humano. Hablar");
	}
	
	public void razonar(){
		System.out.println("Humano. Razonar");
	}
	
	public void morir(){
		System.out.println("Ceremonias previas");
		super.morir();
	}
	
	public void caminar(){
		System.out.println("Humano. Caminar");
	}
	
	public String toString(){
		return ("Humano con cabeza " + super.getCabeza() + ", tronco " + super.getTronco() + " y extremdidades " + super.getExtremidades());
	}
}
