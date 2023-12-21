package ejercicio_2_3;

import java.util.Scanner;

public class ejercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribir un programa que visualice los múltiplos 
		// del número que especifique el usuario que están entre 0 y 100.

		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número.");
		num = scan.nextInt();
		
		int i = num;
		
		while (i<= 100 ) {	
			System.out.println(i);
			i += num;
		}
		
		scan.close();	
	}

}
