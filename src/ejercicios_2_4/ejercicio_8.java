package ejercicios_2_4;

import java.util.Scanner;

public class ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Introducir una frase por teclado ej.: “Bienvenido a Zornotza”, 
		// luego introducir la palabra que se quiere sustituir (ej.: Zornotza) y 
		// luego la palabra con el que se va a sustituir (ej.: Amorebieta). 
		// Mostrar en pantalla la frase con la palabra sustituida.

		Scanner scan = new Scanner(System.in);
		
		String frase, palabraout, sustituta;
		
		
		System.out.println("Introduce una fase por teclado.");
		frase = scan.nextLine();
	
	
		
		System.out.println("Introduce qué palabra quieres sustituir.");
		palabraout = scan.nextLine();
		
		System.out.println("Introduce por qué palabra la quieres sustituir.");
		sustituta = scan.nextLine();
		
		frase = frase.replaceAll(palabraout , sustituta);
		
		System.out.println(frase);

		
	scan.close();
		
	}

}
