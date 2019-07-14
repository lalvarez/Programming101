import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero1 = new Scanner(System.in);
		double num1;
		System.out.print("Introduzca temperatura en grados centigrados: ");
		num1 = numero1.nextInt();
		
		
		
		double num2;
		num2 = num1/5*9+32;
		System.out.print("La temperatura en grados Fahrenheit es: " + num2);

	}

}
