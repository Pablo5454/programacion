package ejercicio_2_6;

import java.util.Scanner;

public class ejercicio_03 {

	public static void main(String[] args) {
//		//Crear un método (procedimiento) que escriba en pantalla el cambio entre diferentes monedas. 
//		Recibirá 3 parámetros:
//
//        1. double cantidad
//
//        2. char monedaIn: posibles valores: E, D, B -> euro, dolar, bitcoin
//
//        3. char modedaOut: posibles valores: E, D, B -> euro, dolar, bitcoin
//
//			Deberá realizar el cambio de monedaIn a monedaOut y escribir en pantalla.

		double cantidad = 0;
		char monedain, monedaout;

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce la cantidad de dinero.");
		cantidad = scan.nextDouble();

		System.out.println("Introduce la moneda de entrada.");
		monedain = scan.next().charAt(0);

		System.out.println("Introduce la moneda de salida.");
		monedaout = scan.next().charAt(0);

		entrada(cantidad, monedain);
		salidae(cantidad, monedaout, monedain);
		salidad(cantidad, monedaout, monedain);
		salidab(cantidad, monedaout, monedain);

		scan.close();
	}

	private static double entrada(double cantidad, char monedain) {

		if (monedain == 'E' || monedain == 'e') {

			System.out.println("Ha introducido " + cantidad + " en euros. ");

		} else if (monedain == 'D' || monedain == 'd') {
			System.out.println("Ha introducido " + cantidad + " en dólares");

		} else if (monedain == 'B' || monedain == 'b') {
			System.out.println("Ha introducido " + cantidad + " en bitcoins. ");

		} else {
			System.out.println("El valor introducido no es correcto");

		}

		return cantidad;

	}

	private static double salidae(double cantidad, char monedaout, char monedain) {

		if (monedaout == 'E' || monedaout == 'e') {

			if (monedain == 'E' || monedain == 'e') {
				
				System.out.println("La cantidad introducida es: " + cantidad + " en euros.");
			
			} else if (monedain == 'D' || monedain == 'd') {
				
				System.out.println("La cantidad introducida es: " + (cantidad * 0.9) + " euros.");
			
			} else if (monedain == 'B' || monedain == 'b') {
				
				System.out.println("La cantidad introducida es: " + (cantidad * 100) + " euros.");
			
			} else {
				
				System.out.println("El valor introducido no es correcto");
			}	
			
		} 

		return cantidad;
		
	}

	
	private static double salidad(double cantidad, char monedaout, char monedain) {

		if (monedaout == 'D' || monedaout == 'd') {

			if (monedain == 'D' || monedain == 'd') {
				
				System.out.println("La cantidad introducida es: " + cantidad + " en dólares.");
			
			} else if (monedain == 'E' || monedain == 'e') {
				
				System.out.println("La cantidad introducida es: " + (cantidad / 0.9) + " dólares.");
			
			} else if (monedain == 'B' || monedain == 'b') {
				
				System.out.println("La cantidad introducida es: " + (cantidad * 100) + " dólares.");
			
			} else {
				
				System.out.println("El valor introducido no es correcto");
			}	
			
		} 

		return cantidad;	
	}
		
		private static double salidab(double cantidad, char monedaout, char monedain) {

			if (monedaout == 'B' || monedaout == 'b') {

				if (monedain == 'B' || monedain == 'b') {
					
					System.out.println("La cantidad introducida es: " + cantidad + " en bitcoins.");
				
				} else if (monedain == 'D' || monedain == 'd') {
					
					System.out.println("La cantidad introducida es: " + (cantidad / 90) + " bitcoins.");
				
				} else if (monedain == 'E' || monedain == 'e') {
					
					System.out.println("La cantidad introducida es: " + (cantidad / 100) + " bitcoins.");
				
				} else {
					
					System.out.println("El valor introducido no es correcto");
				}	
				
			} 

			return cantidad;	
		}

}
