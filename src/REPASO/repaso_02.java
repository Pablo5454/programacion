package REPASO;

import java.util.Scanner;

public class repaso_02 {

	public static void main(String[] args) {
//	1-Rellenar un array de 5 elementos de forma estática (sin introducir por teclado). 
//
//			Menu: 
//
//			0. Salir 
//
//			1. Pedir una letra y visualizar palabras que contengan esa letra. 
//
//			2. Pedir una palabra y visualizar las coincidencias. 
//
//			3. Pedir una palabra y decir si esta en la lista o no. 
//
//			4. Borrar. Pedir una palabra y en la dirección que esta esa palabra, introducir el valor null.
//
//2- La función ordenarArray recibe un array desordenado y devuelve el array ordenado de menor a mayor.

		String[] arraypalabras = { "dhtsdsa", "srghdsfa", "ujoljhkopwer", "cncgh", "erterer" };

		Scanner scan = new Scanner(System.in);

		System.out.println("Elige una opción del menú.");

		int numero = scan.nextInt();

		switch (numero) {

		case 0:
			opcion0();
			break;
		case 1:
			opcion1(arraypalabras);
			break;
//		case 2: 
//			opcion2(arraypalabras);
//			break;
//		case 3: 
//			opcion3();
//			break;
//		case 4: 
//			opcion4();
//			break;
		}

		scan.close();

	}

	private static void opcion0() {

		System.out.println("SALIR.");

	}

	private static void opcion1(String[] arraypalabras) {

		boolean c = false;
		String palabra = "";

		System.out.println("Introduce una letra");
		Scanner scanner = new Scanner(System.in);
		palabra = scanner.next();
//		letra = scan.next().charAt(0);

		for (int i = 0; i < arraypalabras.length; i++) {

			if (arraypalabras[i].contains(palabra)) {

				System.out.println("La palabra " + arraypalabras[i] + " contiene el caracter introducido.");

				c = true;
			}

		}

		if (!c) {

			System.out.println("No hay palabras que contengan el caracter introducido.");

		}

		scanner.close();
	}

	private static int opcion2(int numero) {

		return numero;

	}

	private static int opcion3(int numero) {

		return numero;

	}

	private static int opcion4(int numero) {

		return numero;

	}

}
