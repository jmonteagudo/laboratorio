package ar.edu.unlam.basica2.clase12;

import static org.junit.Assert.*;

import ar.edu.unlam.basica2.clase11.*;

import org.junit.Test;

public class TestArrays {
	
	/* Beneficios: Eficiencia y tipo (Se crean para un tipo específico). Única opción para guardar tipos de datos primitivos
		Contras: Tamaño limitado
	*/
	@Test
	public void test() {
		//Distintas formas de inicialización
		
		Animal deRio[]; // Referencia Null
		Animal zoologico[] = new Animal[100]; 
				
		for(int i=0; i<zoologico.length; i++){
			zoologico[i] = TestNaturaleza.crearAnimales();
		}
		
		deRio = new Animal[] {new Pez("", "", ""), new Anfibio("", "", "")};
		
		// Eficiencia
		System.out.println("Quinto animal del zoologico: " + zoologico[4]);	
	}

}
