package ejercicio_2_3;
import java.util.Scanner;
public class ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribir un programa, que pida un número, 
		// y visualice la tabla de multiplicación correspondiente de 1 a 10.

		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número.");
		num = scan.nextInt();
		
		for(int i = 1; i <=10; i++)  {	
			System.out.println(num + " x " + i + " = " + (i*num));
			
		}
		
		scan.close();	
		
	}

}
