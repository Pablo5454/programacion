package ejercicio_2_1;
import java.util.Scanner;
public class ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir al usuario dos números y visualizar la suma de ellos en pantalla.
		//
		int n1, n2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número.");
		n1 = scan.nextInt();
		System.out.println("Introduce otro número.");
		n2 = scan.nextInt();
		System.out.println ("La suma de ambos números es: " + (n1+n2));
		scan.close();
	}

}
