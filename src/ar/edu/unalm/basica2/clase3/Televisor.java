package ar.edu.unalm.basica2.clase3;

public class Televisor {
	
	private int volumen;
	private int canal;
	
	public Televisor(){
		this.volumen = 10;
		this.canal = 2;
	}
	
	public Televisor(int volumen, int canal){
		this.volumen = volumen;
		this.canal = canal;
	}
	
	public Televisor(String volumen, String canal){
		this.volumen = Integer.parseInt(volumen);
		this.canal = Integer.parseInt(canal);
	}
	
	public int getVolumen(){
		return this.volumen;
	}
	
	public void setVolumen(int volumen){
		if(volumen>=0){
			this.volumen = volumen;
		}
	}
	
	public void ajustarVolumen(String modo){
		if(modo.equals("subir")){
			volumen++;
		}
		else{
			volumen--;
		}
	}
	
	public void cambiarCanal(String modo){
		if(modo.equals("subir")){
			canal++;
		}
		else{
			canal--;
		}
	}
	
	public int getCanal(){
		return this.canal;
	}
	
	public void setCanal(int canal){
		if(canal>0 && canal<200){
			this.canal = canal;
		}
	}
	
	

}
