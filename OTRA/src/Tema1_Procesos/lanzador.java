package Tema1_Procesos;

import java.io.File;
import java.io.IOException;

public class lanzador {

	public static void main(String[] args) {
		
		

		
		//String [] tira = {"java","-cp","./bin","Procesos.llamada_Proceso"};

	

		

		File file = new File("ficheroNormal.txt");
		File fileError = new File("ficheroError.txt");
		
		ProcessBuilder proceso = new ProcessBuilder("java","-cp","./bin","Procesos.llamada_Proceso");

		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("creando el ficheroNormal");
			} catch (IOException e) {
				System.out.println("Error al crear el ficheroNormal");
			}
			
		}else {
			System.out.println("Ya existe el ficheroNormla");
			System.out.println("Abriendo ficheroNormal");	
		}
		
		if(!fileError.exists()) {
			try {
				fileError.createNewFile();
				System.out.println("creando el ficheroError");
			} catch (IOException e) {
				System.out.println("Error al crear el ficheroError");
			}
			
		}else {
			System.out.println("Ya existe el ficheroError");
			System.out.println("Abriendo ficheroError");	
		}
		
		

		
		
		try {
			proceso.redirectOutput(file);
			proceso.redirectError(fileError);
			
			
			
			Process pro = proceso.start();

		} catch (IOException e) {
			System.out.println("Error al iniciar el hilo");
			e.printStackTrace();
		}
		
		


	}

}
