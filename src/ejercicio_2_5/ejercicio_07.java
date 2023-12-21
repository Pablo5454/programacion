package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer el número n y definir un array de esa longitud. 
		// Rellena con números aleatorios del 1 al 10 y luego calcula el más alto.
		
		Scanner scan = new Scanner(System.in);
		
		int longitud, max = 0;
		
		System.out.println("Introduce la longitud del array.");	
		longitud = scan.nextInt();
		
		int[] numeros = new int [longitud];
		
		for (int i = 0; i<longitud; i++) {
			
			numeros[i] = (int) (Math.random() * 10) + 1;
			System.out.println(numeros[i]);	
			
			if (i > max) {
				
				max = numeros[i];
			}

		}
		
		System.out.println("El número más alto es: " + max);	

		
		scan.close();
		
	}

}
