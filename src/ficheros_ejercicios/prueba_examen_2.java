package ficheros_ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class prueba_examen_2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String[] nombre = new String[3];
		String[] apellido = new String[3];
		String[] dni = new String[3];
		
		String linea = "";
		String aux[] = new String[3];
		
		File archivo = new File("src/ficheros_ejercicios/pruebaexamen.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		
		
		
		for (int i = 0; i < nombre.length; i++) {
			
			linea = br.readLine();
			aux = linea.split(",");
			
			nombre[i] = aux[0];
			apellido[i] = aux[1];
			dni[i] = aux[2];
			
			System.out.println(nombre[i]);
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
