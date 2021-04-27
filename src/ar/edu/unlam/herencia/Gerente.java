package ar.edu.unlam.herencia;

public class Gerente extends Empleado {
	
	private Integer cochera;

	public Gerente(String nombre, String apellido, Double salario, String fechaDeNacimiento, Integer cochera) {
		super(nombre, apellido, salario, fechaDeNacimiento);
		
		this.cochera = cochera;
		
	}

	public Integer getCochera() {
		return cochera;
	}
}
