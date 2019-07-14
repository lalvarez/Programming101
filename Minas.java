import java.util.Scanner;
public class EjercicioExamen {

 
		public static void main(String[] args) {
			
			//El usuario introduce el numero de filas
			System.out.println("Introduce el numero de filas del buscaminas");
			Scanner read = new Scanner (System.in);
			int filasMatriz = read.nextInt();
			
			//El usuario introduce el numero de columnas
			System.out.println("Introduce el numero de columnas del buscaminas");
			int columnasMatriz = read.nextInt();
			
			//Introduce el numero de minas del juego
			System.out.println("Introduce el numero de minas del juego");
			int minasN = read.nextInt();
			
			//Se declara la array principal
			int [][] matriz = new int [filasMatriz][columnasMatriz];
			
			//Rellenamos la matriz con el valor 1 (corresponde donde no hay minas)
			for(int i = 0; i < matriz.length; i++){
				for(int j = 0; j < matriz[i].length; j++){
					matriz [i][j] = 1;
				}
			}

			
			//Modificamos la matriz dotandola de un numero N de minas aleatorias de valor 0 almacenado en la variable minasN
			
			for (int i = 0; i < minasN; i++){
				int minasFila = (int) (Math.random()* filasMatriz);
				int minasColumna = (int) (Math.random()* columnasMatriz);
				
				matriz [minasFila][minasColumna] = 0;
					
				}
			
			//Realizamos un bucle para imprimir la matriz resultante al juego
		
		    for (int i =0; i < matriz.length; i++){
		    	for (int j = 0; j < matriz[i].length; j++){
		    		System.out.print(matriz[i][j]);
		    	}
		    	System.out.println();
		    }
		    	
			
			
			
		}

	}
