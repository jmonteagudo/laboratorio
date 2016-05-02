package ar.edu.unlam.basica2.clase6;

public class CajaDeAhorro extends Cuenta {
	
	private Float tasaDeInteres;
	//0.05
	
	public CajaDeAhorro(){
		tasaDeInteres = 0.0F;
	}
	
	public CajaDeAhorro(Double saldo, Integer numero, String apellidoTitular, String nombreTitular){
		super(saldo, numero, apellidoTitular, nombreTitular);	
		this.tasaDeInteres = 0.0F;
	}
	
	public CajaDeAhorro(Double saldoInicial){
		super(saldoInicial);
		tasaDeInteres = 0.0F;
	}
	
	public CajaDeAhorro(Double saldoInicial, Float tasaDeInteres){
		super(saldoInicial);
		this.tasaDeInteres = tasaDeInteres;
	}
	
	public void aplicarTasaDeInteres(){
		// saldo += saldo * 0.05
		Double saldoActual = super.consultarSaldo();
		Double interesesGanados = saldoActual * tasaDeInteres;
		super.depositarDinero(interesesGanados);
	}

}
