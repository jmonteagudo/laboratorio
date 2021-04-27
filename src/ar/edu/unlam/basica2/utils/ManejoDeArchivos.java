package ar.edu.unlam.basica2.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManejoDeArchivos {

	public static void guardarObjeto(String path, Object objeto) throws IOException {
		FileOutputStream archivo = new FileOutputStream(path);
		ObjectOutputStream flujo = new ObjectOutputStream(archivo);
		flujo.writeObject(objeto);
		flujo.close();
		archivo.close();
	}
	
	public static Object leerObjetos(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
		Object leido;
		FileInputStream fileIn = new FileInputStream(path);
	    ObjectInputStream in = new ObjectInputStream(fileIn);
	    leido = in.readObject();
	    in.close();
	    fileIn.close();
	    
	    return leido;
	}
}
