package ficheros_ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ficheros_04 {

	public static void main(String[] args) throws IOException {
//		Implementa un programa que realiza las siguientes tareas utilizando métodos:
//
//      Lee la información del archivo “pokemons.csv”, carga la información en arrays 
//										(nombres, tipos, niveles, ataques, defensas, velocidades).
//      Cambia el nombre del pokemon 0 y lo llama “PICACHU” (en mayúsculas).
//      Aumenta el nivel de ataque del pokemon 3 en 5.
//      Guarda la información de los arrays en el archivo.
//
//		4. Cambiar: se pedirá el nombre de un Pokémon, se visualizará su información y se solicitará la modificación de los datos de nivel, ataque, defensa y velocidad. Los datos se modificarán en el Array.
//		5. Buscar por nombre: El programa solicitará una cadena y mostrará una lista con la información de Pokémon a nombre de la cadena.
//		6. Los más rápidos: visualizarán la información de Pokémon con velocidades superiores a la media.
//		7. Enumerar por tipo: Se pedirá un tipo y visualizará este tipo de Pokémon. Si el tipo no existe, se mostrará un mensaje.
//		8. Lucha1: Se pedirán los dos Pokémon que luchen. Se calculará la media de nivel, ataque, defensa y velocidad. Ganará quien tenga una media mejor. Se visualizará el mensaje.
//		9. Lucha2: Se pedirá un Pokémon y el segundo Pokémon será elegido al azar. Al perdedor se le asignarán valores aleatorios en categoría, ataque, defensa y velocidad entre 0 y la mayoría.
//		10. Guarda la información de los arrays en el archivo.
		
		

		String[] aux = new String[6];
		String[] nombres = new String[20];
		String[] tipos = new String[20];
		int[] niveles = new int[20];
		int[] ataques = new int[20];
		int[] defensas = new int[20];
		int[] velocidades = new int[20];

		String copialinea = cargardatos(aux, nombres, tipos, niveles, ataques, defensas, velocidades, "");

		modificardatos(nombres, ataques);

		guardardatos(nombres, tipos, niveles, ataques, defensas, velocidades, copialinea);
	}

	private static void guardardatos(String[] nombres, String[] tipos, int[] niveles, int[] ataques, int[] defensas,
			int[] velocidades, String copialinea) throws IOException {
		// Guarda la información de los arrays en el archivo.

//		System.out.println(copialinea);

//		SI ES FALSE SUSTITUYE. SI ES TRUE AÑADE
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/ficheros_ejercicios/pokemons.csv", false));

		bw.write(copialinea + "\n");
		
		for (int i = 0; i < velocidades.length; i++) {

			bw.write(nombres[i] + "," + tipos[i] + "," + niveles[i] + "," + ataques[i] + "," + defensas[i] + ","
					+ velocidades[i] + "\n");
			
		}
		
		System.out.println("Cambios introducidos: " + nombres[0] + ", " + ataques[3]);
		
		bw.flush();
		bw.close();
		
	}

	private static void modificardatos(String[] nombres, int[] ataques) {
		// Cambia el nombre del pokemon 0 y lo llama “PICACHU” (en mayúsculas).

		nombres[0] = "PICACHU";
		ataques[3] += 5;
	}

	private static String cargardatos(String[] aux, String[] nombres, String[] tipos, int[] niveles, int[] ataques,
			int[] defensas, int[] velocidades, String copialinea) throws IOException {

		File archivo = new File("src/ficheros_ejercicios/pokemons.csv");
		FileReader fr = new FileReader(archivo.toString());
		BufferedReader br = new BufferedReader(fr);

		String linea = "";

		copialinea = br.readLine();

		for (int i = 0; i < nombres.length; i++) {

			linea = br.readLine();

			if (linea == null) {
				break;
			}
			aux = linea.split(",");

			nombres[i] = aux[0];
			tipos[i] = aux[1];
			niveles[i] = Integer.parseInt(aux[2]);
			ataques[i] = Integer.parseInt(aux[3]);
			defensas[i] = Integer.parseInt(aux[4]);
			velocidades[i] = Integer.parseInt(aux[5]);

		}

//		for (int i = 0; i < nombres.length; i++) {
//			System.out.println(tipos[i]);
//
//		}

		br.close();

		return copialinea;
	}

}
