import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		/*Escribir un programa en Java que en su m�todo main realice lo
		siguiente:
			a) Pedir al usuario que introduzca el tama�o del array de double a crear.
			b) Crearlo y rellenarlo aleatoriamente con n�meros del 1 al 49.
			c) Crear una variable de tipo entero llamada total
			d) Introducir en la variable total la suma de los elementos del array
			e) Imprimir el valor de la variable total
*/
        //a
		Scanner read = new Scanner(System.in);
		System.out.println("Introduce el tamanio del array ");
		double a = read.nextDouble();
		/*System.out.println("Introduce el numero de columnas ");
		int b = read.nextInt();*/
		int total = 0;
		
		double[] miArray = new double[(int) a];
		for (int i=0; i<miArray.length; i++){
			miArray [i]= (int) (Math.random()*50);
			System.out.println(miArray[i]);
			total = (int) (total + miArray[i]);
		}
		
		System.out.println(total);
	}

}
