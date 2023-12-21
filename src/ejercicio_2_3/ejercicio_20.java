package ejercicio_2_3;

public class ejercicio_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Visualizar los 10 primeros números de la serie Fibonacci.
		
		int num1 = 1;
		int num2 = 1;
		int suma = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println (num1);
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
		}

	}

}
