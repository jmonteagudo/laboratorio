package ar.edu.unlam.basica2.clase12;

import static org.junit.Assert.*;
import ar.edu.unlam.basica2.clase11.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestCollection {
	
	/*
	 * Collection: Grupo de elementos individuales a los que generalmente se les aplica alguna regla
	 * List (Lista): Debe contener elementos en una secuencia concreta.
	 * 		ArrayList: Array con tamaño dinámico
	 * 		LinkedList: Lista doblemente enlazada
	 * Set (Conjunto): No puede tener elementos duplicados
	 * 
	 */
	
	ManejoContenedores c;
	
/*	@Test
	public void testRellenarArrayList() {
		c = new ManejoContenedores();
		
		System.out.println("Array List");
		System.out.println(c.rellenar(new ArrayList()));
	}
	
	@Test
	public void testRellenarLinkedList(){
		c = new ManejoContenedores();
		
		System.out.println("Linked List");
		System.out.println(c.rellenar(new LinkedList()));
	}*/
/*	
	@Test
	public void testRellenarHashSet(){
		c = new ManejoContenedores();
		
		System.out.println("Array Hash Set");
		System.out.println(c.rellenar(new HashSet()));
	}*/
	
	@Test
	public void testRecorrerUnaLista(){
			
		ArrayList<Animal> veterinaria = new ArrayList<Animal>();
		Animal paciente = new Pez("cabeza", "tronco", "extremidades");
		veterinaria.add(paciente);
		for(int i=0; i<100; i++){
			veterinaria.add(TestNaturaleza.crearAnimales());
		}
		paciente = new Reptil("Cabeza agregada despues del null", "", "");
		veterinaria.add(paciente);
		veterinaria.add(null);
		Iterator<Animal> mascotas = veterinaria.iterator();
		while(mascotas.hasNext()){
			try{
				System.out.println((mascotas.next()).toString());
			}catch(NullPointerException e){
				System.err.println("Se escapó la tortuga");
			}
		}
	}
}
