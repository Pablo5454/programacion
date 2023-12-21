package ejercicio_2_1;
import java.util.Scanner;
public class ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calcular el área de un cuadrado.
		//
		int lado;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce la medida de un lado del cuadrado en cm.");
		lado = scan.nextInt();
		
		System.out.println ("El área del cuadrado es: " + (lado*lado)+ " cm.");
		scan.close();
	}

}