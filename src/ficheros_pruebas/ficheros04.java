package ficheros_pruebas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ficheros04 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = extracted();

		String linea = br.readLine();
		String texto ="";

		while (linea != null) {

//			System.out.println(linea);
			texto = texto + "\n" + linea.replace("a", "*");
			linea = br.readLine();

		}

		BufferedWriter bw = new BufferedWriter(new FileWriter("src/ficheros_pruebas/wiki.txt"));
		bw.write(texto);
		bw.flush();
		bw.close();

	}

	private static BufferedReader extracted() throws FileNotFoundException {
		File fichero = new File("src/ficheros_pruebas/wiki.txt");
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		return br;
	}

}
