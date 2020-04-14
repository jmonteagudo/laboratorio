package ar.edu.unlam.basica2.clase05;

import java.util.Date;

public class Secretaria extends Empleado {

	public Secretaria(String nombre, Double salario, Date fechaDeNacimiento) {
		super(nombre, salario, fechaDeNacimiento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String brindarDetalles() {
		// TODO Auto-generated method stub
		return "Secretaria [getNombre()=" + getNombre() + ", getSalario()=" + getSalario() + ", getAnio()=" + getAnio()
		+ ", getMes()=" + getMes() + ", getDia()=" + getDia() + ", getClass()=" + getClass() + ", hashCode()="
		+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public String toString() {
		return "Secretaria [getNombre()=" + getNombre() + ", getSalario()=" + getSalario() + ", getAnio()=" + getAnio()
				+ ", getMes()=" + getMes() + ", getDia()=" + getDia() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
