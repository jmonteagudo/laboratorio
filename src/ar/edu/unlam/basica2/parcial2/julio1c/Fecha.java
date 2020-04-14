package ar.edu.unlam.basica2.parcial2.julio1c;

public class Fecha {

	
	    private Integer dia;
	    private Integer mes;
	    private Integer anio;

	    public Fecha(Integer dia, Integer mes, Integer anio) {
	        super();
	        this.dia = dia;
	        this.mes = mes;
	        this.anio = anio;
	    }

	    public Integer getDia() {
	        return dia;
	    }

	    public void setDia(Integer dia) {
	        this.dia = dia;
	    }

	    public Integer getMes() {
	        return mes;
	    }

	    public void setMes(Integer mes) {
	        this.mes = mes;
	    }

	    public Integer getAnio() {
	        return anio;
	    }

	    public void setAnio(Integer anio) {
	        this.anio = anio;
	    }

	    public String toString() {
	        return  dia + ":" + mes + ":" + anio;
	    }

	
}
