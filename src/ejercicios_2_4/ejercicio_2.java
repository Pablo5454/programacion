package ejercicios_2_4;

import java.util.Scanner;

public class ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Introducir por teclado una frase y sacar por pantalla un carácter por cada línea.
		
		String palabra;
		int longitud;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una palabra.");
		palabra = scan.nextLine();
		
		longitud = palabra.length();
		
		for (int i = 0; i < longitud ; i++) {
		
			System.out.println(palabra.substring(i, i+1));
			//System.out.println(palabra.charAt(i));
		
		}
		
		scan.close();
	}

}
