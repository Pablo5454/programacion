package ejercicio_2_1;
import java.util.Scanner;
public class ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir al usuario que introduzca su nombre y  visualizar ese mensaje en pantalla.
		//
		String nombre;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		nombre = scan.nextLine();
		print(nombre);
		scan.close();
	}

	private static String print(String nombre) {
		String c="";
		System.out.println (nombre);
		return c;
	}

}
