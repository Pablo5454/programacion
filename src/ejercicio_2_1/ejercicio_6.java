package ejercicio_2_1;
import java.util.Scanner;
public class ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Como dato tenemos la temperatura en el aula en ºC. 
		// Queremos saber su equivalente en ºF. (ºF = ºC * 1.8 + 32). 
		// La temperatura en el aula se introducirá desde el teclado.
		//
		int temp;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce la temperatura del aula en ºC.");
		temp = scan.nextInt();
		System.out.println("La temperatura del aula en ªC es " + temp);
		
		System.out.println ("La temperatura del aula en ªF es: " + (temp * 1.8 + 32));
		scan.close();
	}

}