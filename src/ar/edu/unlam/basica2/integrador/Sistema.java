package ar.edu.unlam.basica2.integrador;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Sistema implements java.io.Serializable{
	private String nombreDelCliente;
	private Boolean activo;
	private Map<String, String> configuracion;
	
	public Sistema (String nombreDelCliente) {
		this.nombreDelCliente = nombreDelCliente;
		configuracion = new HashMap<String, String>();
	}
	
	public String getNombreDelCliente() {
		return this.nombreDelCliente;
	}
	
	public void setConfiguracion(String clave, String valor) {
		configuracion.put(clave, valor);
	}
	
	public String getConfiguracion(String clave) {
		return configuracion.get(clave);
	}
	

}
