package ejercicio_2_2;

import java.util.Scanner;

public class ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir tres números y decir si ha introducido en orden ascendente o no.
		
		int n1, n2, n3;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número.");
		n1 = scan.nextInt();
		System.out.println("Introduce un segundo número.");
		n2 = scan.nextInt();
		System.out.println("Introduce un tercer número.");
		n3 = scan.nextInt();
		
		if (n1<n2 && n2<n3){
		System.out.println ("Los números se han introducido en orden ascendente. " 
		+ n1 + ", " + n2 + ", " + n3 + ".");
		} else {
		System.out.println ("Los números no se han introducido en orden ascendente.");
		}
		
		scan.close();
	}


}
