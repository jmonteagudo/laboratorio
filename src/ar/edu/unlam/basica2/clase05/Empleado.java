package ar.edu.unlam.basica2.clase05;

import java.util.Date;



public abstract class  Empleado {

	protected String nombre;
	protected Double salario;
	protected Date fechaDeNacimiento;
	
	
	
public Empleado(String nombre,Double salario,Date fechaDeNacimiento)
	{	
		this.nombre=nombre;
		this.salario=salario;	
		this.fechaDeNacimiento=fechaDeNacimiento;	
		System.out.println(this.toString());
		
	}

public Empleado(String nombre,Double salario)
{	
	this.nombre=nombre;
	this.salario=salario;	
}

public abstract String brindarDetalles();

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Double getSalario() {
	return salario;
}

public void setSalario(Double salario) {
	this.salario = salario;
}

public Integer getAnio(){
	
	return this.fechaDeNacimiento.getYear();
}

public Integer getMes(){
	
	return this.fechaDeNacimiento.getMonth();
}

public Integer getDia(){
	
	return this.fechaDeNacimiento.getDay();
}


}
