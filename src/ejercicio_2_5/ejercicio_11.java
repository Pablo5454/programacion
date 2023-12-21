package ejercicio_2_5;

public class ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Como dato de entrada tenemos la temperatura diaria de la semana en Cº. Como
		// resultado queremos:
		// Temperatura media semanal en ªF
		// El día más caluroso
		// Y los nombres de los días que han superado la media.

		int temperatura[] = { 10, 17, 24, 12, 10, 26, 15 };
		String dias[] = { "lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo" };
		String dia = null, supera = "";

		double media = 0, media_f = 0;
		int caluroso = Integer.MIN_VALUE;

		for (int i = 0; i < temperatura.length; i++) {

			media += temperatura[i];

			if (temperatura[i] > caluroso) {
				caluroso = temperatura[i];

				dia = dias[i];
			}

		}

		media = media / (temperatura.length);
		media_f = (media * 9) / 5 + 32;

		System.out.println("La temperatura media semanal es de " + media_f + " ºF.");
		System.out.println("El día más caluroso es el " + dia + ".");

		for (int i = 0; i < temperatura.length; i++) {

			if (temperatura[i] > media) {

				supera += dias[i] + ", ";

			} 

		}
		
		System.out.println("Los días " + supera + "han superado la media de temperatura.");

	}

}
