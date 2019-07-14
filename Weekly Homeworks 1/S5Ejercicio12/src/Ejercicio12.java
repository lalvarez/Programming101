import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		//Sueldo del operario
		System.out.println("Introduzca su sueldo : ");
		double sueldo = sc1.nextDouble();
		
		//Años de antiguedad
		System.out.println("Introduzca su antiguedad en años: ");
		double antiguedad = sc1.nextDouble();
		
		//Declaracion de la variable del aumento del 20%
		double aumento1 = sueldo + (sueldo * 0.2); 
		//Aumento 1 (20%)
		if (sueldo < 500){
		    if (antiguedad >= 10){
			System.out.println("Su sueldo aumentara a " + aumento1);}
		}
		
		//Declaracion de la variable del aumento del 5%
		double aumento2 = sueldo + (sueldo * 0.05); 
		//Aumento 2 (5%)
		if (sueldo < 500){
		    if (antiguedad < 10){
			System.out.println("Su sueldo aumentara a " + aumento2);}
		}
		
		
		//Aumento 2 (0%)
		if (sueldo >= 500){
	     System.out.println("Su sueldo se mantiene en " + sueldo);}
				}
				

	}


