import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Programa que concreta quein tiene mas edad de dos personas
		//Declaracion de los nombres y las edades
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce el primer nombre : ");
		String nombre1 = sc1.next();
		System.out.println("Introduce el segundo nombre : ");
		String nombre2 = sc1.next();
		System.out.println("Introduce la edad de " + nombre1 + ": ");
		double edad1 = sc1.nextDouble();
		System.out.println("Introduce la edad de " + nombre2 + ": ");
		double edad2 = sc1.nextDouble();

		 
		if (edad1 > edad2)
		System.out.println(nombre1 + " es mayor que " + nombre2);
		if (edad1 == edad2)
		System.out.println(nombre1 + " tiene la misma edad que " + nombre2);
		if (edad1 < edad2) 
			System.out.println(nombre1 + " es menor que " + nombre2);
		
		

	}

}
