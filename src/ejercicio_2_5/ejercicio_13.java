package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa que lee por teclado la nota de los alumnos de una clase y calcula la
		// nota media del grupo. También muestra los alumnos con notas superiores a la
		// media. El número de alumnos se lee por teclado.

		// Este programa utiliza un array de elementos de tipo double que contendrá las
		// notas de los alumnos.

		// El tamaño del array será el número de alumnos de la clase, por lo tanto
		// primero se pedirá por teclado el número de alumnos y a continuación se creará
		// el array.

		// Se realizan 3 recorridos sobre el array, el primero para asignar a cada
		// elemento las notas introducidas por teclado, el segundo para sumarlas y
		// calcular la media y el tercero para mostrar los alumnos con notas superiores
		// a la media.

		int num_alum, mayor_media = 0;
		double media = 0, nota = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cuántos alumnos hay en clase?");
		num_alum = scan.nextInt();

		double[] cadena_alum = new double[num_alum];

		System.out.println("Introduce las notas de los alumnos.");

		for (int i = 0; i < cadena_alum.length; i++) {

			System.out.println("Introduce la nota para el alumno " + (i + 1));
			nota = scan.nextInt();
			cadena_alum[i] = nota;
			media += nota;

		}
		media = media / cadena_alum.length;
		System.out.println("La media de notas de la clase es " + (media));

		for (int i = 0; i < cadena_alum.length; i++) {
			
			if (cadena_alum[i]> media) {
			
				mayor_media++;

			}
		}
			System.out.println("Hay " + mayor_media + " alumnos que superan la media.");
			scan.close();

	}

}
