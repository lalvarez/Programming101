import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce la edad : ");
		int edad1 = sc1.nextInt();
		int precioStandart = 9;
		
		if (edad1 < 5 ){
			double precioEspecial1 = precioStandart - (precioStandart*0.6);
			System.out.println("El precio de la entrada es : " + precioEspecial1);}
		
		
		else if (edad1 < 26){
			double precioEspecial2 = precioStandart - (precioStandart*0.2);
				System.out.println("El precio de la entrada es : " + precioEspecial2);
		}
		
		
		
		else if (edad1 > 65){
			double precioEspecial3 = precioStandart - (precioStandart*0.4);
			System.out.println("El precio de la entrada es : " + precioEspecial3);
		}
		
		
		else
			System.out.println("El precio de la entrada es : " + precioStandart);
		
		}
}

		
		
					
		

	


