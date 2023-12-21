package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa Java que lea el nombre y el sueldo de 20 empleados y muestre el
		// nombre y el sueldo del empleado que más gana.

		// Para hacerlo utilizaremos dos arrays:
		// Un array de String para los nombres de los empleados
		// Un array de tipo double para los sueldos de cada empleado.

		// Al mismo tiempo que leemos los datos de los empleados iremos comprobando cuál
		// es el que tiene el mayor sueldo. Para ello tomamos el sueldo del primer
		// empleado que se lee como mayor sueldo y después vamos comprobando el resto de
		// sueldos. Cuando encontramos alguno mayor que el mayor actual este sueldo se
		// convierte en el nuevo mayor.

		// En general para calcular el mayor de una serie de números tomamos el primero
		// como mayor y después comparamos el resto de números.

		String[] nombres = { "Empleado1", "Empleado2", "Empleado3", "Empleado4", "Empleado5", "Empleado6", "Empleado7",
				"Empleado8", "Empleado9", "Empleado10", "Empleado11", "Empleado12", "Empleado13", "Empleado14",
				"Empleado15", "Empleado16", "Empleado17", "Empleado18", "Empleado19", "Empleado20" };
		double[] sueldos = { 651, 2345, 245, 25, 25, 47, 6789, 33, 76, 8970, 35, 58, 456, 578, 356, 578, 56, 7980, 25,
				76 };

		int mayor = 0;
		double sueldo_mayor = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < nombres.length; i++) {

			if (sueldos[i] > sueldo_mayor) {
				sueldo_mayor = sueldos[i];
				mayor = i;
			}

		}

		System.out.println("El empleado con mayor sueldo es " + nombres[mayor] + ".");

		scan.close();
	}

}
