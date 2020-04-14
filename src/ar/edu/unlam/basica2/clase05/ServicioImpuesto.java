package ar.edu.unlam.basica2.clase05;

public class ServicioImpuesto {

	public Double obtenerImpuesto(Empleado empleado) {

		Double impuesto;

		Double salario = empleado.getSalario();
		if (salario < 10000) {
			impuesto = salario * 10 / 100;
		} else if (salario < 50000.0) {
			impuesto = salario * 20 / 100;
		} else {
			impuesto = salario * 30 / 100;
		}

		return impuesto;
	}

}
