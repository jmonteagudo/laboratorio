package ar.edu.unlam.basica2.clase11;

public class Humano extends Omnivoro implements Caminador, Nadador{

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
		System.out.println("Preparar ceremonias posteriores");
		super.morir();
	}
	
	public void caminar(){
		System.out.println("Humano. Caminar: erguido y en dos patas");
	}
	
	public String toString(){
		return ("Humano con cabeza " + super.getCabeza() + ", tronco " + super.getTronco() + " y extremdidades " + super.getExtremidades());
	}

	@Override
	public void nadar() {
		System.out.println("Humano, nada");
		
	}
}
