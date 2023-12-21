package ejercicio_2_2;

import java.util.Scanner;

public class ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir tres números, una mayor que otra, si el usuario introduce menor o igual
		// visualizar mensaje de ERROR.
		
		int n1, n2, n3;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número.");
		n1 = scan.nextInt();
		System.out.println("Introduce un segundo número.");
		n2 = scan.nextInt();
		if (n2 > n1) {
			System.out.println("Introduce un tercer número.");
			n3 = scan.nextInt();
			if (n3 > n2) {
				System.out.println("CORRECTO.");
				
			} else {
				System.out.println("ERROR. El número introducido no es correcto.");

			}
		} else {
			System.out.println("ERROR. El número introducido no es correcto.");

		}
		
		scan.close();
	}

}