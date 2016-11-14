package ar.edu.unlam.basica2.clase02;

public class Alumno {
	
	private static int CANTIDAD_DE_CLASES_BRINDADAS = 0;
	public static final int CANTIDAD_DIAS_DE_CLASES = 20;
	
	// Declaración de campos o atributos
	
	private String nombre = "";
	private int edad;
	private int cantidadAsistencias;
	private Float notasParciales[];
	private Float notasFinales[];
	private Estado estadoDelAlumnoEnLaMateria;
	
	// Declaración de métodos
	
	public Alumno(){
		this.nombre = "";
		this.edad = 17;
		this.cantidadAsistencias = 0;
		this.notasParciales = new Float[3];
		this.notasFinales = new Float[5];
		this.estadoDelAlumnoEnLaMateria = Estado.INSCRIPTO;
	}
	
	// Sobrecargo el constructor
	public Alumno(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		this.cantidadAsistencias = 0;
		this.notasParciales = new Float[3];
		this.notasFinales = new Float[5];
		this.estadoDelAlumnoEnLaMateria = Estado.INSCRIPTO;
	}

	//Modificador Devuelve NombreMetodo (Parametros)
	//public String getNombre();
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void crecer(){
		edad++;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public Float[] getNotasParciales() {
		return notasParciales;
	}

	public void setNotasParciales(Float[] notasParciales) {
		this.notasParciales = notasParciales;
	}

	public Float[] getNotasFinales() {
		return notasFinales;
	}

	public void setNotasFinales(Float[] notasFinales) {
		this.notasFinales = notasFinales;
	}	
	
	public void irAClase(){
		if(this.cantidadAsistencias<Alumno.CANTIDAD_DE_CLASES_BRINDADAS){
			this.cantidadAsistencias++;
		}
	}
	
	public int getCantidadAsistencias(){
		return cantidadAsistencias;
	}
	
	public float calcularPorcentajeAsistencias(){
		if(CANTIDAD_DE_CLASES_BRINDADAS>0){
			return (cantidadAsistencias / CANTIDAD_DE_CLASES_BRINDADAS);
		}
		else{
			return 1;
		}
	}
	
	public float calcularPromedio(){

		float promedio = 0F;
		
		if((notasParciales[0]==null)||(notasParciales[1]==null)){
			promedio=0;
		}
		else if(notasParciales[2]==null){
			promedio = ((notasParciales[0] + notasParciales[1])/2);
		}
		else if(notasParciales[0]>notasParciales[1]){
			promedio = ((notasParciales[0] + notasParciales[2])/2);
		}
		else{
			promedio = ((notasParciales[1] + notasParciales[2])/2);
		}
		
		return promedio;
	}
	
	public void rendirParcial(int numeroParcial, float notaParcial){
		notasParciales[numeroParcial-1] = new Float(notaParcial);
	}
	
	public void rendirPrimerParcial(float notaParcial){
		notasParciales[0]=notaParcial;
	}
	
	
	
	public Float getNotaParcial(int numeroParcial){
		return notasParciales[numeroParcial];
	}
	
	public void rendirFinal(int llamado, float notaDelFinal){
		notasFinales[llamado] = notaDelFinal;
	}
	
	public Float getNotaFinal(int llamado){
		return notasFinales[llamado];
	}
	
	private int calcularCantidadLlamadosAFinal(){
		
		int cantidadDeLlamadosAFinal = 0;
		
		for(Float notaFinal:notasFinales){
			if(notaFinal == null){
				break;
			}
			else{
				cantidadDeLlamadosAFinal++;
			}
		}
		return cantidadDeLlamadosAFinal;
	}
	
	private int calcularCantidadDeFinalesRendidos(){
		
		int cantidadDeFinalesRendidos = 0;
		
		for(Float notaFinal:notasFinales){
			if(notaFinal == null){
				break;
			}
			else if (notaFinal != 0){
				cantidadDeFinalesRendidos++;
			}
		}
		
		return cantidadDeFinalesRendidos;
	}
	
	private Float calcularNotaDelFinal(){
		return(notasFinales[calcularCantidadLlamadosAFinal()]);
	}
	
	public Estado determinarEstadoDelAlumnoEnLaMateria(){
		
		float promedio = 0F;
		
		if(Alumno.CANTIDAD_DE_CLASES_BRINDADAS==0){
			this.estadoDelAlumnoEnLaMateria = Estado.INSCRIPTO;
		}
		else if(Alumno.CANTIDAD_DE_CLASES_BRINDADAS<Alumno.CANTIDAD_DIAS_DE_CLASES){
			this.estadoDelAlumnoEnLaMateria = Estado.CURSANDO;
		}
		else if(calcularPorcentajeAsistencias()<0.75){
			estadoDelAlumnoEnLaMateria = Estado.AUSENTE;
		}
		else{
			promedio = calcularPromedio();
			
			if(promedio>=7){
				estadoDelAlumnoEnLaMateria = Estado.PROMOCIONADO;
			}
			else if(promedio < 4){
				estadoDelAlumnoEnLaMateria = Estado.DESAPROBADO;
			}
			else if(calcularNotaDelFinal() >= 4F){
				estadoDelAlumnoEnLaMateria = Estado.APROBADO;
			}
			else if(calcularCantidadDeFinalesRendidos()==3){
				estadoDelAlumnoEnLaMateria = Estado.DESAPROBADO;
			}
			else if(calcularCantidadLlamadosAFinal()==5){
				estadoDelAlumnoEnLaMateria = Estado.DESAPROBADO;
			}
			else{
				estadoDelAlumnoEnLaMateria = Estado.PENDIENTE_DE_RENDICION_DEL_FINAL;
			}
		}
		return estadoDelAlumnoEnLaMateria;
	}
	
	public static void habilitarDiaDeClase(){
		Alumno.CANTIDAD_DE_CLASES_BRINDADAS++;
	}
}
