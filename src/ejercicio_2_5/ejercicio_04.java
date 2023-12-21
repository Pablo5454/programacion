package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A el ejercicio 2, añadir sacar los nombres de la pantalla.
		
		// YA LO HABÍA AÑADIDO EN EL EJERCICIO 2. COPIO EL CÓDIGO.
		
		Scanner scan = new Scanner(System.in);
		
		String[] numeros = new String[5];
		String palabra;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce una palabra.");
			palabra = scan.nextLine();
			
			numeros[i] = palabra;
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(i + ":" + numeros[i] + " ");
			
		}

		scan.close();
		
	}

}
