package ar.edu.unlam.basica2.parcial2.julio1c;

public class CuentaPlus extends Cuenta {

	@Override
	public Double calcularComision() {
	
		return getSaldo()*0.02;
	}

}
