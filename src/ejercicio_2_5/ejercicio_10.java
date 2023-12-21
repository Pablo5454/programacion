package ejercicio_2_5;

public class ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tomando como dato el nombre y la edad del alumnado del aula,
		// se pretende visualizar la siguiente información:

		// Número de alumnos/as de 20 o menos años.
		// Edad media de la clase.
		// El alumno más joven de la clase y su nombre.

		String[] alumnos = { "Alumno 1", "Alumno 2", "Alumno 3", "Alumno 4", "Alumno 5" };

		int[] edad = { 23, 54, 11, 16, 19 };

		double media = 0;
		int j = Integer.MAX_VALUE, mayor_20 = 0;

		String joven = null;

		for (int i = 0; i < edad.length; i++) {

			media = media + edad[i];

			if (edad[i] < j) {

				j = edad[i];

				joven = alumnos[i];

			}

			if (edad[i] >= 20) {

				mayor_20 = mayor_20 + 1;
			}

		}

		media = media / (edad.length);

		System.out.println("El número de alumnos con veinte años o más años es: " + mayor_20);
		System.out.println("La edad media de la clase es: " + media);
		System.out.println("El alumno más joven de la clase es: " + joven);

	}

}
