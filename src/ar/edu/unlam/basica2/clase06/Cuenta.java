package ar.edu.unlam.basica2.clase06;

public class Cuenta{
	
	private Integer numero;
	private String apellidoTitular;
	private String nombreTitular;
	private Double saldo;

	public Cuenta(Double saldo, Integer numero, String apellidoTitular, String nombreTitular){
		this.saldo = saldo;
		this.numero = numero;
		this.apellidoTitular = apellidoTitular;
		this.nombreTitular = nombreTitular;
	}
	
	public Cuenta(Double saldo){
		this.saldo = saldo;
	}
	
	public Cuenta(){
		this.saldo = 0.0D;
	}
	
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getApellidoTitular() {
		return apellidoTitular;
	}

	public void setApellidoTitular(String apellidoTitular) {
		this.apellidoTitular = apellidoTitular;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	
	public void depositarDinero(Double importe){
		this.saldo+=importe;
	}
	
	public Double extraerDinero(Double importeARetirar){
		if(importeARetirar<=this.saldo){
			this.saldo -= importeARetirar;
			return importeARetirar;
		}else{
			return 0.0;
		}
	}
	public Double consultarSaldo(){
		return (getSaldo());
	}
	
	public Double getSaldo(){
		return this.saldo;
	}
	
	public boolean equals(Object obj){
		
		Cuenta cuentaAComparar;
		
		if(obj == null){
			return false;
		}

		cuentaAComparar = (Cuenta) obj;
		if(this.numero == cuentaAComparar.getNumero()){
			return true;
		}
		else{
			return false;
		}
	}
	
	/*public int hashCode(){
		return numero;
	}*/
}
