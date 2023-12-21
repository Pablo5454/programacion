package ejercicio_2_3;

import java.util.Scanner;

public class ejercicio_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Visualizar un menú, con las opciones 1,2,3 , 
		// si el usuario introduce 4 terminar programa visualizando “ADIOS”, 
		// sino visualizar un mensaje diciendo la opción que ha seleccionado el usuario.

		// HACER CON SWITCH CASE

		Scanner scan = new Scanner(System.in);
		
		int menu, m1 = 1;
		
		
		
		do {
		
			System.out.println("1. Multiplo de 3.");
			System.out.println("2. Fibonacci.");
			System.out.println("3. Factorial.");
			System.out.println("4. Salir");
			
			menu = scan.nextInt();
			
			switch (menu) {
			
			case 1: 
				
				m1 = 1;
				System.out.println("Ha seleccionado: Múltiplo de 3");
				break;
				
			case 2:
				m1 = 2;
				System.out.println("Ha seleccionado: Fibonacci");
				break;
				
			case 3:
				
				m1 = 3;
				System.out.println("Ha seleccionado: Factorial");
				break;
				
			case 4:
				
				m1 = 4;
				
				break;
			default:
				System.out.println("Opción incorrecta.");
			}
			
		}while (m1 != 4);
			
		System.out.println("ADIÓS.");
		
		scan.close();
	}

}
