package ficheros_ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class pokemon_extended {

	public static void main(String[] args) throws IOException{
//		Implementa un programa que realiza las siguientes tareas utilizando métodos:
//
//      1. Lee la información del archivo “pokemons.csv”, carga la información en arrays 
//										(nombres, tipos, niveles, ataques, defensas, velocidades).
//      2. Cambia el nombre del pokemon 0 y lo llama “PICACHU” (en mayúsculas).
//      3. Aumenta el nivel de ataque del pokemon 3 en 5.
//    	4. Cambiar: se pedirá el nombre de un Pokémon, se visualizará su información y se solicitará la modificación 
//			de los datos de nivel, ataque, defensa y velocidad. Los datos se modificarán en el Array.
//		5. Buscar por nombre: El programa solicitará una cadena y mostrará una lista con la información de Pokémon a 
//				nombre de la cadena.
//		6. Los más rápidos: visualizarán la información de Pokémon con velocidades superiores a la media.
//		7. Enumerar por tipo: Se pedirá un tipo y visualizará este tipo de Pokémon. Si el tipo no existe, se mostrará un mensaje.
//		8. Lucha1: Se pedirán los dos Pokémon que luchen. Se calculará la media de nivel, ataque, defensa y velocidad. 
//				Ganará quien tenga una media mejor. Se visualizará el mensaje.
//		9. Lucha2: Se pedirá un Pokémon y el segundo Pokémon será elegido al azar. Al perdedor se le asignarán valores 
//				aleatorios en categoría, ataque, defensa y velocidad entre 0 y la mayoría.
//		10. Guarda la información de los arrays en el archivo.

		String[] nombres = new String[20];
		String[] tipos = new String[20];
		int[] nivel = new int[20];
		int[] ataques = new int[20];
		int[] defensas = new int[20];
		int[] velocidades = new int[20];

		int opcion = 0;
		String fin = "";
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("Elige una opción del menú.");
		System.out.println("1. Cargar información.");
		System.out.println("2. Cambiar el nombre del pokemon 0 a PICACHU");
		System.out.println("3. Aumenta el nivel de ataque del pokemon 3 en 5.");
		System.out.println("4. Cambiar datos de un pokemon.");
		System.out.println("5. Mostrar información de un pokemon.");
		System.out.println("6. Pokemons más rápidos que la media.");
		System.out.println("7. Enumera pokemons tipos.");
		System.out.println("8. Elige dos pokemons para que luchen.");
		System.out.println("9. Elige un pokemon para que luchen.");
		
		opcion = scan.nextInt();
		menu(opcion, nombres, tipos, nivel, ataques, defensas, velocidades);
		System.out.println("¿Quieres finalizar el programa? Yes/No");
		fin = scan.next();
		
		}while(!fin.equalsIgnoreCase("yes"));
		System.out.println("Fin del programa");
	}

	public static void menu(int opcion, String[] n, String[] t, int[] ni, int[] a, int[] d, int[] v) throws IOException {
		
		switch (opcion) {
		case 1:
			cargar(n, t, ni, a, d, v);
			break;
		case 2:
			cambiarpicachu(n);
			break;
		case 3:
			aumentarataque3(n, a);
			break;
		case 4:
			cambiardatos(n, t, ni, a, d, v);
			break;
		case 5:
			mostrarinfor(n, t, ni, a, d, v);
			break;
		case 6:
			rapidos(n, v);
			break;
		case 7:
			pedirtipos(n, t);
			break;
		case 8:

			break;
		case 9:

			break;
		case 10:

			break;

		default:
			break;
		}
	}
	
	public static void cambiarpicachu (String[] n) {
		
		System.out.print(n[0]);
		n[0] = ("PICACHU");
		System.out.println(" ha cambiado a " + n[0]);
	}
	public static void aumentarataque3 (String[] n, int[] a) {
		
		a[3] += 5;
		System.out.println(n[3] + " ahora tiene un ataque de " + a[3]);
		System.out.println();

	}
	public static void cambiardatos (String[] n, String[] t, int ni[], int[] a, int[] d, int[] v) {
		
		Scanner scan = new Scanner(System.in);
		String pok = "";
		System.out.println("¿De qué pokemon quieres modificar sus datos?");
		
		pok = scan.nextLine();
		
		for (int i = 0; i < n.length; i++) {
	
			if (pok.equalsIgnoreCase(n[i])) {
				System.err.println("Se ha encontrado el pokemon en la posición: " + i);
				nuevosdatos(i, n, t, ni, a, d, v);
			}
		}
		
		
	}
	private static void nuevosdatos(int i, String[] n, String[] t, int ni[], int[] a, int[] d, int[] v) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce los nuevos datos de nivel.");
			ni[i] = scan.nextInt();
		System.out.println("Introduce los nuevos datos de ataque.");
			a[i] = scan.nextInt();
		System.out.println("Introduce los nuevos datos de defensa.");
			d[i] = scan.nextInt();
		System.out.println("Introduce los nuevos datos de velocidad.");
			v[i] = scan.nextInt();
		System.out.println("Actualización completada.");

		
		}
	public static void mostrarinfor(String[] n, String[] t, int ni[], int[] a, int[] d, int[] v) {
		Scanner scan = new Scanner(System.in);
		String pok = "";
		System.out.println("¿De qué pokemon quieres información?");
		
		pok = scan.nextLine();
		
		for (int i = 0; i < n.length; i++) {
	
			if (pok.equalsIgnoreCase(n[i])) {
				System.out.println("Nombre: " + n[i]);
				System.out.println("Tipo: " + t[i]);
				System.out.println("Nivel: " + ni[i]);
				System.out.println("Ataque: " + a[i]);
				System.out.println("Defensa: " + d[i]);
				System.out.println("Velocidad: " + v[i]);


			}
		}
		
	}
	public static void rapidos (String[] n, int[] v) {
		
		int media = 0;
		int cont = 0;
		
		for (int i = 0; i < v.length; i++) {
			
			media += v[i]; 
			cont++;
		}
		media = media/cont;
		
		for (int i = 0; i < v.length; i++) {
			
			if(v[i]>media) {
				
				System.out.println(n[i]);
			}
			
		}
		
	}
	public static void pedirtipos(String[] n, String[] t) {
		String tipo = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Qué tipo de pokemon estás buscando?");
		tipo = scan.nextLine();
		int cont = 0;
		for (int i = 0; i < t.length; i++) {
			if(tipo.equalsIgnoreCase(t[i])) {
				System.out.println(n[i]);
				cont++;
			}
			
		}
		if (cont ==0) {
			System.out.println("No existen pokemons de ese tipo.");
		}
	}
	public static void cargar (String[] n, String[] t, int ni[], int[] a, int[] d, int[] v) throws IOException {
		
		File archivo = new File("src/ficheros_ejercicios/pokemons.csv");
		FileReader fr = new FileReader(archivo.toString());
		BufferedReader br = new BufferedReader(fr);
		
		String linea = "";
		String primeralinea = "";
		String aux[] = new String[6];
				
		primeralinea = br.readLine();
		
		for (int i = 0; i < n.length; i++) {
			
			linea = br.readLine();
			aux = linea.split(",");
			n[i] = aux[0];
			t[i] = aux[1];
			ni[i] = Integer.parseInt(aux[2]);
			a[i] = Integer.parseInt(aux[3]);
			d[i] = Integer.parseInt(aux[4]);
			v[i] = Integer.parseInt(aux[5]);
			
//			System.out.println(t[i]);
			
		}
		
		
	}

}
