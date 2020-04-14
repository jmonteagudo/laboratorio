package ar.edu.unlam.basica2.clase05;
import java.util.Date;

public class Gerente extends Empleado{

	protected String departamentoAsignado;
	protected Integer cochera;
	
	public Gerente(Integer cochera,String departamento, String nombre,Double salario,Date fechaDeCumpleanios)
	{
	
	
		super(nombre, salario, fechaDeCumpleanios);
		System.out.println("fecha cumple en constructor"+ fechaDeCumpleanios.getDate());
		this.cochera=cochera;
		this.departamentoAsignado=departamento;
	
	
	}

	public String getDepartamentoAsignado() {
		return departamentoAsignado;
	}

	public void setDepartamentoAsignado(String departamentoAsignado) {
		this.departamentoAsignado = departamentoAsignado;
	}

	public Integer getCochera() {
		return cochera;
	}

	public void setCochera(Integer cochera) {
		this.cochera = cochera;
	}

	@Override
	public String brindarDetalles() {
		return "soy un Gerente ";
		
	}
	
	
}
