package ejercicio_2_3;

import java.util.Scanner;

public class ejercicio_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definir una variable con un valor aleatorio entre 0 y 100 utilizando:
		// (int)Math.floor(Math.random() * (max - min + 1) + min)
		// Decirle al usuario que diga cuál es el número.
		// Pedir números hasta que acierte, pero hay que darle pistas,
		// diciendo si el número introducido es mayor o menor que el que tiene que
		// acertar.
		// Visualizar el número de veces que ha necesitado para adivinar el número.

		Scanner scan = new Scanner(System.in);

		int num = Integer.MIN_VALUE;
		int random = 0;
		int i = 0;

		random = (int) Math.floor(Math.random() * (100 - 0 + 1) + 0);

		
	
		while (num != random) {
			
			System.out.println("Introduce un número.");
			num = scan.nextInt();
			i = i + 1;
			
			if (num > random) {
				System.out.println("El número es menor.");
			} else if (num < random) {
				System.out.println("El número es mayor.");
			}
			
		}
		
		System.out.println("Acertaste tras " + i + " intentos.");

		scan.close();

	}

}
