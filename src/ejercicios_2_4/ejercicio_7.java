package ejercicios_2_4;

import java.util.Scanner;

public class ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   /*Escribir en tres líneas una dirección web. 
	    ej.: www.berria.eus
	    ww
	    berria
	    eus */
		
		//variable.replaceAll("\\." , "\n") FORMA MÁS FÁCIL
		
	String web, j = ""; 
	int longitud;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Introduce una dirección web.");
	web = scan.nextLine();
	
	longitud = web.length();
		
	int inicio = 0, fin = 0;
	
	for (int i = 0; i < longitud ; i++) {
		
		fin = i;
		
		j = Character.toString(web.charAt(i));
		
		 if (j.equals(".") ) {
			
			 
			//Printer de X posición al actual 
			
			System.out.println(web.substring(inicio, fin));
						
			inicio = fin + 1;
		
		 }
			
	}
	
	System.out.println(web.substring(inicio, fin + 1));
	
	scan.close();
		
	}

}
