package ejercicio_2_2;
import java.util.Scanner;
public class ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Leer un número y decir si esta entre 0 y 10 inclusive.
		int n1;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número.");
		n1 = scan.nextInt();

		if (n1 >= 0 & n1 <= 10) {
			System.out.println ("El número introducido está entre 0 y 10.");

		} else {
			System.out.println ("El número introducido no está entre 0 y 10.");
		}
		scan.close();
	}

}
