package ficheros_ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio_02 {

	// Crear un programa que escriba líneas en un fichero y que deje de escribir
	// cuando cuando se introduzca dos líneas vacías.

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("src/ficheros_ejercicios/ejercicio02.txt", true));
		
		int cont = 0;
		
		introducir(bw, cont);
		
	}

	private static void introducir(BufferedWriter bw, int cont) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		String linea = null;
		do {

			System.out.println("Introduce los caracteres a introducir.");
			linea = scan.nextLine();

			bw.write(linea + " \n");
			bw.flush();

			if (linea.equals("")) {
				cont++;
			}

		} while (cont != 2);
		
		bw.close();
		scan.close();
	}

}
