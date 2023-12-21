package ejercicio_2_2;
import java.util.Scanner;
public class ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir una letra y decir y es vocal o no.

		String letra;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una letra.");
		letra = scan.nextLine();

			if ( letra.equals ("a") || letra.equals ("e") || letra.equals ("i") || 
				letra.equals ("o") || letra.equals ("u") ) {
				System.out.println ("La letra es vocal.");
		
			} else {
				System.out.println ("La letra es consonante.");
			}
		scan.close();
	}

}