package ejercicio_2_5;

import java.util.Scanner;

public class ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definir y rellenar un array de 10 (por programación). Pedir una cadena y en
		// la pantalla tiene que aparecer los nombres que contengan la cadena. Es decir,
		// realizar una especie de búsqueda.

		String[] cadena = { "nombre1", "nombre2", "nombre3", "nombre4", "nombre5", "nombre6", "nombre7", "nombre8",
				"nombre9", "nombre10" };
		String mostrar, nombre_enc = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("¿Qué nombre estás buscando?");
		mostrar = scan.nextLine();

		for (int i = 0; i < cadena.length; i++) {

			if (cadena[i].equals(mostrar)) {

				
			nombre_enc= mostrar;
				
				
			}
			
		}
		
		if (nombre_enc == "") {
			System.out.println("El nombre introducido no existe.");
		}else {
			System.out.println("El nombre elegido es: " + nombre_enc);
			
		}
		
		scan.close();

	}

}
