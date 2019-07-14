import java.util.Scanner;
public class Ejercicio1{

  
   public static void main(String []args){
	   //Programa que suma todos los numeros que el usuario introduce hasta que introduce el cero
	   Scanner sc = new Scanner(System.in);
	     System.out.println("Introduce un numero entero");
  	     int numero2 = sc.nextInt();
  	     int suma = numero2;
  	     int j =0;
  	     double media;
  	     while(numero2 !=0){
  		     System.out.println("Introduce otro numero entero");
  	  	     numero2 = sc.nextInt();
  	  	     suma = suma + numero2;
  	  	     j++;}
  	    media = (double) suma/j;
  	     System.out.println("la suma total es : " + suma);
  	   System.out.println("la media es : " + media);
   }
  	     }

