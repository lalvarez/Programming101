import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Programa que divide dos numeros 
		//Declaracion de las variables que contienen ambos numeros
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce un numero entero : ");
		int num1 = sc1.nextInt();
		System.out.println("Introduce un numero entero : ");
		int num2 = sc1.nextInt();
		
		//num3 equivale al resultado de la division de ambos
		double num3 = (double) num1/num2;
		
		//Variante en el caso de que el numero 2 sea 0
		if ( num2==0 ) 
			System.out.println("No se puede dividir por cero usando enteros.");
		
        else 
		System.out.println("El resultado es " + num3);
	
		

	}

}
