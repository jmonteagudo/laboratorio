package ar.edu.unlam.basica2.clase11;

public class Invertebrado extends Animal{
	String exoesqueleto;
	
	public Invertebrado(String exoesqueleto){
		this.exoesqueleto = exoesqueleto;
	}
	public void nacer(){
		System.out.println("Invertebrado. Nacer");
	}
	
	public void comer(){
		System.out.println("Invertebrado. Comer");
	}
	
	public String toString(){
		return "Invertebrado con un Exoesqueleto: " + exoesqueleto;
	}
}
