package ejercicio_2_6;

import java.util.Scanner;

public class ejercicio_07 {

	public static void main(String[] args) {
		// En un main utilizar esPrimo para visualizar en pantalla todos los número
		// primos del 1 al 500 en una línea.

		Scanner scan = new Scanner(System.in);

		esPrimo(500);

		scan.close();
	}

	private static void esPrimo(int num1) {

		int primo = 0;
		int num = 1;

		for (int j = 0; j <= 500; j++) {

			for (int i = 500; i >= 1; i--) {

				if (num % i == 0) {
					primo += 1;
				}
			}

			if (primo <= 2) {
				System.out.print(num + " ");

//			} else if (primo > 2) {
//			System.out.println("no primo");
			}
			num = num + 1;
			primo = 0;
		}

	}

}
