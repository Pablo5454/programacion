package ejercicio_2_2;
import java.util.Scanner;
public class ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer dos números y decir cuál es el mayor. 
		//¿Qué pasa si los números introducidos son de mismo valor?
		//
		int n1, n2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número.");
		n1 = scan.nextInt();
		System.out.println("Introduce otro número.");
		n2 = scan.nextInt();
		if (n1 > n2) {
			System.out.println (n1 + " es mayor que " + n2);
		} else if (n1 < n2) {
			System.out.println (n2 + " es mayor que " + n1 + " .");
		} else {
			System.out.println (n1 + " es igual que " + n2 + " .");
		}
		scan.close();
	}

}