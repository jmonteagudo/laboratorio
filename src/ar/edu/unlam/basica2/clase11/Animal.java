package ar.edu.unlam.basica2.clase11;

public abstract class Animal {
	
	private Integer edad;
	
	public abstract void nacer();
	public abstract void comer();
	public void crecer(){
		edad++;
	}
	
	public void reproducir(){
		System.out.println("Celula masculina se une con celula femenina");
	}
	
	public void morir(){
		try {
			this.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public abstract String toString();
}
