package ar.edu.unlam.basica2.clase11;

public abstract class Mamifero extends Vertebrado {

	public Mamifero(String cabeza, String tronco, String extremidades){
		super(cabeza, tronco, extremidades);
	}
	
	public void nacer() {
		System.out.println("El nuevo mamifero deja el utero y sale al exterrior");
	}
	
	/*public void comer(){
		System.out.println("Tomando teta");
	}*/
}
