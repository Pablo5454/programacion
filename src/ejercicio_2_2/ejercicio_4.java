package ejercicio_2_2;
import java.util.Scanner;
public class ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Leer un número y decir si es par o impar.
		int n1;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número.");
		n1 = scan.nextInt();

		if (n1 % 2 == 0) {
			System.out.println ("El número introducido es par.");

		} else {
			System.out.println ("El número introducido es impar.");
		}
		scan.close();
	}

}