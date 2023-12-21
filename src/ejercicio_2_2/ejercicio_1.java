package ejercicio_2_2;
import java.util.Scanner;
public class ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer un número y decir si es aprobado o suspendido.

		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número.");
		num = scan.nextInt();

			if ( num >= 5 ) {
				System.out.println ("El alummo está aprobado.");
			} else {
				System.out.println ("El alummo está suspenso.");
			}
		
		scan.close();
	}

}
