package ejercicio_2_3;

import java.util.Scanner;

public class ejercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir números hasta que el usuario introduzca 0 y 
		// visualizar la media de los números introducidos.
		
		Scanner scan = new Scanner(System.in);
		
		int num = 1;
		double suma = 0;
		int i = 0;
		double media = 0;
		
		
		while (num != 0) {
			System.out.println("Introduce un número: ");
			num = scan.nextInt(); 
			suma = suma + num;
			
			if (num!=0) {
			i= i+1;
			media = suma/i;
			}
		}
		
	System.out.println("La media de los números introducidos es: " + media);
	
	scan.close();
	}

}
