package ejercicio_2_2;

import java.util.Scanner;

public class ejercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//13. Pedir un número y decir que nota le corresponde.
		//○ Entre 1 y 4,9: suspenso
		//○ Entre 5 y 5,9: suficiente
		//○ Entre 6 y 6,9: bien
		//○ Entre 7 y 8,9: muy bien
		//○ Entre 9 y 10: sobresaliente
		//○ Si no ERROR.
		
		double num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la nota del alumno.");
		num = scan.nextDouble();

			if ( num >= 0 && num <5 ) {
				System.out.println ("Suspenso.");
			} else if ( num >= 5 && num <6 ) {
				System.out.println ("Aprobado.");
			} else if ( num >= 6 && num <7 ) {
				System.out.println ("Bien.");
			} else if ( num >= 7 && num <9 ) {
				System.out.println ("Muy bien.");
			} else if ( num >= 9 && num <=10 ) {
				System.out.println ("Sobresaliente.");
			} else {
				System.out.println ("Error.");
			}
		
		scan.close();
	}

	

}
