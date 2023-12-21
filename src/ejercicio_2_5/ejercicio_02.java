package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definir un array de longitud 5 y rellenalo con las palabras introducidas por el teclado.

		Scanner scan = new Scanner(System.in);
		
		String[] numeros = new String[5];

		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce una palabra.");
			numeros[i] = scan.nextLine();
			
			
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(i + ":" + numeros[i] + " ");
			
		}
		
		
		scan.close();
		
		
		
	}

}
