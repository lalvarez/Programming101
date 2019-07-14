import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*Crear una clase que sea capaz de calcular la letra del NIF correspondiente a
		un DNI cualquiera. Para ello, se solicitará al usuario que introduzca por
		pantalla el número de DNI y el programa deberá imprimir por pantalla el NIF
		equivalente a dicho DNI*/
		
		//Se declara el valor del DNI
		Scanner read = new Scanner(System.in);
		System.out.print("Introduce your DNI number: ");
		int dniNumber = read.nextInt();
		
		//Se declara la variable valor que almacena el numero que correspondera con la letra del NIF correspondiente
		 int valor = dniNumber%23;
		 
		
		//Se declara la array que determina el valor para cada letra
		 char [] arrayNIF = new char [23];
		 arrayNIF [0] = 'T';
		 arrayNIF [1] = 'R';
		 arrayNIF [2] = 'W';
		 arrayNIF [3] = 'A';
 		 arrayNIF [4] = 'G';
		 arrayNIF [5] = 'M';
		 arrayNIF [6] = 'Y';
		 arrayNIF [7] = 'F';
		 arrayNIF [8] = 'P';
		 arrayNIF [9] = 'D';
		 arrayNIF [10] = 'X';
		 arrayNIF [11] = 'B';
		 arrayNIF [12] = 'N';
		 arrayNIF [13] = 'J';
		 arrayNIF [14] = 'Z';
		 arrayNIF [15] = 'S';
		 arrayNIF [16] = 'Q';
		 arrayNIF [17] = 'V';
		 arrayNIF [18] = 'H';
		 arrayNIF [19] = 'L';
		 arrayNIF [20] = 'C';
		 arrayNIF [21] = 'K';
		 arrayNIF [22] = 'E';
		 
		 System.out.print( "El NIF asociado es : " + dniNumber + arrayNIF[valor] );
	}

}
