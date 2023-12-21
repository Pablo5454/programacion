package ejercicio_2_2;
import java.util.Scanner;
public class ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  7. Pedir un número entre 1 y 7, después visualizar el día de la semana correspondiente.
		int dia;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número entre 1 y 7.");
		dia = scan.nextInt();

		

		switch(dia) {
		   case 1:
		    System.out.println("Hoy es lunes.");
		    break;
		  case 2:
		    System.out.println("Hoy es martes.");
		    break;
		  case 3:
		    System.out.println("Hoy es miércoles.");
		    break;
		  case 4:
			System.out.println("Hoy es jueves.");
			break;
		  case 5:
			System.out.println("Hoy es viernes.");
			break;
		  case 6:
			System.out.println("Hoy es sábado.");
			break;
		  case 7:
			System.out.println("Hoy es domingo.");
			break;
		  default:
		    System.out.println("El número introducido no está entre 1 y 7.");
		}
		
					
			
		
		scan.close();
	}

}
