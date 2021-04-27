package ar.edu.unlam.basica2.clase09;

public class Triangulo extends Figura{
	
	private Double ladoA;
	private Double ladoB;
	private Double ladoC;
	private Double anguloA;
	private Double anguloB;
	private Double anguloC;
	
	public Triangulo(Double ladoA, Double ladoB, Double ladoC, Double anguloA, Double anguloB, Double anguloC){
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.anguloA = anguloA;
		this.anguloB = anguloB;
		this.anguloC = anguloC;
	}
	
	private boolean laSumaDeSusAngulosEs180(){
		if((anguloA + anguloB + anguloC) == 180){	
			return true;
		}
		else{
			return false;
		}
	}
	
	private boolean laSumaDeDosLadosEsMayorAlTercero(){
		if(ladoA+ladoB>ladoC && ladoA+ladoC>ladoB && ladoB+ladoC>ladoA){
			return true;
		}
		else{
			return false;
		}
	}
	
	private boolean elTeoremaDelSenoEsVerdadero(){
		return (((ladoA/Math.sin(anguloA))==(ladoB/Math.sin(anguloB))) 
				&& (ladoA/Math.sin(anguloA))==(ladoC/Math.sin(anguloC)));
	}
	
	private boolean unLadoEsMayorALaDiferenciaDeLosOtrosLados(){
		return ((ladoA>(ladoB-ladoC)) && 
				(ladoA>(ladoC-ladoB)) &&
				(ladoB>(ladoA-ladoC)) && 
				(ladoB>(ladoC-ladoA)) &&
				((ladoC>ladoA-ladoB)) &&
				((ladoC>ladoB-ladoA)));
	}
	
	private boolean elTeoremaDelCosenoEsVerdadero(){
		return true;
	}
	
	public boolean esTriangulo(){
		if(laSumaDeDosLadosEsMayorAlTercero()){
			if(unLadoEsMayorALaDiferenciaDeLosOtrosLados()){
				if(laSumaDeSusAngulosEs180()){
					/*if(elTeoremaDelSenoEsVerdadero()){
						if(elTeoremaDelCosenoEsVerdadero()){
							return true;	
						}	
					}*/
					return true;
				}
			}
		}
		return false;
	}
	
	private Double calcularAlturaA(){
		return (calcularT()/ladoA);
	}
	
	private Double calcularT(){
		return(0.5*Math.sqrt((ladoA+ladoB-ladoC)*(ladoA-ladoB+ladoC)
				*(-ladoA+ladoB+ladoC)*(ladoA+ladoB+ladoC)));
	}
	
	public Double calcularElArea(){
		Double base = ladoA;
		Double altura = calcularAlturaA();
		
		return ((base*altura)/2);
	}
	
	public Double calcularElPerimetro(){
		return (this.ladoA + this.ladoB + this.ladoC);
	}
	
	public String dibujarFigura(){
		return "Se dibuja un triangulo con un area de " + calcularElArea() + " y un perímetro de " + calcularElPerimetro();
	}
	
	public Double getLadoA(){
		return ladoA;
	}
}
