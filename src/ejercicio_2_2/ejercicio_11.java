package ejercicio_2_2;

import java.util.Scanner;

public class ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir un una letra y comprobar si es S(si) o N(no), si el valor introducido es S o N,
		//visualizar en pantalla “BIEN” sino, “ERROR”.
		
		String sn;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce una letra.");
		sn = scan.nextLine();
	
		if (sn.equalsIgnoreCase("s") || sn.equalsIgnoreCase("n")) {
			System.out.println("BIEN.");
			
		} else {
			System.out.println("ERROR.");

		}
		
		scan.close();
	}

}
