package ejercicio_2_6;

import java.util.Scanner;

public class ejercicio_05 {

	public static void main(String[] args) {
		// Crear una función calcularAreaTriangulo que reciba la base y la altura y
		// escriba en pantalla su área.

		double base = 0, altura = 0;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce la base del triángulo.");

		base = scan.nextDouble();

		System.out.println("Introduce la altura del triángulo.");

		altura = scan.nextDouble();
		
		calculararea(base, altura);
		
		System.out.println("El área del triángulo es: " +  calculararea(base, altura));
		
		scan.close();

	}
	
	public static double calculararea (double base2, double altura2) {
		
		double areatriangulo = 0;
		
		areatriangulo = (base2 * altura2) /2;
		
		return areatriangulo;
		
	}

}
