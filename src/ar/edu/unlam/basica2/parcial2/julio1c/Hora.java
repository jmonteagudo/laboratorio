package ar.edu.unlam.basica2.parcial2.julio1c;

public class Hora {

	private Integer hora;
    private Integer minuto;

    public Hora(Integer hora, Integer minuto) throws Exception {
        if (hora> 23 || minuto> 59) {
            throw new Exception(); // SI LA HORA EL MINUTO NO SON
                                                    // CORRECTOS, SE LANZA
                                                    // EXCEPCION
        }
        this.hora = hora;
        this.minuto = minuto;
    }

    public Integer getHora() {
        return hora;
    }
    
    public void setHora(Integer hora) throws Exception {
    	if (hora> 23 || hora < 0) {
            throw new Exception(); // SI LA HORA EL MINUTO NO SON
                                                    // CORRECTOS, SE LANZA
                                                    // EXCEPCION
        }
        this.hora = hora;
    	
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public String toString() {
        return hora + ":" + (minuto < 10 ? "0" : "") + minuto;
    }


}
