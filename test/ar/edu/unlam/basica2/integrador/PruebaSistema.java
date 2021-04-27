package ar.edu.unlam.basica2.integrador;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;
import ar.edu.unlam.basica2.utils.ManejoDeArchivos;

public class PruebaSistema {

	@Test
	public void queSePuedaGuardarUnaNuevaConfiguracion() {
		// Preparación de los datos
		Sistema miel = new Sistema("Unlam");
		String clave= "Idioma", valor = "Español";
		//Ejecución
		miel.setConfiguracion("Idioma", "Español");
		//Verificación
		assertEquals(valor, miel.getConfiguracion(clave));
	}
	
	@Test
	public void queSePuedaAlmacenarLaConfiguracion() {
		// Preparación de los datos
		Sistema miel = new Sistema("Unlam");
		miel.setConfiguracion("Idioma", "Español");
		miel.setConfiguracion("Path", "C://tmp//desktop.config");
		
		//Ejecución
		try {
			ManejoDeArchivos.guardarObjeto(miel.getConfiguracion("Path"), miel);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		miel.setConfiguracion("Idioma", "English");
		try {
			miel = (Sistema)ManejoDeArchivos.leerObjetos(miel.getConfiguracion("Path"));
		} catch (ClassNotFoundException e) {
			System.err.println("El archivo encontrado no se puede convertir a Sistema");
		}catch(IOException e) {
			System.err.println("Archivo no encontrado");
		}
		//Verificación
		assertEquals("Español", miel.getConfiguracion("Idioma"));
	}

}
