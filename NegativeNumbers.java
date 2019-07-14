/**
 * 
 */

/**
 * @author Laura
 * El usuario introduce numeros hasta que sean dos negativos consecutivos, entonces imprime el numero de intentos
		
 *
 */
import java.util.Scanner;
public class EjercicioImpares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int contador = 0;
		int numero1 = 4;
		
		System.out.println("Introduce un numero: ");
		
		while(numero1>0){
			numero1 = read.nextInt();
			contador++;
			if(numero1<0){
				int numero2 = read.nextInt();
				contador++;
				if(numero2<0){
					
				}
				else {
					numero1 =2;
				}

			
			}
		}

		System.out.println("El usuario ha introducido " + contador + " numeros");
		
	}

}
