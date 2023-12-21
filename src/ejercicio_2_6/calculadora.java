package ejercicio_2_6;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// Calculadora. Suma, resta y multiplicación con enteros. Dividir con double.

		int num1, num2;
		String operacion, repetir;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Introduce un primer número.");
			num1 = scan.nextInt();

			System.out.println("Introduce un segundo número.");
			num2 = scan.nextInt();

			operacion = operacion(scan); // Introduce el operando y comprueba si es válido.

			repetir = menu(num1, num2, operacion, scan); // menu con switchcase + repetición

		} while (repetir.equals("y"));

		System.out.println("FIN DEL PROGRAMA.");

		scan.close();
	}

	private static String menu(int num1, int num2, String operacion, Scanner scan) {
		String repetir;
		switch (operacion) {

		case "+":

			suma(num1, num2);

			break;

		case "-":

			resta(num1, num2);

			break;

		case "*":

			multiplicacion(num1, num2);

			break;

		case "/":

			division(num1, num2);

			break;
		}

		System.out.println("¿Quieres realizar otra operación? y/n");

		repetir = scan.next();
		return repetir;
	}

	private static String operacion(Scanner scan) {
		String operacion;
		System.out.println("Introduce la operación a realizar.");
		operacion = scan.next();
		if (operacion.equals("+") | operacion.equals("-") | operacion.equals("*") | operacion.equals("/")) {

			return operacion;

		} else {

			System.out.println("La operación introducida no es correcta");
			operacion = operacion(scan);
			return operacion;
		}

	}

	private static void division(int num1, int num2) {
		int resultado;
		resultado = num1 / num2;
		System.out.println("El resultado de la operación es: " + resultado);
	}

	private static void multiplicacion(int num1, int num2) {
		int resultado;
		resultado = num1 * num2;
		System.out.println("El resultado de la operación es: " + resultado);
	}

	private static void resta(int num1, int num2) {
		int resultado;
		resultado = num1 - num2;
		System.out.println("El resultado de la operación es: " + resultado);
	}

	private static void suma(int num1, int num2) {
		int resultado;
		resultado = num1 + num2;
		System.out.println("El resultado de la operación es: " + resultado);
	}

}
