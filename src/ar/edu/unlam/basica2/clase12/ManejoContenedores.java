package ar.edu.unlam.basica2.clase12;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ManejoContenedores {
	
	public Collection rellenar(Collection c){
		c.add("perro");
		c.add("gato");
		c.add("perro");
		
		return c;
	}
	
	public Map rellenar(Map m){
		m.put("Homero", "perro");
		m.put("Ramon", "gato");
		m.put("Felipe", "perro");
		
		return m;
	}
}
