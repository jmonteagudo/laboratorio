package ar.edu.unlam.basica2.map;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestMaps {

	@Test
	public void pruebaBasicaDeMap() {
		Map<String, String> equipo = new HashMap<String, String>();

		/*
		 * 
		 */
		
		/*equipo.put(1, "Armani");
		equipo.put(2, "Martinez Cuarta");
		equipo.put(4, "Montiel");
		equipo.put(6, "Otamendi");
		equipo.put(3, "Tagliafico");
		equipo.put(8, "De Paul");
		equipo.put(5, "Paredes");
		equipo.put(11, "Ocampos");
		equipo.put(10, "Messi");
		equipo.put(9, "Alario");
		equipo.put(5, "Perez");*/
		
		equipo.put("Armani", "Arquero");
		equipo.put("Martinez Cuarta", "Defensor");
		/*equipo.put("Montiel");
		equipo.put(6, "Otamendi");
		equipo.put(3, "Tagliafico");
		equipo.put(8, "De Paul");
		equipo.put(5, "Paredes");*/
		equipo.put("Ocampos", "Mediocampista");
		equipo.put("Messi", "Lo que quiera");
		equipo.put("Alario", "Delantero");
		equipo.put("Perez", "Mediocampista");
	
	}
	
	@Test
	public void queSePuedaGuardarUnaNuevaConfiguracion() {
		
		Sistema miel = new Sistema("Miel");
		
		miel.setConfiguracion("path", "c://tmp");
		miel.setConfiguracion("idioma", "Español");
		miel.setConfiguracion("colorFondo", "Verde");
		
		assertEquals("c://tmp", miel.getConfiguracion("path"));
		assertEquals("Español", miel.getConfiguracion("idioma"));
	}
	
	@Test
	public void queSeGuardaEnElDisco() {
		
		Sistema miel = new Sistema("Miel");
		
		miel.setConfiguracion("path", "c://tmp//web.config");
		miel.setConfiguracion("idioma", "Español");
		miel.setConfiguracion("colorFondo", "Verde");
		miel.setConfiguracion("enMatenimiento", "False");
				
		try {
			ManejoDeArchivos.guardarObjeto(miel.getConfiguracion("path"), miel);
		} catch (FileNotFoundException e) {
			System.err.println("No se pudo abrir el archivo");
		} catch(IOException i) {
			System.err.println("Ocurrió un error guardando el objeto");
		}
		
	}
	
	@Test (expected = Exception.class)
	public void queSePuedeRecuperarLoGuardado() {
		
		Sistema miel;
		try {
			miel = (Sistema)ManejoDeArchivos.leerObjetos("c://tmp//web.config");
			assertNotNull(miel);
			assertEquals("Español", miel.getConfiguracion("idioma"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		

		
	}

}
