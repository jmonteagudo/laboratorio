package ar.edu.unlam.basica2.clase05;

import static org.junit.Assert.*;

import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
public class TestEmpleados {


	@Test
	public void testQueCreaUnEmpleado() {
		
		Empleado nuevoEmpleado=new Director (100,10.0,"juan",4000.0,new Date(1950,4,4),"depto");
		
		String guardarNombreDelEmpleado=nuevoEmpleado.getNombre();
		Double guardarSalario=nuevoEmpleado.getSalario();
		Integer guardarAnioDeNacimiento=nuevoEmpleado.getAnio();
		Integer guardarMesDeNacimiento=nuevoEmpleado.getMes();
		Integer guardarDiaDeNacimiento=nuevoEmpleado.getDia();
		
		String valorEsperadoDelNombre="juan";
		Double valorEsperadoDelSalario=4000d;
		Integer valorEsperadoDelAnio= 1950;
		Integer valorEsperadoDelMes= 04;
		Integer valorEsperadoDelDia= 06;
		
		assertEquals(valorEsperadoDelNombre, guardarNombreDelEmpleado);
		assertEquals(valorEsperadoDelSalario, guardarSalario);
		assertEquals(valorEsperadoDelAnio, guardarAnioDeNacimiento);
		assertEquals(valorEsperadoDelMes, guardarMesDeNacimiento);
		assertEquals(valorEsperadoDelDia, guardarDiaDeNacimiento);
		
	}

	@Test
	public void testQueCreaUnGerente(){
		
		
		Date fechaCumpleanios = new Date (1956,10,12);
		Gerente nuevoGerente=new Gerente(2,"Ingenieria","Raul",4000d,fechaCumpleanios);
		
		
		Integer guardarCochera=nuevoGerente.getCochera();
		String guardarDepartamento=nuevoGerente.getDepartamentoAsignado();
		String guardarNombreDelGerente=nuevoGerente.getNombre();
		Double guardarSalario=nuevoGerente.getSalario();
		Integer guardarAnioDeNacimiento=nuevoGerente.getAnio();
		Integer guardarMesDeNacimiento=nuevoGerente.getMes();
		Integer guardarDiaDeNacimiento=nuevoGerente.getDia();
		System.out.println("dia esperado = " + nuevoGerente.getDia() );
		System.out.println("mes esperado = " + nuevoGerente.getMes() );
		System.out.println("Anio esperado = " + nuevoGerente.getAnio() );
		
		Integer valorEsperadoCochera=2;
		String valorEsperadoDepartamento="Ingenieria";
		String valorEsperadoDelNombre="Raul";
		Double valorEsperadoDelSalario=4000d;
		Integer valorEsperadoDelAnio= 1956;
		Integer valorEsperadoDelMes= 10;
		Integer valorEsperadoDelDia= 3;
		
		assertEquals(valorEsperadoCochera, guardarCochera);
		assertEquals(valorEsperadoDepartamento, guardarDepartamento);
		assertEquals(valorEsperadoDelNombre, guardarNombreDelGerente);
		assertEquals(valorEsperadoDelSalario, guardarSalario);
		assertEquals(valorEsperadoDelAnio, guardarAnioDeNacimiento);
		assertEquals(valorEsperadoDelMes, guardarMesDeNacimiento);
		assertEquals(valorEsperadoDelDia, guardarDiaDeNacimiento);
				
	}
	
	@Test
	public void testQueCreaUnDirector(){

		Director nuevoDirector=new Director (100,10.0,"juan",4000.0,new Date(1950,4,4),"depto");
		
		Integer guardarCochera=nuevoDirector.getCochera();
		Double guardarSueldoExtra=nuevoDirector.getSueldoExtra();
		String guardarNombreDelGerente=nuevoDirector.getNombre();
		Double guardarSalario=nuevoDirector.getSalario();
		Integer guardarAnioDeNacimiento=nuevoDirector.getAnio();
		Integer guardarMesDeNacimiento=nuevoDirector.getMes();
		Integer guardarDiaDeNacimiento=nuevoDirector.getDia();
		
		Integer valorEsperadoCochera=100;
		Double valorEsperadoDelSueldoExtra=10.00;
		String valorEsperadoDelNombre="juan";
		Double valorEsperadoDelSalario=4000.00;
		Integer valorEsperadoDelAnio= 1950;
		Integer valorEsperadoDelMes= 4;
		Integer valorEsperadoDelDia= 4;
		
		assertEquals(valorEsperadoCochera, guardarCochera);
		assertEquals(valorEsperadoDelSueldoExtra,guardarSueldoExtra);
		assertEquals(valorEsperadoDelNombre,guardarNombreDelGerente);
		assertEquals(valorEsperadoDelSalario, guardarSalario);
		assertEquals(valorEsperadoDelAnio,guardarAnioDeNacimiento);
		assertEquals(valorEsperadoDelMes,guardarMesDeNacimiento);
		/*assertEquals(valorEsperadoDelDia,guardarDiaDeNacimiento);*/
	
		
	}

}
