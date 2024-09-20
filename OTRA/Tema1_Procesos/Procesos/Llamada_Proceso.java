package Procesos;

import java.io.IOException;

public class Llamada_Proceso {

	public static void main(String[] args) {
		
		
		ProcessBuilder proceso = new ProcessBuilder("java","Prueba_Proceso");
		
		try {
			proceso.start();
			
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		

	}

}
