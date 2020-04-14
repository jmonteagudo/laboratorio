package ar.edu.unlam.basica2.clase05;

import java.util.Date;

public class Ingeniero extends Empleado {

	public Ingeniero(String nombre, Double salario, Date fechaDeNacimiento) {
		super(nombre, salario, fechaDeNacimiento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String brindarDetalles() {
		// TODO Auto-generated method stub
		return "Soy un Ingeniero";
	}
	
	

}
