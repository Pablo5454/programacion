package ficheros_pruebas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ficheros_01 {

	public static void main(String[] args) throws IOException {
		
		File fichero = new File("src/ficheros_pruebas/EjemploFichero.txt");
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		
		String linea = br.readLine();
		
		while(linea!=null) {
			System.out.println(linea);
			linea = br.readLine();
		}
		
		File f = new File("src/ficheros_pruebas/EjemploFichero.txt");
		if (f.exists()) {
			System.out.println("Nombre del fichero: " + f.getName());
			System.out.println("Ruta relativa " + f.getPath());
			System.out.println("Ruta absoluta: " + f.getAbsolutePath());
			System.out.println("Se puede leer: " + f.canRead());
			System.out.println("Se puede escribir: " + f.canWrite());
			System.out.println("Tamaño: " + f.length());
		}
	}

}
