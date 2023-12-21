package ejercicio_2_2;
import java.util.Scanner;
public class ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer un número y decir si es negativo, positivo o cero.
		int n1;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número.");
		n1 = scan.nextInt();

		if (n1 > 0) {
			System.out.println ("El número introducido es positivo.");
		} else if (n1 < 0) {
			System.out.println ("El número introducido es negativo.");
		} else {
			System.out.println ("El número introducido es cero.");
		}
		scan.close();
	}

}