package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definir el array de 5 longitudes y rellenarlo de nombres. 
		// Solicitar un nombre al usuario e indicar si está en el array o no.

		String [] nombres = new String[5];
		String buscar;
		int encontrado = 0;
		int posicion = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < nombres.length; i++) {
			
			System.out.println("Introduce un nombre para la posición " + (i+1));
			
			nombres [i] = scan.nextLine();
			
			//System.out.println(nombres[i]); Comprobación de que funciona el array
			
		}
		
		System.out.println(" Introduce el nombre que quieres buscar.");
		
		buscar = scan.nextLine();
		
		for (int i = 0; i < nombres.length; i++) {
			
			if (buscar.equalsIgnoreCase(nombres[i])) {
				
				encontrado = 1;
				posicion = i + 1;
				
			}
		}	
		
		if (encontrado == 1) {
			
			System.out.println("El nombre introducido está en la posición " + posicion );
			
		} else if (encontrado == 0){
			
			System.out.println("El nombre introducido no está en el registro.");
			

		}
				
		
		scan.close();
		
	}

}
