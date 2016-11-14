package ar.edu.unlam.basica2.clase02;

import static org.junit.Assert.*;
import org.junit.Test;

import ar.edu.unlam.basica2.clase02.Alumno;
import ar.edu.unlam.basica2.clase02.Estado;

public class AlumnoTest {
	
	@Test
	public void queLaCreacionDelAlumnoSinParametrosGeneraElNombreVacio(){
		
		Alumno uname = new Alumno();
		assertEquals(uname.getNombre(), "");
			}
	/*
	@Test
	public void queLaCreacionDelAlumnoSinParametrosGeneraElLaEdadEnCero(){
		
		Alumno uname = new Alumno();
		assertEquals(uname.getEdad(), 0);
	}
	
	@Test
	public void queLaCreacionDelAlumnoSinParametrosGeneraLaCantidadCorrectaDeParciales(){
		
		Alumno uname = new Alumno();
		
		for(int i=0; i<3; i++){
			assertEquals(uname.getNotaParcial(i), null);
			assertNull(uname.getNotaParcial(i));
		}
	}
	
	@Test
	public void queLaCreacionDelAlumnoSinParametrosGeneraLaCantidadCorrectaDeFinales(){
		
		Alumno uname = new Alumno();
		
		for(int i=0; i<5; i++){
			assertEquals(uname.getNotaFinal(i), null);
			assertNull(uname.getNotaFinal(i));
		}
	}	
	*/
	@Test
	public void queLaCreacionDelAlumnoConLosParametrosNombreYEdadLosGeneraCorrectamente(){
		
		Alumno gerardo = new Alumno("Gerardo", 33);
		
		assertEquals(gerardo.getNombre(), "Gerardo");
		assertEquals(gerardo.getEdad(), 33);
	}
	/*
	@Test
	public void queModificaCorrectamenteElNombreDelAlumno(){
		
		Alumno gerardo = new Alumno("Gerardo", 33);
		
		gerardo.setNombre("Tomas");
		assertEquals(gerardo.getNombre(), "Tomas");
	}
	
	@Test
	public void queSabeCumplirAños(){
		
		Alumno uname = new Alumno("Gerardo", 33);
		
		uname.crecer();
		assertEquals(uname.getEdad(), 34);		
	}		
	
	@Test
	public void queNoPermiteIrAClaseSiLaClaseAunNoFueHabilitada(){
		
		Alumno uname = new Alumno("Gerardo", 33);
		
		uname.irAClase();
		assertEquals(0, uname.getCantidadAsistencias());		
	}	
	
	@Test
	public void queTomaAsistenciaCorrectamente(){
		
		Alumno uname = new Alumno("Gerardo", 33);
		
		Alumno.habilitarDiaDeClase();;
		uname.irAClase();
		assertEquals(uname.getCantidadAsistencias(), 1);		
	}	
	
	@Test
	public void queAmbosArraysConLasNotasNoSeanIgualesAlInstanciarUnAlumno(){
		
		Alumno uname = new Alumno();
		
		assertNotSame(uname.getNotasParciales(), uname.getNotasFinales());
		
	}
	
	@Test
	public void queAntesDeComenzarLaCursadaElAlumnoEstaInscripto(){
		Alumno uname = new Alumno();
		
		assertEquals(Estado.INSCRIPTO, uname.determinarEstadoDelAlumnoEnLaMateria());
	}
	
	@Test
	public void queAlComenzarLaCursadaElAlumnoEsteCursando(){
		
		Alumno uname = new Alumno();
		
		Alumno.habilitarDiaDeClase();
		assertEquals(Estado.CURSANDO, uname.determinarEstadoDelAlumnoEnLaMateria());
	}
	
	@Test
	public void queUnAlumnoPromociona(){
		
		Estado estadoDelAlumno = Estado.INSCRIPTO;
		Float promedio = 0.0F;
		Float promedioEsperado;
		
		Alumno gerardo = new Alumno("Gerardo", 33);
		
		for(int i=1; i<=(Alumno.CANTIDAD_DIAS_DE_CLASES/2); i++){
			Alumno.habilitarDiaDeClase();
			gerardo.irAClase();
		}
		
		gerardo.rendirParcial(1, 7);
		
		for(int i=(Alumno.CANTIDAD_DIAS_DE_CLASES/2); i<=Alumno.CANTIDAD_DIAS_DE_CLASES; i++){
			Alumno.habilitarDiaDeClase();
			gerardo.irAClase();
		}
		
		gerardo.rendirParcial(2, 7);
		estadoDelAlumno = gerardo.determinarEstadoDelAlumnoEnLaMateria();
		assertEquals(Estado.PROMOCIONADO, estadoDelAlumno);
		promedio = gerardo.calcularPromedio();
		promedioEsperado = new Float(7.0F);
		assertEquals(promedioEsperado, promedio);	
	}
	
	@Test
	public void queUnAlumnoApruebaElPrimerLlamado(){
		
		Estado estadoDelAlumno = Estado.INSCRIPTO;
		Float promedio = 0.0F;
		Float promedioEsperado;
		
		Alumno gerardo = new Alumno("Gerardo", 33);
		
		for(int i=1; i<=(Alumno.CANTIDAD_DIAS_DE_CLASES/2); i++){
			Alumno.habilitarDiaDeClase();
			gerardo.irAClase();
		}
		
		gerardo.rendirParcial(1, 7);
		
		for(int i=(Alumno.CANTIDAD_DIAS_DE_CLASES/2); i<=Alumno.CANTIDAD_DIAS_DE_CLASES; i++){
			Alumno.habilitarDiaDeClase();
			gerardo.irAClase();
		}
		
		gerardo.rendirParcial(2, 4);
		estadoDelAlumno = gerardo.determinarEstadoDelAlumnoEnLaMateria();
		assertEquals(Estado.PENDIENTE_DE_RENDICION_DEL_FINAL, estadoDelAlumno);
		promedio = gerardo.calcularPromedio();
		promedioEsperado = new Float(5.5F);
		assertEquals(promedioEsperado, promedio);
		gerardo.rendirFinal(1, 4);
		estadoDelAlumno = gerardo.determinarEstadoDelAlumnoEnLaMateria();
		assertEquals(Estado.APROBADO, estadoDelAlumno);

	}
	
	@Test
	public void queUnAlumnoApruebaElSegundoLlamado(){
		
		Estado estadoDelAlumno = Estado.INSCRIPTO;
		Float promedio = 0.0F;
		Float promedioEsperado;
		
		Alumno gerardo = new Alumno("Gerardo", 33);
		
		for(int i=1; i<=(Alumno.CANTIDAD_DIAS_DE_CLASES/2); i++){
			Alumno.habilitarDiaDeClase();
			gerardo.irAClase();
		}
		
		gerardo.rendirParcial(1, 4);
		
		for(int i=(Alumno.CANTIDAD_DIAS_DE_CLASES/2); i<=Alumno.CANTIDAD_DIAS_DE_CLASES; i++){
			Alumno.habilitarDiaDeClase();
			gerardo.irAClase();
		}
		
		gerardo.rendirParcial(2, 7);
		estadoDelAlumno = gerardo.determinarEstadoDelAlumnoEnLaMateria();
		assertEquals(Estado.PENDIENTE_DE_RENDICION_DEL_FINAL, estadoDelAlumno);
		promedio = gerardo.calcularPromedio();
		promedioEsperado = new Float(5.5F);
		assertEquals(promedioEsperado, promedio);
		gerardo.rendirFinal(1, 2);		
		estadoDelAlumno = gerardo.determinarEstadoDelAlumnoEnLaMateria();		
		assertEquals(Estado.PENDIENTE_DE_RENDICION_DEL_FINAL, estadoDelAlumno);
		gerardo.rendirFinal(2, 10);
		assertEquals(Estado.APROBADO, estadoDelAlumno);

	}*/
}
