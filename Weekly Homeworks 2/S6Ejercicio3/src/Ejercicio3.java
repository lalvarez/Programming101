import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		 
		 //Escaner1
		 Scanner sc = new Scanner(System.in);
  	     System.out.println("Introduce un numero entero");
    	 int numeroEntero = sc.nextInt();              //La variable numeroEntero equivale al numero entero 
    	 
    	 //Escaner2
    	 
  	     System.out.println("Introduce el numero de multiplos que quieres obtener");
    	 int numeroDeMultiplos = sc.nextInt();        //La variable numeroDeMultiplos equivale al numero de multiplos
    	 
    	 int n;
    	 for (n = 1; n<= numeroDeMultiplos; n++){
    		 System.out.println(numeroEntero*n );
    		 
    		 
    	 }

	}

}
