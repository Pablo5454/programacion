package ejercicios_2_4;

import java.util.Scanner;

public class ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribir la palabra introducida invertida.
		
		String palabra;
		int longitud;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una palabra.");
		palabra = scan.nextLine();
		
		longitud = palabra.length();
		
		for (int i = longitud; i > 0; i--) {
		
			System.out.print(palabra.charAt(i-1));
			
		}
		
		
		scan.close();
	}

}
