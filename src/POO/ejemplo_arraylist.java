package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class ejemplo_arraylist {

	public static void main(String[] args) {
		
		ArrayList <Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			
			int aleatorio = (int) (Math.random()*10)+1;
			numeros.add(aleatorio);
			System.out.println(numeros.get(i));
		}
	Scanner scan = new Scanner(System.in);
	System.out.println("Introduce un número para saber si existe en el array.");
	int intro = scan.nextInt();
	for (int i = 0; i < numeros.size(); i++) {
		if ( numeros.get(i) == intro) {
			System.out.println("Has encontrado el número. Está en la posición: "+ i);
		}
	}
	
		
	}

}
