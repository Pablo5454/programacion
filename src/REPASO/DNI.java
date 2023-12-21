package REPASO;

import java.util.Scanner;

public class DNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dni;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número de DNI.");
		
		dni = scan.nextInt();
		
		calcularLetra(dni);
		
		scan.close();
	}
	
	private static int calcularLetra (int numero) {
		
		int posicion;
		String[] letra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		
		posicion = numero%23;
		
		System.out.println("La letra del DNI es: " + letra[posicion]);
		
		return numero;
		
	}

}
