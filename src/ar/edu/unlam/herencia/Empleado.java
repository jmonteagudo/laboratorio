package ar.edu.unlam.herencia;

public class Empleado {

	private String nombre;
	private String apellido;
	private Double salario;
	private String fechaDeNacimiento;
		
	public Empleado(String nombre, String apellido, Double salario, String fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}	
}
