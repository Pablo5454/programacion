package ejercicio_2_3;

import java.util.Scanner;

public class ejercicio_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Visualizar el factorial de 5 números que introduce el usuario.
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		for (int i = 0; i <5; i++) {
			
			System.out.println ("Introduce un número.");
			
			num = scan.nextInt();
			
			for (int j = num -1; j >0; j--) {
				
				num = num*j;
			
			}
		
			System.out.println(num);
			
		}
	
		
		scan.close();
		
	}
	
}
