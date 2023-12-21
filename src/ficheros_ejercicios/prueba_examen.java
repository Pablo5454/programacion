package ficheros_ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class prueba_examen {

	public static void main(String[] args) throws IOException{
		
		String[] nombres = new String[2];
		String[] apellido = new String[2];
		String[] dni = new String[2];
		
		//IMPORTANTE FILE FILEREADER BUFFEREDREADER
		File archivo = new File("src/ficheros_ejercicios/pruebaexamen.txt");
		FileReader fr = new FileReader(archivo.toString());
		BufferedReader br = new BufferedReader(fr);
		
		String linea = "";
		String aux[] = new String[3];
		
		for (int i = 0; i < nombres.length; i++) {
			//READLINE PARA LEER LA LINEA Y SPLIT PARA RELLENAR EL ARRAY
			linea = br.readLine();
			aux = linea.split(",");
			
			nombres[i] = aux[0];
			apellido[i] = aux[1];
			dni[i] = aux[2];
			
			System.out.println(nombres[i]);
			System.out.println(apellido[i]);
			System.out.println(dni[i]);
		}

		FileWriter fw = new FileWriter("src/ficheros_ejercicios/pruebaexamen.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("\n" + "NUEVOS DATOS");
		
		bw.flush();
		bw.close();
			
	}

}
