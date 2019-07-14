import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		//Dinero 
		System.out.println("Introduzca una cantidad de dinero entera : ");
		double dinero = sc1.nextDouble();
		double billete500 = 0;
		double billete200 = 0;
		double billete100 = 0;
		double billete50 = 0;
		double billete20 = 0;
		double billete10 = 0;
		double billete5 = 0;
		double moneda2 = 0;
		double moneda1 = 0;
		double moneda50 = 0;
		double moneda20 = 0;
		double moneda10 = 0;
		double moneda05 = 0;
		double moneda02 = 0;
		double moneda01 = 0;
		
		while (dinero >= 500){
			billete500++;
		    dinero = dinero - 500;}
	
		
		
		while (dinero >= 200){
		    billete200++;
			dinero = dinero - 200;}
		
			
	    while (dinero >= 100){
			billete100++;
		    dinero = dinero - 100;}
		 
	    while (dinero >= 50){
		    billete50++;
		    dinero = dinero - 50;}
		  
		while (dinero >= 20){
			billete20++;
			dinero = dinero - 20;}
			
		while (dinero >= 10){
			billete10++;
			dinero = dinero - 10;}
		
	    while (dinero >= 5){
		    billete5++;
		    dinero = dinero - 5;}
		    
		while (dinero >= 2){
			moneda2++;
			dinero = dinero - 2;}
	
	    while (dinero >= 1){
		    moneda1++;
		    dinero = dinero - 1;}
	
		while (dinero >= 0.5){
	        moneda50++;
		    dinero = dinero - 0.5;}
		 
		while (dinero >= 0.2){
		    moneda50++;
			dinero = dinero - 0.2;}
		
		while (dinero >= 0.1){
			moneda10++;
		    dinero = dinero - 0.1;}
		
		while (dinero >= 0.05){
		    moneda05++;
			dinero = dinero - 0.05;}
		
	    while (dinero >= 0.02){
			moneda02++;
			dinero = dinero - 0.02;}
			
	    while (dinero >= 0.01){
			moneda01++;
			dinero = dinero - 0.01;}
			
			
			System.out.println( "billetes de 500 " + billete500);
			System.out.println( "billetes de 200 " + billete200);
		    System.out.println( "billetes de 100 " + billete100);
		    System.out.println( "billetes de 50 " + billete50);
		    System.out.println( "billetes de 20 " + billete20);
			System.out.println( "billetes de 10 " + billete10);
			System.out.println( "billetes de 5 " + billete5);
			System.out.println( "monedas de 2 " + moneda2);
		    System.out.println( "monedas de 1 " + moneda1);
		    System.out.println( "monedas de 0,5 " + moneda50);
			System.out.println( "monedas de 0,2 " + moneda20);
		    System.out.println( "monedas de 0,1 " + moneda10);
		    System.out.println( "monedas de 0,05 " + moneda05);
			System.out.println( "monedas de 0,02 " + moneda02);
			System.out.println( "monedas de 0,01 " + moneda01);
					    
}
}
