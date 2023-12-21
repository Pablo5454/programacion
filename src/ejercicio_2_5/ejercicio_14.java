package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa Java que guarda en un array 10 números enteros que se leen por
		// teclado. A continuación se recorre el array y calcula cuántos números son
		// positivos, cuántos negativos y cuántos ceros.

		int[] numeros = new int[10];
		int mayores = 0, menores = 0, ceros = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Introduce un número para la posición " + (i+1) + ".");
			
			numeros[i] = scan.nextInt();
			
			if(numeros[i]>0) {
				mayores++;
			}else if(numeros[i]<0) {
				menores++;
			}else {
				ceros++;
			}
		
			
		}
		System.out.println("Números mayores de 0: " + mayores + ".");
		System.out.println("Números menores de 0: " + menores + ".");
		System.out.println("Número de ceros: " + ceros + ".");


		scan.close();
	}

}
