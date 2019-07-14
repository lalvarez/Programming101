
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int año;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el año: ");
		año = entrada.nextInt();
		
	if (año % 100 == 0){
		
		if (año % 400 == 0) {
			
			if (año % 4 == 0){
				System.out.println("El año " + año + " es bisiesto. ");
			}
		
			else {
				System.out.println ("El año " + año + " no es bisiesto. ");
			}
			
		}
			else {
				System.out.println("El año " + año + " no es bisiesto. ");
			}
		
	}
	
		else {
			if (año % 4 == 0){
				System.out.println("El año " + año + " es bisiesto. ");
			}
			
			else {
				
				System.out.println ("El año " + año + " no es bisiesto. ");	
			}
		}	
	
	
	}

}

