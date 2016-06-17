package ar.edu.unlam.basica2.clase11;

public class Hervivoro extends Mamifero {
	
	public Hervivoro(String cabeza, String tronco, String extremidades){
		super(cabeza, tronco, extremidades);
	}

	@Override
	public void comer() {
		System.out.println("Mamifero. Comer hiervas");
	}
	
	public String toString(){
		return ("Hervivoro con cabeza " + super.getCabeza() + ", tronco " + super.getTronco() + " y extremdidades " + super.getExtremidades());
	}

}
