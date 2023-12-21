package ejercicio_2_1;
import java.util.Scanner;
public class ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir al usuario tres números y 
		// visualizar la multiplicación de ellos en pantalla.
		//
		int n1, n2, n3;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número.");
		n1 = scan.nextInt();
		System.out.println("Introduce un segundo número.");
		n2 = scan.nextInt();
		System.out.println("Introduce un tercer número.");
		n3 = scan.nextInt();
		System.out.println ("La multiplicación de los tres números es: " + (n1*n2*n3));
		scan.close();
	}

}