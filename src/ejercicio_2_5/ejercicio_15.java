package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa Java que llene un array con 10 números enteros que se leen por
		// teclado. A continuación calcula y muestra la media de los valores positivos y
		// la de los valores negativos del array.

		int[] numeros = new int[10];
		int mayores = 0, menores = 0;
		double mediamas = 0, mediamenos = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Introduce un número para la posición " + (i + 1) + ".");

			numeros[i] = scan.nextInt();

			if (numeros[i] > 0) {
				mayores++;
				mediamas += numeros[i];
			} else if (numeros[i] < 0) {
				menores++;
				mediamenos += numeros[i];
			}
		}

		System.out.println("La media de los números positivos es: " + (mediamas / mayores) + ".");

		if (mediamenos < 0) {
			System.out.println("La media de los números negativos es: " + (mediamenos / menores) + ".");
		} else {
			System.out.println("La media de los números negativos es: 0.");
		}
		scan.close();
	}

}
