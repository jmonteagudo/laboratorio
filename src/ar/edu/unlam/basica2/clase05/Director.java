package ar.edu.unlam.basica2.clase05;

import java.util.Date;

public class Director extends Gerente {

    //private Integer cochera;
	private Double sueldoExtra;
	
	public Director(Integer cochera,Double sueldoExtra,String nombre,Double salario,Date fechaDeCumpleanios,String departamento)
	{	

		
		super(cochera, departamento, nombre, salario,fechaDeCumpleanios);
		this.sueldoExtra=sueldoExtra;
		
	}
//	public Integer getCochera() {
//		return cochera;
//	}
//	public void setCochera(Integer cochera) {
//		this.cochera = cochera;
//	}
	public Double getSueldoExtra() {
		return sueldoExtra;
	}
	public void setSueldoExtra(Double sueldoExtra) {
		this.sueldoExtra = sueldoExtra;
	}
}
