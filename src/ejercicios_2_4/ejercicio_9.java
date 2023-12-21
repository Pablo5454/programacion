package ejercicios_2_4;

import java.util.Scanner;

public class ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Transforma los caracteres del String: “ABCD” a ASCII. Utilizar char
		
		Scanner scan = new Scanner(System.in);
		
		String palabra = "ABCD";
		int longitud;
		
				
		longitud = palabra.length();
				
		for (int i = 0; i < longitud; i++) {
			
			char j = palabra.charAt(i);
			
			int ascii = (int) j;
			
			System.out.print(ascii);
		}
		
		scan.close();
		
	}

}
