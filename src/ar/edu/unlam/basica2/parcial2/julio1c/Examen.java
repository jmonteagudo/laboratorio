package ar.edu.unlam.basica2.parcial2.julio1c;

public class Examen {
	  private String asignatura;
	    private String aula;
	    private Fecha fecha;
	    private Hora hora;

	    public Examen(String asignatura, String aula, Fecha fecha, Hora hora) throws Exception {

	        this.asignatura = asignatura;
	        this.aula = aula;
	        this.fecha = fecha;
	        this.hora = new Hora(10,10);
	        this.fecha=new Fecha(10,10,2018);
	    }

	    public String getAsignatura() {
	        return asignatura;
	    }

	    public void setAsignatura(String asignatura) {
	        this.asignatura = asignatura;
	    }

	    public String getAula() {
	        return aula;
	    }

	    public void setAula(String aula) {
	        this.aula = aula;
	    }

	    public Fecha getFecha() {
	        return fecha;
	    }

	    public void setFecha(Fecha fecha) {
	        this.fecha = fecha;
	    }

	    public Hora getHora() {
	        return hora;
	    }

	    public void setHora(Hora hora) {
	        this.hora = hora;
	    }

	    public String toString() {
	        return "Asignatura: " + asignatura + "\nAula: " + aula + "\nFecha: " + fecha.toString() + "\nHora: "
	                + hora.toString();
	    }

	}

