package ejercicios_2_4;

import java.util.Scanner;

public class ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Decir si una palabra es palíndroma o no.

		String palabra, w = ""; // w = palabra al revés
		int longitud;

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una palabra.");
		palabra = scan.nextLine();

		longitud = palabra.length();

		for (int i = longitud - 1; i >= 0; i--) {
			w = w + palabra.charAt(i);
			// Suma la letra indicada a la variable w. Comienza desde el final
		}

		if (palabra.equalsIgnoreCase(w)) {
			System.out.println("La palabra es un palíndromo.");
		} else {
			System.out.println("La palabra no es un palíndromo.");
		}

		scan.close();

	}

}
