package ejercicio_2_2;
import java.util.Scanner;
public class ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Leer tres números y visualizar en pantalla la suma y la media.
		int n1, n2, n3;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número.");
		n1 = scan.nextInt();
		System.out.println("Introduce un segundo número.");
		n2 = scan.nextInt();
		System.out.println("Introduce un tercer número.");
		n3 = scan.nextInt();
		double suma = (n1 + n2 + n3);
		System.out.println ("La suma de los tres números es: " + (suma));
		System.out.println ("La media de los tres números es: " + (suma / 3));
		
		scan.close();
	}

}
