import java.util.Scanner;
public class Ejercicio1 {
	

		public static void main(String[] args) {
			
			double [][] matriz = {{2.99,1.1}, {4.34,6.89}, {6.56,7.5}, {8.3,10.5}}; 
			
			System.out.println(mayorFila(matriz));
			

		}
		
		public static double suma (double v[]){
			double suma=0.0;
			
			for(int h=0; h < v.length; h++){
				
				suma += v[h];
			}
			
			return suma;
		}
		
		public static int mayorFila (double w[][]){
			int mayorFila = 0;
			double suma1 = 0.0, suma = 0.0;
			
			for (int i =0; i<w.length; i++){
					suma1 = suma(w[i]);
					
					
				
				if (suma1 > suma){
					suma = suma1;
					mayorFila = i; 
				}
				
			}
			
			
			return mayorFila;
			
		}

	}


	
	/*//Esta funcion devuelve un array con las sumas de las filas como elementos
	public static double [] newArraySum2(double[][] matrix, int m, int n){
		
		double sumaFilas [] = new double [m];
		
		for(int i =0; i<m;i++){
			for(int j =0; j< n; j++){
			double suma = 0;
	        suma = suma + matrix[i][j];
	        sumaFilas[i]=suma;
	        
	        }
		}
		
		return sumaFilas;
		}
	
        public static double newArraySum(double[] array, int n){
	    double suma = 0;
		for(int i =0; i<n;i++){
              suma = suma + array[i];
	        }
		
		return suma;
		}
        
        public static double newArraySum4(double[][] matrix, int m, int n){
        	int resultado = 0;
        	newArraySum(double[] array, n);
        return resultado;
        }
	
	


	public static void main(String[] args) {
		
		//Declaro el escaner read
		Scanner read = new Scanner(System.in);
		//EL usuario introduce el orden de la matriz
		//La variable n corresponde al numero de filas
		//La variable m corresponde al numero de columnas
		System.out.print("Introduce el numero de filas");
		int n = read.nextInt();
		System.out.print("Introduce el numero de columnas");
		int m = read.nextInt();
		
		
		
		//El programa pide memoria para un array de mxn
       double matrix [][] = new double[m][n];
      
       
       //El usuario rellena el array
       System.out.print("Introduce los valores");
       for (int i =0; i<m ; i++){
    	   for (int j =0; j < n; j++){
    		   double valores = read.nextDouble();
    		   matrix[i][j]= valores;
    	   }
    		   
    	   }
    	   
      //Se llama a la funcion
    	   newArraySum(matrix, m, n);
    	   
    	   for (int i =0; i<m ; i++){
    		   System.out.println(sumaFilas[i]);
    	   }
    	   
       


	}

}
*/