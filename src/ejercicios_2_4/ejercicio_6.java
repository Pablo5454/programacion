package ejercicios_2_4;

import java.util.Scanner;

public class ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Contar las vocales y los consonantes de una frase, los espacios en blanco no cuentan.

		String palabra, w;
		int contvocal = 0, contconsonante = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una palabra.");
		palabra = scan.nextLine();
		
		
		//palabra = palabra.replaceAll("\\s",""); Espacio en código ASCII
		
		palabra = palabra.replaceAll(" ","");
		
		
		
		for(int i =0; i<=palabra.length()-1; i++) {
			
			w = palabra.substring(i,(i+1));			
				
			
			if (w.contains("a") | w.contains("e") | w.contains("i") | w.contains("o") | w.contains("u") ) {
				
				contvocal = contvocal + 1;
				
			}  else {				
				
				contconsonante = contconsonante + 1;
				
				
			}
			
			
		}
		
		
		System.out.println("La palabra introducida tiene " + contvocal + " vocales.");
		System.out.println("La palabra introducida tiene " + contconsonante + " consonantes.");
		
		
		
		scan.close();
	}

}
