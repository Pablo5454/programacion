package ficheros_ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio_01 {

	public static void main(String[] args) throws IOException{
		// Crear un programa que lea las líneas de un fichero. El programa debe ser
		// capaz de leer cualquier fichero de texto (.txt).7
		
		File fichero = new File("src/ficheros_ejercicios/ejercicio01.txt");
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		
		String linea = br.readLine();
		
		while(linea!=null) {
			System.out.println(linea);
			linea = br.readLine();
		}
		

	}

}
