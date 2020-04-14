package ar.edu.unlam.basica2.parcial2.julio1c;

public abstract class Cuenta {
	private Double saldo;
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public abstract Double calcularComision ();
}
