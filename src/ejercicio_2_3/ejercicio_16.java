package ejercicio_2_3;

import java.util.Scanner;

public class ejercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir 10 números y visualizar en pantalla el mayor.

		int num = 0 , mayor = 0;
		Scanner scan = new Scanner(System.in);
		
	
		for (int i = 0; i <10; i++) {
			System.out.println("Introduce un número: ");
			num = scan.nextInt();
			
			while (num > mayor) {
				mayor = num;
			}
				
		}
		System.out.println("El número mayor introducido es: " + mayor);
		
		scan.close();
	}
}
