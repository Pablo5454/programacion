package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_08 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 	Rellena un array de longitud 10 con los números introducidos del teclado. 
			Luego sacar el siguiente menú, desarrollando las opciones correspondientes:
			Calcular y visualizar la suma.
			Visualizar el número más alto.
			Visualizar el número más pequeño.
			Pedir un número y visualizar el número de veces que aparece en el array.
			(Si se anima, ejecutar con funciones) */

		int[] numeros = new int[10];
		Scanner scan = new Scanner(System.in);
		
		int eleccion = 1;
		// int num1;
		
		for (int i = 0; i<10; i++) {
			
			System.out.println("Introduce un número para la posición " + (i+1));
			
			numeros[i]= scan.nextInt();
		
			//num1 = numeros[i];
				
			// System.out.println(num1);  //Comprobación del array
			
		}
		
		while (eleccion > 0 && eleccion < 5){
			
			menu();
		
			eleccion = scan.nextInt();
			
			switch (eleccion) {
			
				case 1:
					calcular_suma(numeros);
					break;
				case 2:
					numero_alto(numeros);
					break;
				case 3:
					numero_bajo(numeros);
					break;
				case 4:
					veces_array(numeros);
					break;
			
			}
			
		}
		
		System.out.println("FIN DEL PROGRAMA.");
		
		scan.close();
		
	}
	
	public static void menu() {
		
		System.out.println("Menú:");
		System.out.println("1- Calcular la suma de los números introducidos.");
		System.out.println("2- Calcular el número más alto.");
		System.out.println("3- Calcular el número más bajo.");
		System.out.println("4- Calcular el número de veces que aparece en el array.");
		System.out.println("0- SALIR");
	}
	
	public static void calcular_suma(int[] array_numeros) {
		int suma = 0, num = 0;
		for (int i = 0; i<10; i++) {
			num = array_numeros[i];
			suma = suma + num;
		}
		System.out.println("La suma de los números introducidos es: " + suma);
	}
	
	public static void numero_alto(int[] array_numeros) {
		
		int num, alto = Integer.MIN_VALUE;
		
		for (int i = 0; i<10; i++) {
			
			num = array_numeros[i];
			
			if (num>alto){
				
				alto = num;
			}
			
		}
		
		System.out.println("El número más alto es: " + alto);
	}
	
	public static void numero_bajo(int[] array_numeros) {
		
		int num, bajo = Integer.MAX_VALUE;
		
		for (int i = 0; i<10; i++) {
			
			num = array_numeros[i];
			
			if (num < bajo){
				
				bajo = num;
			}
			
		}
		
		System.out.println("El número más bajo es: " + bajo);
		
	}
	
	public static void veces_array(int[] array_numeros) {
		
		int num_introducido, veces = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número.");
		num_introducido = sc.nextInt();
		
		for (int i = 0; i<10; i++) {
			
			if(num_introducido == array_numeros[i]) {
				
				veces = veces + 1;
				
			}
			
		
		}
		
		System.out.println("El número introducido aparece " + veces + " veces.");
		
		
	}

}
