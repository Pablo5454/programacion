package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Primitiva, sacar 6 números diferentes aleatorios del 1 al 49.

		int[] numeros = new int[6];

		Scanner scan = new Scanner(System.in);

		for (int j = 0; j < numeros.length; j++) {

			numeros[j] = (int) (Math.random() * 49) + 1;

			for (int i = 0; i < numeros.length; i++) {

				if (numeros[j] == numeros[i] && i != j) {

					System.out.println("Número repetido" + j + ": " + numeros[j]);
					numeros[j] = (int) (Math.random() * 49) + 1;
					i = 0;
					System.out.println("Número cambiado" + j + ": " + numeros[j]);
				}

			}

			System.out.println("Número " + j + ": " + numeros[j]);

		}

		scan.close();

	}

}
