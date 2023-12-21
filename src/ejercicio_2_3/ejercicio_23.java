package ejercicio_2_3;

import java.util.Scanner;

public class ejercicio_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribir un algoritmo para que nos diga si un número introducido es primo o
		// no.

		int num;
		int primo = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero.");
		num = scan.nextInt();

		scan.close();

		for (int i = num; i > 0; i--) {

			if (num % i == 0) {

				primo++; // Con un nº primo solo saldrá resto = 0 dos veces como máximo
			}

		}

		if (primo >= 1 && primo <= 2) { // primo >= 1 para solucionar que 1 es primo

			System.out.println("El número introducido es primo.");

		} else if (primo > 2) {

			System.out.println("El número introducido no es primo.");
			
		} else {
			
			System.out.println("El número introducido no es válido.");

		}

	}
}
