package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definir un array de 10, pedir al usuario diez números e ir rellenando
		// introduciendo los números en la posición que corresponda para que el array
		// quede ordenado ascendentemente.

		int[] numeros = new int[10];
		int m = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {  // Solo para rellenar el array.

			System.out.println("Introduce un número.");

			numeros[i] = scan.nextInt();
			
			//System.out.println("Posición " + i + ": " + (numeros[i]));
			
		}

			for (int j = 0; j < numeros.length; j++) {
				
								
				for (int k = numeros.length -1; k > 0; k--) {

					if (numeros[j] > numeros[k] && j<k) {
						
						m = numeros[k];
						numeros[k] = numeros[j];
						numeros[j] = m;
						
	
					}else if (numeros[j] < numeros[k] && j>k)  {
	
						m = numeros[k];
						numeros[k] = numeros[j];
						numeros[j] = m;
					}
				
				}
				
			}
			
			for (int j = 0; j < numeros.length; j++) { // Solo para mostrar el array.
				
				System.out.println("Posición " + j + ": " + (numeros[j]));
			}
		
		scan.close();
	}

}
