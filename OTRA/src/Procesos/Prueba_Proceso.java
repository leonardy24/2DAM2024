package Procesos;

import java.io.File;
import java.io.IOException;

public class Prueba_Proceso {

	public static void main(String[] args) {
		
		
		//String [] tira = {"java","-cp","./bin","Procesos.llamada_Proceso"};

		ProcessBuilder proceso = new ProcessBuilder("java","-cp","./bin","Procesos.llamada_Proceso");

		

		File file = new File("ficheroNormal.txt");
		File fileError = new File("ficheroError.txt");

		try {
			file.createNewFile();
			System.out.println("creando el ficheroNormal");
		} catch (IOException e) {
			System.out.println("Ya existe el ficheroNormlal");
			e.printStackTrace();
		}

		try {
			fileError.createNewFile();
			System.out.println("creando el ficheroError");
		} catch (IOException e) {
			System.out.println("Ya existe el ficheroError");
			e.printStackTrace();
		}
		
		try {
			Process pro = proceso.start();

		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
		//ESCRIBIMOS LO QUE APARECE EN LOS FICHEROS
		
		
		proceso.redirectOutput(file);
		proceso.redirectError(fileError);

	}

}
