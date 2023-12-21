package ejercicio_2_5;

public class ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer un número y definir un array, 
		// rellenarlo con números creados aleatorios entre el 1 y el 10.
		
		int numeros [] = new int [10];
		int random;
		
		for (int i = 0; i < 10; i++) {
		
		random = (int) (Math.random() * 10) + 1;
		
		numeros [i] = random;
		
		System.out.println("Posición " + (i + 1) + " = " + random);
		
		}

		
		
	}

}
