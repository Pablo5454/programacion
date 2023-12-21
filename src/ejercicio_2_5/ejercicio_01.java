package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define un array de longitud 5 y rellénalo con palabras.
		
		Scanner scan = new Scanner(System.in);
		
		String[] numeros = new String[5];
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = "Palabra_" + i;
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(i + ": " + numeros[i] + " ");
			
		}
		
		
		scan.close();
	}

}
