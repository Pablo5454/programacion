package ejercicio_2_6;

import java.util.Scanner;

public class ejercicio_08 {

	public static void main(String[] args) {
//		Crea una aplicación que nos convierta un número en base decimal a binario. 
//		Esto lo realizará un método al que le pasaremos el número como parámetro, 
//		devolverá un String con el número convertido a binario. 
//		Para convertir un número decimal a binario, debemos dividir entre 2 el número 
//		y el resultado de esa división se divide entre 2 de nuevo hasta que no se pueda dividir más, 
//		el resto que obtengamos de cada división formará el número binario, de abajo a arriba.
//
//		Veamos un ejemplo: si introducimos un 8 nos deberá devolver 1000

		int num = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número.");

		num = scan.nextInt();

		numbinario(num);

		scan.close();
	}

	private static String numbinario(int num1) {

			String binario = "";
			int numero = num1; 
			int resto = 0;
			
		do {
			
			resto = numero % 2;
			
			if (resto == 0) {
								
				binario = String.valueOf(resto) + binario;
				
			} else if (resto == 1){

				binario = String.valueOf(resto) + binario;

			}
			
			numero = numero / 2;
			
		} while (numero >= 1);
		
		System.out.print(binario);
		
		return binario;
	}

}
