import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
	    //Programa que reconoce que numero es mayor
		
		//Declaracion numero 1 y numero 2
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce un numero : ");
		double num1 = sc1.nextDouble();
		System.out.println("Introduce un numero : ");
		double num2 = sc1.nextDouble();
		//Variante dentro del condicional por si son iguales
		if ( num1 == num2 )
			System.out.println("Los numeros son iguales");
		
		else if (num1 > num2)
			System.out.println("El numero " + num1 + " mayor");
		else 
		System.out.println("El numero " + num2 + " es mayor");
				
		

	}

}
