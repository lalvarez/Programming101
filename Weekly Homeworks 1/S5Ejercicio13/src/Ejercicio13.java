
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int a�o;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el a�o: ");
		a�o = entrada.nextInt();
		
	if (a�o % 100 == 0){
		
		if (a�o % 400 == 0) {
			
			if (a�o % 4 == 0){
				System.out.println("El a�o " + a�o + " es bisiesto. ");
			}
		
			else {
				System.out.println ("El a�o " + a�o + " no es bisiesto. ");
			}
			
		}
			else {
				System.out.println("El a�o " + a�o + " no es bisiesto. ");
			}
		
	}
	
		else {
			if (a�o % 4 == 0){
				System.out.println("El a�o " + a�o + " es bisiesto. ");
			}
			
			else {
				
				System.out.println ("El a�o " + a�o + " no es bisiesto. ");	
			}
		}	
	
	
	}

}

