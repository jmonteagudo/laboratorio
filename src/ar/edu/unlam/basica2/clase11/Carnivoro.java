package ar.edu.unlam.basica2.clase11;

public class Carnivoro extends Mamifero {

	public Carnivoro(String cabeza, String tronco, String extremidades){
		super(cabeza, tronco, extremidades);
	}
	
	@Override
	public void comer() {
		System.out.println("Mamifero. Comer carne");
	}

	public String toString(){
		return ("Carnivoro con cabeza " + super.getCabeza() + ", tronco " + super.getTronco() + " y extremdidades " + super.getExtremidades());
	}
}
