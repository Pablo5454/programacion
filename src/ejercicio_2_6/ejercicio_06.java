package ejercicio_2_6;

import java.util.Scanner;

public class ejercicio_06 {

	public static void main(String[] args) {
		// Crear una función llamada esPrimo: recibe un int y devuelve un booleano.

		int numero = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número.");
		
		numero = scan.nextInt();
		
		esPrimo(numero);
		
		System.out.println(esPrimo(numero));
		
		scan.close();
	}
	
	private static boolean esPrimo (int num1) {
		
		int primo = 0;
		boolean resultado = false;
		
		for (int i = 1; i <= num1; i++) {
			
			if (num1%i == 0) {
				primo += 1;
			} 
		}
		
		if (primo <=2) {
			resultado = true;
		}
		
		return resultado;
	}

}
