package ar.edu.unlam.herencia;

public class Ingeniero extends Empleado {
	
	private Double conceptoParaLaProductividad;
	private final Double CONCEPTO_PARA_LA_PRODUCTIVIDAD = 1.20;
	
	public Ingeniero(String nombre, String apellido, Double salario, String fechaDeNacimiento) {
		super(nombre, apellido, salario, fechaDeNacimiento);
		
		calcularConceptoParaLaProductividad(salario);
	}
	
	public Double getConceptoParaLaProductividad() {
		return conceptoParaLaProductividad;
	}

	private void calcularConceptoParaLaProductividad(Double salario) {
		conceptoParaLaProductividad = salario * CONCEPTO_PARA_LA_PRODUCTIVIDAD;
	}
	
	public void setSalario(Double salario) {
		calcularConceptoParaLaProductividad(salario);
	}

}
