package REPASO;

import java.util.Scanner;

public class repaso_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = { 2, 23, 43, 12, 6, 77, 80, 111, 56, 5, 80, 235, 55, 69, 9, 0, 71, 24, 124, 88, 67 };

		String volver = "";
		int opcion = 0;
		
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("Elige una opción del menú.");
		
		menu();
		
		opcion=scan.nextInt();

		
		
		switch (opcion) {
		case 1:
			
			opcion1(numeros);
			
			break;
		case 2:
			
			opcion2(numeros);
			
			break;
		case 3:
			
			opcion3(numeros);
			
			break;
			
		case 4:
			opcion4(numeros);
			break;
	
		case 5:
			opcion5(numeros);
			break;
	
		case 6:
			opcion6(numeros);
			break;
			
		case 7:
			opcion7(numeros);
			break;
			
		case 8:
			opcion8(numeros);
			break;
			
		case 9:
			opcion9(numeros);
			break;

		}
			
		System.out.println("¿Quieres volver a elegir otra opción? y/n");
			
		volver = scan.next();
		
		}while(volver.equals("y"));
			
		

		
	scan.close();
}

	private static void menu() {

		System.out.println("1. Calcular la suma de todos los números del array.");

		System.out.println("2. Calcular la suma de todos los números impares del array.");

		System.out.println("3. Calcular la suma de todos los números pares del array.");

		System.out.println("4. Calcular la media de todos los números del array.");

		System.out.println("5. Calcular la media de todos los números impares del array.");

		System.out.println("6. Calcular la media de todos los números pares del array.");

		System.out.println("7. Visualizar los números que están entre 45 y 60.");

		System.out.println("8. Calcular la multiplicación de los 10 últimos números.");

		System.out.println("9. Calcular la multiplicación de los números de la posición 10-20.");

		System.out.println("10. SALIR");

	}

	private static void opcion1(int[] numeros) {

		int suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}

		System.out.println("La suma de los números del array es: " + suma);
	}
	
	private static void opcion2(int[] numeros) {

		int suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2 == 0) {
				suma += numeros[i];
			}
		}

		System.out.println("La suma de los números impares del array es: " + suma);
	}
	
	private static void opcion3(int[] numeros) {

		int suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2 > 0 && numeros[i]%2 < 2) {
				suma += numeros[i];
			}
		}

		System.out.println("La suma de los números pares del array es: " + suma);
	}
	
	private static void opcion4(int[] numeros) {

		int suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		
		suma = suma/numeros.length;

		System.out.println("La media de los números del array es: " + suma);
	}
	
	private static void opcion5(int[] numeros) {

		int suma = 0;
		int valor = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2 == 0) {
				suma += numeros[i];
				valor ++;
				
			}
		}
		
		suma = suma/valor;

		System.out.println("La media de los números impares del array es: " + suma);
	}
	
	private static void opcion6(int[] numeros) {

		int suma = 0;
		int valor = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2 > 0 && numeros[i]%2 < 2) {
				suma += numeros[i];
				valor++;
			}
		}
		
		suma = suma/valor;

		System.out.println("La media de los números pares del array es: " + suma);
	}
	
	private static void opcion7(int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] >= 45 && numeros[i] <= 60) {
				
				System.out.println("Números entre 45 y 60: " + numeros[i]);
				
			}
		}

	}
	
	private static void opcion8(int[] numeros) {

		int mult = 1;
	
		for (int i = (numeros.length-1); i >= (numeros.length - 11) ; i--) {
			
			mult = mult * numeros[i];
		}

		System.out.println("la multiplicación de los diez últimos números es :" + mult);
	}
	
	private static void opcion9(int[] numeros) {

		int mult = 1;
		
		for (int i = 10; i <= 20 ; i++) {
			
			mult = mult * numeros[i];
		}

		System.out.println("la multiplicación de los números entre las posiciones 10 y 20 es :" + mult);
	}

}
