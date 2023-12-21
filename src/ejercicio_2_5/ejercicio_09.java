package ejercicio_2_5;

import java.util.Scanner;


public class ejercicio_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear dos arrays arrHile y arrLitr. En el primero hay que guardar los meses
		// desde enero hasta mayo y en el segundo la cantidad de litros que ha llovido esos meses.
		// Hay que mostrar cuanto ha llovido cada mes y cual es el mes en que más ha llovido.
		
		String[] arrHile = {"enero", "febrero", "marzo", "abril", "mayo"};
		int[] arrLitr = {123, 333, 180, 211, 90};
		String mas_lluvioso = null;
		int mas = 0;
		
		Scanner scan = new Scanner(System.in);
	
		
		for (int i= 0; i < arrHile.length; i++) {
			
			System.out.println("En " + arrHile[i] + " ha llovido " + arrLitr[i] + " litros.");

			if (arrLitr[i] > mas){
				
				mas = arrLitr [i];
				mas_lluvioso = arrHile[i];
			}
			
		}
		
		System.out.println("El mes más lluvioso ha sido " + mas_lluvioso + " con " + mas + " litros.");
		
		scan.close();

	}

}
