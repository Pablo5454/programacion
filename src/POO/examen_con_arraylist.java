package POO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class examen_con_arraylist {

	public static void main(String[] args) throws IOException {

		ArrayList <Integer> id = new ArrayList <Integer>();
		ArrayList <String> marca = new ArrayList <String>();
		ArrayList <Double> precio = new ArrayList <Double>();
		ArrayList <String> tamano = new ArrayList <String>();
		ArrayList <String> color = new ArrayList <String>();
		ArrayList <Integer> ano = new ArrayList <Integer>();

		String primeralinea = "";

		primeralinea = lectura(id, marca, precio, tamano, color, ano, primeralinea);
		menu(id, marca, precio, tamano, color, ano, primeralinea);
			

	}

	public static void menu(ArrayList <Integer> id, ArrayList <String> marca, ArrayList <Double> precio, ArrayList <String> tamano, ArrayList <String> color, ArrayList <Integer> ano,
			String primeralinea) throws IOException {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String fin = "";

		do {

			System.out.println("Elige una opción del menú: ");
			System.out.println("1. Calcular la media de una marca.");
			System.out.println("2. REBAJAS.");
			System.out.println("3. Visualizar información.");
			System.out.println("4. Guardar información.");
			System.out.println("5. Salir.");
			num = scan.nextInt();

			switch (num) {
			case 1:
				media(marca, precio);
				break;
			case 2:
				rebajas(marca, precio);
				break;
			case 3:
				ver(id, marca, precio, tamano, color, ano);
				break;
			case 4:
				guardar(id, marca, precio, tamano, color, ano, primeralinea);
				break;

			case 5:
				anadir(id, marca, precio, tamano, color, ano);
			case 6:
				fin = "YES";
				System.out.println("Fin del programa.");
				break;
			}


		} while (!fin.equalsIgnoreCase("YES"));

	}

	public static String lectura(ArrayList <Integer> id, ArrayList <String> marca, ArrayList <Double> precio, ArrayList <String> tamano, ArrayList <String> color, ArrayList <Integer> ano,
			String primeralinea) throws IOException {

		File archivo = new File("src/POO/ropa.csv");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);

		String linea = "";
		String aux[] = new String[6];
		primeralinea = br.readLine();
		linea = br.readLine();
		for (int i = 0; linea!=null ; i++) {

//			linea = linea.toString();
			aux = linea.split(",");
			id.add(Integer.parseInt(aux[0]));
			marca.add(aux[1]);
			precio.add(Double.parseDouble(aux[2]));
			tamano.add(aux[3]);
			color.add(aux[4]);
			ano.add(Integer.parseInt(aux[5]));
			linea = br.readLine();
		}

		return primeralinea;

	}

	public static void media(ArrayList <String> marca, ArrayList <Double> precio) {
		Scanner scan = new Scanner(System.in);
		String datomarca = "";
		double datoprecio = 0;

		int cont = 0;
		System.out.println("Introduce una marca para saber la media de precios de la misma.");
		datomarca = scan.nextLine();
		for (int i = 0; i < marca.size(); i++) {
			
			if (datomarca.equalsIgnoreCase(marca.get(i))) {
				datoprecio += precio.get(i);
				cont++;
			}
		}
		System.out.println("El precio medio de la marca " + datomarca + " es: " + (datoprecio / cont));
	}

	public static void rebajas(ArrayList <String> marca, ArrayList <Double> precio) {
		
		Scanner scan = new Scanner(System.in);
		String datomarca = "";
		double datoprecio = 0;
		System.out.println("Introduce la marca a la que quieres rebajar el precio.");
		datomarca = scan.nextLine();
		System.out.println("¿Cuánto quieres rebajar todos sus productos?");
		datoprecio = scan.nextDouble();
		if (datoprecio < 0) {
			System.out.println("El número introducido no es válido.");
		} else {

			for (int i = 0; i < marca.size(); i++) {
				if (datomarca.equalsIgnoreCase(marca.get(i))) {
					if((precio.get(i) -datoprecio)<0) {
						precio.set(i, 0.0);
					} else {
					precio.set(i, (precio.get(i)-datoprecio));
					}

				}
			}
			System.out.println("Rebaja realizada con éxito.");
		}
		

	}

	public static void ver(ArrayList <Integer> id, ArrayList <String> marca, ArrayList <Double> precio, ArrayList <String> tamano, ArrayList <String> color, ArrayList <Integer> ano) {

		Scanner scan = new Scanner(System.in);
		int datoid = 0;
		System.out.println("¿De qué ID quieres visualizar su información?");
		int cont = 0;
		datoid = scan.nextInt();
		for (int i = 0; i < ano.size(); i++) {
			
			if(datoid == id.get(i)) {
			
				System.out.println("El producto con id " + id.get(i) + ", es de la marca " + marca.get(i) + ", su precio es "
				+ precio.get(i) + ", su talla es " + tamano.get(i) + ", es de color " + color.get(i)
				+ " y su año de venta es " + ano.get(i) + ".");
				
				cont++;
			} 

		}
		if(cont == 0) {
			System.out.println("La ID introducida no existe.");

		}
		
	}

	public static void anadir (ArrayList <Integer> id, ArrayList <String> marca, ArrayList <Double> precio, ArrayList <String> tamano, ArrayList <String> color, ArrayList <Integer> ano) {
	
}
	public static void guardar(ArrayList <Integer> id, ArrayList <String> marca, ArrayList <Double> precio, ArrayList <String> tamano, ArrayList <String> color, ArrayList <Integer> ano,
			String primeralinea) throws IOException {

		FileWriter fw = new FileWriter(new File("src/POO/ropa.csv"), false);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(primeralinea + "\n");

		for (int i = 0; i < id.size(); i++) {

			bw.write(id.get(i) + "," + marca.get(i) + "," + precio.get(i) + "," + tamano.get(i) + "," + color.get(i) + "," + ano.get(i) + "\n");

		}

		bw.flush();
		bw.close();
		System.out.println("Datos guardados con éxito.");
	}
}