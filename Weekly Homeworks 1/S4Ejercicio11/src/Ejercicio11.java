import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero1 = new Scanner(System.in);
		int num1;
		System.out.print("Introduzca un número entero de segundos: ");
		num1 = numero1.nextInt();
		
		int segundos = num1%60;
		int segundosCocienteHoras = num1/60;
		int minutos = segundosCocienteHoras%60;
		int horas = segundosCocienteHoras/60;
		
			
		if (horas==1)
			System.out.print("Su equivalente es: " + horas + " hora" );
		
		else
			System.out.println("Su equivalente es: " + horas + " horas");
		
		if (minutos ==1)
			System.out.println(minutos + " minuto");
		else
			System.out.println(minutos + " minutos");
		
		if (segundos==1)
			System.out.println("y " + segundos + " segundo");
		else
			System.out.println("y " + segundos + " segundos");
	    
			
		
	
		
		
		

	}

}
