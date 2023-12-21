package ejercicio_2_2;

import java.util.Scanner;

public class ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calcular la potencia del coche, si nos da en KW calcularemos en CV, sino al revés.
		// (1 kW = 1,35 CV). Pedir un valor “K” o “C”, si el valor introducido es K el resultado 
		// será en CV y sino al revés.
		double potencia; 
		String unidad;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce la potencia del coche.");
		potencia = scan.nextDouble();
		System.out.println("¿Se ha introducido en Kw o en CV?");
		unidad = scan.next();

		if (unidad.equalsIgnoreCase("Kw")) {
			System.out.println ("La potencia en Kw es: " + potencia + ". " + "La potencia en Cv es: " 
					+ potencia * 1.35);
		} else if (unidad.equalsIgnoreCase("Cv")) {
			System.out.println ("La potencia en Cv es: " + potencia + ". " + "La potencia en Kw es: " 
					+ potencia / 1.35);
		
		} else {
			System.out.println ("ERROR.");
		}
		scan.close();
	}
	

}
