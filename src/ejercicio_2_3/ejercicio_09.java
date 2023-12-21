package ejercicio_2_3;

public class ejercicio_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribir un programa que imprima la suma de todos los 
		// números pares que están entre 1 y 100 e imprima cuántos hay.
		
		int suma = 0; int total = 0;
		for(int i = 2; i <=100;)  {	
			total++;
			suma= suma + i;
			i++; i++; 
		}
		System.out.println("La suma de los números pares entre 1 y 100 es :" + suma);
		System.out.println("El total de números pares sumados es: " + total + ".");
	}

}
