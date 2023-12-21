package ficheros_pruebas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ficheros_02 {

	public static void main(String[] args) throws IOException {
		
				
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/ficheros_pruebas/prueba.txt",true));
		bw.write("prueba2 \n");
		bw.flush();
		bw.close();
		
	}

}
