package ficheros_pruebas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ficheros_03 {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("src/ficheros_pruebas/prueba2.txt", true));

		Scanner scan = new Scanner(System.in);
		String names;
		System.out.println("Introduce los caracteres a introducir.");
		names = scan.nextLine();

		bw.write(names + " \n");
		bw.flush();
		bw.close();
		scan.close();
	}

}
