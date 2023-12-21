package ejercicio_2_3;

import java.util.Scanner;

public class ejercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribir un programa que escriba de 0 a un número introducido por el usuario.
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número.");
		num = scan.nextInt();
		
		for(int i = 0; i <=num;)  {	
			System.out.println(i);
			 i++;
		}
		
		scan.close();	
		
	}

}
