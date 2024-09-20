package Procesos;

import java.io.IOException;

public class Prueba_Proceso {

	public static void main(String[] args) {
		
		
		ProcessBuilder proceso = new ProcessBuilder("notepad.exe");
		
		try {
			proceso.start();			
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		/*
		
		int a = 3, b = 5;
		
		int suma = 0;
		
		for (int i = a; i <= b; i++) {
			suma+= i;
		}
		
		System.out.println(suma);
		*/
	}

}
