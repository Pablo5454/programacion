package POO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
//		Avion avion= new Avion("Avion1", 1000,200,50);
//		System.out.println(avion.getTamanyo());
//		avion.setTamanyo(0);
//		System.out.println(avion.getTamanyo());
		
		Persona p1 = new Persona("7347829D", 1654, "Madrid", "España", "Luis");
		Persona p2 = new Persona("3454529T", 1234, "Lugo", "España", "Manuel");
		Persona p3 = new Persona("1656529F", 1987, "Palencia", "España", "Lluc");
		Persona p4 = new Persona("7453459A", 1886, "Vigo", "España", "Pere");
		
		ArrayList<Persona> personas= new ArrayList<Persona>();
		
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		
		String pregunta;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el DNI de la persona que quieres buscar.");
		pregunta = scan.next();
		
		for (Iterator iterator = personas.iterator(); iterator.hasNext();) {
			Persona persona = (Persona) iterator.next();
			if(persona.getDni().equals(pregunta)) {
				System.out.println("Nombre: " + persona.getNombre());
				System.out.println("Ciudad: " + persona.getCiudad());
				System.out.println("País: " + persona.getPais());
				System.out.println("Año de nacimiento: " + persona.getAñonacimiento());

			}
		}
		personas.remove(0);
//		System.out.println(personas);
	}
	
	

}
