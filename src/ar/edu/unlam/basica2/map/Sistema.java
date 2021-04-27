package ar.edu.unlam.basica2.map;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Sistema implements Serializable{
	
	private String nombre;
	private Map<String, String> configuracion;
	private Set<String> nombreDeLaConfiguracion;

	public Sistema(String nombre) {
		this.nombre = nombre;
		//configuracion = new LinkedHashMap<String,String>();
		configuracion = new TreeMap<String, String>();
	}

	public void setConfiguracion(String clave, String valor) {
		configuracion.put(clave, valor);
	}
	
	public String getConfiguracion(String clave) {
		return configuracion.get(clave);
	}
	
}
