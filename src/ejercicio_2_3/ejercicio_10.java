package ejercicio_2_3;
import java.util.Scanner;
public class ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribir un programa para que pida un número y muestre en pantalla 
		// el mismo número de asteriscos. (en distintas líneas).
		
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número.");
		num = scan.nextInt();
		
		for ( int i = 0; i < num;)  {	
		
			System.out.println("*");
			i++;
			
		}
		
		
		scan.close();	
	}

}
