import java.util.Scanner;
public class Ejercicio8 {
	public static void main(String[] args) {
		// Programa que adivina el numero de la suerte
	
		//Introduccion de datos por el usuario
		Scanner sc = new Scanner(System.in);
		System.out.println("Para adivinar tu numero de la suerte, introduce tu fecha de nacimiento:");
		System.out.println("Dia:");
   	    int fechaDia = sc.nextInt();
   	    System.out.println("Mes:");
	    int fechaMes = sc.nextInt();
	    System.out.println("Año:");
   	    int fechaAnio = sc.nextInt();
   	    
   	    int fechaSuma = fechaDia + fechaMes + fechaAnio;
   	    int resultado = 0;
   	    System.out.println(fechaSuma);
   	    
   	    //Suma de numeros de la variable fechaSuma entre si
   	    while (fechaSuma > 0) {
   	    	resultado += fechaSuma%10;
   	    	fechaSuma = fechaSuma/10;
   	    }
   	    
   	    //Cuando el bucle finaliza se escribe el resultado
   	    System.out.println("Tu numero de la suerte es el: " + resultado);
   	    	
   	    }
   	    
   	    	
}
