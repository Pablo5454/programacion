package ejercicios_2_4;

import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribir la frase introducida sin espacios vacíos.
		
		String frase, w = "";
		int longitud;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una frase.");
		frase = scan.nextLine(); 
		
		longitud = frase.length();
		
			for (int i = 0; i <longitud; i++) {
				
				w = "";
				w = w + frase.charAt(i);
				 
				if (w.equals(" ")) {
					
				} else {
					
					System.out.print(w);
				}
				
			}
		
		scan.close();
				
	}

}
