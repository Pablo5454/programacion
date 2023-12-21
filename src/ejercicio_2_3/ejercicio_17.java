package ejercicio_2_3;

import java.util.Scanner;


public class ejercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir 10 números y visualizar en pantalla el mayor y el menor.

		int num;
		int mayor = Integer.MIN_VALUE; 
		int menor = Integer.MAX_VALUE;
		Scanner scan = new Scanner (System.in);
		
		for(int i = 1; i<=10; i++) {
			System.out.println("Introduce un número: ");
			num = scan.nextInt();
			
			if (num > mayor) {
				mayor = num;
			} 
			if (num < menor) {
				menor = num;
			}
		}
		System.out.println("El número mayor introducido es: " + mayor);
		System.out.println("El número menor introducido es: " + menor);
		
		scan.close();
	}

}
