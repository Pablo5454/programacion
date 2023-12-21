package ejercicio_2_6;

import java.util.Scanner;

public class ejercicio_04 {

	public static void main(String[] args) {
		//Crear un método llamado calcularAreaCirculo
		//
		//Parámetros recibidos: int diámetro
		//
		//Return: double area
		
		int diametro = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el diámetro del círculo.");
		
		diametro = scan.nextInt();
		
		calcularAreaCirculo(diametro);
		
		System.out.println("El área de la circunferencia es: " + calcularAreaCirculo(diametro) + " .");
		
		scan.close();
		
	}

	private static double calcularAreaCirculo(int diametro) {
		
		double radio, area = 0;
		
		radio = (double) diametro/2;
		
		area = Math.pow(radio,2)*Math.PI;
		
		return area;
	}
}
