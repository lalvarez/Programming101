import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
        //Programa para saber si dos numeros son divisibles
		
		//Declaracion de los dos numeros
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce un numero : ");
		double num1 = sc1.nextDouble();
		System.out.println("Introduce un numero : ");
		double num2 = sc1.nextDouble();
		
		//Variable numero 3 que contiene la division de ambos numeros
		double num3 = num1/num2;
		
		//Condicion si el modulo es cero son divisibles
		if ( num1%num2==0 ) {
			System.out.println("Los numeros son divisibles");
		System.out.println("El resultado es " + num3 ); //El programa muestra el resultado de la division
		}
        
		else 
		System.out.println("Los numeros no son divisibles entre si");
	}

}
