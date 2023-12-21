package ejercicio_2_2;

import java.util.Scanner;

public class ejercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir tres números y visualizar en ordenados en orden ascendiente.
		
		int n1, n2, n3;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número.");
		n1 = scan.nextInt();
		System.out.println("Introduce un segundo número.");
		n2 = scan.nextInt();
		System.out.println("Introduce un tercer número.");
		n3 = scan.nextInt();
		
		if (n1<n2 & n2<n3){
		System.out.println (n1 + ", " + n2 + ", " + n3 + ".");
		} else if (n1<n2 & n2>n3 & n3>n1){
		System.out.println (n1 + ", " + n3 + ", " + n2 + ".");
		} else if (n1>n2 & n2>n3 & n3<n1){
			System.out.println (n3 + ", " + n2 + ", " + n1 + ".");
		} else if (n1<n2 & n2>n3 & n3<n1){
			System.out.println (n3 + ", " + n1 + ", " + n2 + ".");
		} else if (n1>n2 & n2<n3 & n3>n1){
			System.out.println (n2 + ", " + n1 + ", " + n3 + ".");
		} else {
			System.out.println (n2 + ", " + n3 + ", " + n1 + ".");
		}
		
		scan.close();
	}

}
