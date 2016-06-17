package ar.edu.unlam.basica2.clase11;

public class Ave extends Vertebrado implements Volador{

	public Ave(String cabeza, String tronco, String extremidades){
		super(cabeza, tronco, extremidades);
	}
	
	public void nacer() {
		System.out.println("Ave. Nacer");
	}
	
	public void despegar(){
		System.out.println("Ave. Despegar");
	}
	
	public void volar(){
		System.out.println("Ave. Volar");
	}
	
	public void aterrizar(){
		System.out.println("Ave. Aterrizar");
	}

	@Override
	public void comer() {
		System.out.println("Ave. Comer");
		
	}
	
	public String toString(){
		return ("Ave con cabeza " + super.getCabeza() + ", tronco " + super.getTronco() + " y extremdidades " + super.getExtremidades());
	}

}
