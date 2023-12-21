
package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Defina un array de longitud 5 y rellénelo con nombres. 
		// Luego, mostrar en pantalla los nombres que comiencen con a.
		
		String [] palabra = new String[5];
		String vocal;
		String w = "";
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < palabra.length; i++) {
			
			System.out.println("Introduce un nombre en la posición " + (i+1) );
			palabra [i] = scan.nextLine();
			
			//System.out.println(palabra[i]);
			
		}
		
		for (int i = 0; i < palabra.length; i++) {
			
			vocal = palabra [i];
			
			w = vocal.substring(0,1);
			
			//System.out.println(w);
					
			if (w.equalsIgnoreCase("a") || w.equalsIgnoreCase("á")) {
			
				System.out.println(vocal);

			 }
			
		}
		
		scan.close();
		
	}

}
