import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce un numero : ");
		double num1 = sc1.nextInt();
		System.out.println("Introduce otro numero : ");
		double num2 = sc1.nextInt();
		System.out.println("Introduce otro numero mas : ");
		double num3 = sc1.nextInt();
		 
		if (num1 > num2){
			if (num2 > num3) {
				System.out.println(num3 + "<" + num2 + "<" + num1);}
		
			}
		if (num2 > num1){
			if (num1 > num3) {
				System.out.println(num3 + "<" + num1 + "<" + num2);}
			}
				
		if (num3 > num1){
		   if (num1 > num2) {
				System.out.println(num2 + "<" + num1 + "<" + num3);}
		   }
				
		if (num3 > num2){
			if (num2 > num1) {
				System.out.println(num1+ "<" + num2 + "<" + num3);}
			
		
		}
		}

	}


