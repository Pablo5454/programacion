package ejercicio_2_6;

import java.util.Scanner;

public class ejercicio_02 {

	public static void main(String[] args) {
//	    Crear un método (función) que reciba un double “cantidadDeDinero” y un char “monedaDeCambio”.
//
//	    Si recibe una D quiere decir que la cantidad está en Euros y tiene que devolver en Dólares. 
//		Tiene que funcionar con “monedaDeCambio” mayúsculas y minúsculas.

		double cantidaddedinero = 0;
		char monedadecambio;

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce la cantidad de dinero");
		cantidaddedinero = scan.nextDouble();

		System.out.println("Introduce la moneda de cambio");
		monedadecambio = scan.next().charAt(0);

		recibe(scan, cantidaddedinero, monedadecambio);


		scan.close();
	}

	private static double recibe(Scanner scan, double cantidaddedinero, char monedadecambio) {

		if (monedadecambio == 'D' || monedadecambio == 'd') {

			System.out.println("Ha introducido " + cantidaddedinero + " en Euros. " + "La cantidad en dólares es "
					+ (cantidaddedinero * 0.9) + ".");
		} else {
			System.out.println("El valor introducido no es correcto");

		}

		return cantidaddedinero;

	}

}
