package ejercicio_2_1;
import java.util.Scanner;
public class ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir al usuario que introduzca su nombre y  
		// visualizar en pantalla “Tu nombre es: nombre”.
		//
		String nombre;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		nombre = scan.nextLine();
		System.out.println ("Tu nombre es: " + nombre);
		scan.close();
	}

}

