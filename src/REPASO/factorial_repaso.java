package REPASO;

import java.util.Scanner;

public class factorial_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Introduce un número.");
		
		num1 = scan.nextInt();
		
		factorial(num1);
		
		System.out.println("El factorial del número introducido es: " + factorial(num1));

		
		scan.close();
	}
		
	private static int factorial (int numero) {
		
			int factor = numero;
			
			for (int i = 1; i < numero; i++) {
				
			 numero--;
			 factor = factor * numero;
			}
			
			return factor;
		}
		
		
		
		

	

}
