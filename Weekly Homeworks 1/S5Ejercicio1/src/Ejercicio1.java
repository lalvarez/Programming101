import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
        
		//Programa para saber si un numero es par o impar
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce un numero : ");
		int num1 = sc1.nextInt();
		
		if ( num1 == 0 )
			System.out.println("El numero no es valido.");
		//Si el resto es 0 imprime par
		else if (num1%2 == 0)
			System.out.println("El numero " + num1 + " es par.");
		//Si el resto no es 0 imprime impar
		else
		System.out.println("El numero " + num1 + " es impar.");
				
		

	}

}
