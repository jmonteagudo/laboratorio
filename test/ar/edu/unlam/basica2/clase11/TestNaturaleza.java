package ar.edu.unlam.basica2.clase11;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runners.JUnit4;

public class TestNaturaleza {
	
	private static final int ARAÑA = 1;
	private static final int HORMIGA = 2;
	private static final int CANGREJO = 3;
	private static final int PEZ_PAYASO = 4;
	private static final int TIBURON = 5;
	private static final int HIPOPOTAMO = 6;
	private static final int HALCON = 7;
	private static final int COLIBRI = 8;
	private static final int COCODRILO = 9;
	private static final int IGUANA = 10;
	private static final int LEON = 11;
	private static final int LEOPARDO = 12;
	private static final int CABALLO = 13;
	private static final int VACA = 14;
	private static final int CHANCHO = 15;
	private static final int HUMANO = 16;

	public static Animal crearAnimales(){
		Integer animalAleatorio = (int)(Math.random()*20+1);
		
		switch(animalAleatorio){
		case ARAÑA:
			return new Invertebrado("Con 8 patas");
		case HORMIGA:
			return new Invertebrado("Pequeño, rojo o negro, con 6 patas");
		case CANGREJO:
			return new Invertebrado("Rojizo o amarillo. Camina de costado");
		case PEZ_PAYASO:
			return new Pez("Pequeña", "De muchos colores", "De colores");
		case TIBURON:
			return new Pez("Con dientes filosos", "Largo", "Largas");
		case HIPOPOTAMO:
			return new Anfibio("Redonda", "Redondo", "Cortas");
		case HALCON:
			return new Ave("Con pico de rapiña", "Poderoso", "Alas enormes");
		case COLIBRI:
			return new Ave("Pequeña", "De colores", "Alas rapídisimas");
		case COCODRILO:
			return new Reptil("Con boca enorme", "Muy largo", "Patas cortas y cola larga");
		case IGUANA:
			return new Reptil("Con lengua larga", "Pequeño", "Patas pequeñas. Cola finita");
		case LEON:
			return new Carnivoro("Con melena", "Con pelo corto", "Cuatro patas y cola");
		case LEOPARDO:
			return new Carnivoro("Con orejas pequeñas", "Con manchas", "Cuatro patas y cola");
		case CABALLO:
			return new Hervivoro("Con hocico largo", "Grande para montar", "Largas con cola peluda");
		case VACA:
			return new Hervivoro("Grande", "Obeso", "Cola para espantar moscas");
		case CHANCHO:
			return new Omnivoro("Redonda", "Obeso", "Patas cortas y cola enroscada");
		default:
			return new Humano("Pequeña", "Erguido", "Dos piernas y dos brazos");
		}
	}
	
	public static Animal[] ingresarAnimales(){
		Animal a[] = new Animal[100];
		for(int i=0; i<10; i++){
			a[i] = crearAnimales();
		}
		return a;
	}
	
	@Test
	public void crearUnAnimal(){
		Animal unAnimal = crearAnimales();
		System.out.println(unAnimal);
	}
}