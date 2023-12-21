package ejercicio_2_2;

import java.util.Scanner;

public class ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Pedir el usuario y la contraseña y decir si el login está bien. (usuario: ikaslea
		// contraseña: ik1920)
		
		String usuario, contraseña;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu nombre de usuario.");
		usuario = scan.nextLine();
		System.out.println("Introduce tu contraseña.");
		contraseña = scan.nextLine();

			if ( usuario.equals("ikaslea") && contraseña.equals("ik1920")) {
				System.out.println ("El usuario y contraseña son correctos.");
		
			} else {
				System.out.println ("El usuario o contraseña son incorrectos.");
			}
		scan.close();
	}

}