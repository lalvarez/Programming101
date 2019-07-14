import java.util.Scanner;
public class Ejercicio9 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero1 = new Scanner(System.in);
		int num1;
		System.out.print("Introduzca un número entero: ");
		num1 = numero1.nextInt();
		
		
		Scanner numero2 = new Scanner(System.in);
		double num2;
		System.out.print("Introduzca número de tipo double: ");
		num2 = numero2.nextDouble();
		
		double resultado = (float) num1 + num2;
		System.out.println("La suma es : " + resultado);
	}

}
