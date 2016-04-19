package ar.edu.unlam.basica2;

public class Cuenta {
	private Double saldo;

	public Cuenta(Double saldo){
		this.saldo = saldo;
	}
	
	public Cuenta(){
		this.saldo = 0.0D;
	}
	
	public void depositarDinero(Double importe){
		this.saldo+=importe;
	}
	
	public Double extraerDinero(Double importeARetirar){
		Double importeRetirado;
		
		if(importeARetirar<=this.saldo){
			saldo-=importeARetirar;
			importeRetirado = importeARetirar;
		}
		else{
			importeRetirado = 0.0D;
		}
		
		return importeRetirado;
	}
	
	public Double consultarSaldo(){
		return (getSaldo());
	}
	
	public Double getSaldo(){
		return this.saldo;
	}
}
