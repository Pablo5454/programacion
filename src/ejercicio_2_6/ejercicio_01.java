package ejercicio_2_6;

import java.util.Scanner;

public class ejercicio_01 {

	public static void main(String[] args) {
		// Crear un método para que convierta, la cantidad introducida en Euros a
		// pesetas

		Scanner scan = new Scanner(System.in);

		int e = intro(scan);

		resultado(e);

		scan.close();
	}

	private static int intro(Scanner scan) {

		int euros;

		System.out.println("Introduce los euros a cambiar.");

		euros = scan.nextInt();

		return euros;

	}

	private static void resultado(int euros) {

		int resultadofinal = 0;

		resultadofinal = euros * 166;

		System.out.println("La cantidad en pesetas es: " + resultadofinal + " pesetas.");

	}

}
