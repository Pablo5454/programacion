package ficheros_ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) throws IOException {
//  	Tenemos información en un archivo con el formato dni:nombre:apellido:saldo.
//		Cargamos los datos de 5 clientes en 4 arrays diferentes y mostramos y desarrollamos 
//		un menú con las siguientes opciones (utilizando métodos para cada problema):
//
//        1. Retirar dinero: Pregunta al usuario cuánto dinero quiere retirar 
//			y actualiza la información del saldo.
//        2. Depositar dinero: Pregunta al usuario cuánto dinero quiere depositar 
//			y actualiza la información del saldo.
//        3. Actualizar datos del usuario: Pide el nombre y apellido del usuario 
//			y actualiza la información del usuario.
//        4. Guardar: Guarda la información de los arrays en el archivo.
//        5. SALIR
		String[] aux = new String[5];

		String[] dni = new String[5];
		String[] nombre = new String[5];
		String[] apellido = new String[5];
		long[] saldo = new long[5];

		rellenararrays(aux, dni, nombre, apellido, saldo);

		menu(dni, saldo, nombre, apellido);

	}

	private static void menu(String[] dni, long[] saldo, String[] nombre, String[] apellido) throws IOException {

		int fin = 0;

		do {
			System.out.println("Elige una opción del menú:");
			System.out.println("1. Retirar dinero.");
			System.out.println("2. Depositar dinero.");
			System.out.println("3. Actualizar datos del usuario.");
			System.out.println("4. Guardar.");
			System.out.println("5. Salir");

			int nummenu = 0;

			Scanner scan = new Scanner(System.in);
			nummenu = scan.nextInt();

			switch (nummenu) {

			case 1:
				retirar(dni, saldo);

				break;

			case 2:
				depositar(dni, saldo);

				break;

			case 3:
				actualizar(dni, nombre, apellido);

				break;

			case 4:
				guardar(dni, saldo, nombre, apellido);

				break;

			case 5:
				System.out.println("Fin del programa");
				fin = 1;
			}

		} while (fin == 0);
	}

	private static void retirar(String[] dni, long[] saldo) {
//  	1. Retirar dinero: Pregunta al usuario cuánto dinero quiere retirar 
//		y actualiza la información del saldo.
		long dinero = 0;
		int numusuario = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Elija un usuario:");
		for (int i = 0; i < dni.length; i++) {
			System.out.println((i) + ". " + dni[i]);
		}
		numusuario = scan.nextInt();

		System.out.println("¿Cuánto dinero quiere retirar del usuario " + dni[numusuario] + "?");

		dinero = scan.nextLong();

		saldo[numusuario] = saldo[numusuario] - dinero;
		System.out.println("EL saldo actual es " + saldo[numusuario]);
	}

	private static void depositar(String[] dni, long[] saldo) {
//      2. Depositar dinero: Pregunta al usuario cuánto dinero quiere depositar 
//		y actualiza la información del saldo.
		long dinero = 0;
		int numusuario = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Elija un usuario:");
		for (int i = 0; i < dni.length; i++) {
			System.out.println((i) + ". " + dni[i]);
		}
		numusuario = scan.nextInt();

		System.out.println("¿Cuánto dinero quiere depositar del usuario " + dni[numusuario] + "?");

		dinero = scan.nextLong();

		saldo[numusuario] = saldo[numusuario] + dinero;

	}

	private static void actualizar(String[] dni, String[] nombre, String[] apellido) {
//      3. Actualizar datos del usuario: Pide el nombre y apellido del usuario 
//		y actualiza la información del usuario.
		int numusuario = 0;
		String nombrenuevo = "";
		String apellidonuevo = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Elija un usuario:");
		for (int i = 0; i < dni.length; i++) {
			System.out.println((i) + ". " + dni[i]);
		}
		numusuario = scan.nextInt();

		System.out.println("Introduzca el nombre del usuario con DNI " + dni[numusuario] + ".");
		nombrenuevo = scan.next();
		nombre[numusuario] = nombrenuevo;

		System.out.println("Introduzca el apellido del usuario con DNI " + dni[numusuario] + ".");
		apellidonuevo = scan.next();

		apellido[numusuario] = apellidonuevo;
		System.out.println("El nombre actual del usuario " + dni[numusuario] + " es " + nombre[numusuario] + " "
				+ apellido[numusuario] + ".");
	}

	private static void guardar(String[] dni, long[] saldo, String[] nombre, String[] apellido) throws IOException {
//		4. Guardar: Guarda la información de los arrays en el archivo.

		BufferedWriter bw = new BufferedWriter(new FileWriter("src/ficheros_ejercicios/ejercicio03.txt"));
		for (int i = 0; i < dni.length; i++) {

			

			bw.write(dni[i] + (":") + nombre[i] + (":") + apellido[i] + (":") + (String.valueOf(saldo[i])) + "\n");
		
			
		}
		bw.flush();

		bw.close();
		
	}

	private static void rellenararrays(String[] aux, String[] dni, String[] nombre, String[] apellido, long[] saldo)
			throws IOException {

		File archivo = new File("src/ficheros_ejercicios/ejercicio03.txt");
		FileReader fr = new FileReader(archivo.toString());
		BufferedReader br = new BufferedReader(fr);

		String linea = "";

		for (int i = 0; i <= aux.length; i++) {
			linea = br.readLine();
			aux = linea.split(":");

			dni[i] = aux[0];
			nombre[i] = aux[1];
			apellido[i] = aux[2];
			saldo[i] = Long.parseLong(aux[3]);
		}

//		for (int i = 0; i < dni.length; i++) {
//			System.out.println(saldo[i]);
//
//		}

		br.close();
	}

}
