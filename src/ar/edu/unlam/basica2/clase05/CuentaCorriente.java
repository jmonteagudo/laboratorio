package ar.edu.unlam.basica2.clase05;

public class CuentaCorriente extends Cuenta {

	private Double sobregiro;
	
	public Double getSobregiro() {
		return sobregiro;
	}

	public CuentaCorriente(){
		sobregiro = 300.0;
	}
	
	public CuentaCorriente(Double saldoInicial){
		super(saldoInicial);	
		sobregiro = 300.0;
	}
	
	// Sobreescritura de método
	public Double extraerDinero(Double importeARetirar){
		Double importeRetirado;
		
		if(importeARetirar<=super.getSaldo()){
			importeRetirado = super.extraerDinero(importeARetirar);
		}
		else if(importeARetirar<=(super.getSaldo() + this.sobregiro)){
			sobregiro -= (importeARetirar - super.getSaldo());
			super.extraerDinero(super.getSaldo());
			importeRetirado = importeARetirar;
		}
		else{
			importeRetirado = 0.0;
		}		
		return importeRetirado;
	}
	// Sobrecarga del método
	
	public Double extraerDinero(Integer importeARetirar){
		return Double.parseDouble(importeARetirar.toString());
	}
	
	public Double extraerDinero(Double importeARetirar, String mensaje){
		System.out.println(mensaje);
		return importeARetirar;
	}
	
	
}
