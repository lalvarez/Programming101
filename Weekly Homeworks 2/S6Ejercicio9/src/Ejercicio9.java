import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
	/*	// Programa que realiza un cuadro latino
   	    Scanner sc = new Scanner(System.in);
	    System.out.println("Introduce el orden del cuadro: ");
 	    int n = sc.nextInt();
		
		//int i;
 	    //int j;
		int aux =0;
	int [][] array = new int [n][n]; 
	if(aux ==0){
		array [0][aux]= 1;
		aux++;
	}
	
		for(int j=n;j>1;j--){
			
			
			
			array [0][aux]= j;
			array [aux] [aux ]= 1;
			for (int k=1; k <n-1; k++ ){
				for( int aux3 =0; aux < n-5; aux3++ ){
				for ( int aux2 =k; aux2< n-k; aux2++){
			
			array [aux2 + aux3][aux2]= k; 
			array [aux2 + aux3][1]= n;
			
			}}
			}
			aux++;
		}
		
		for(int i =0; i< n ; i++){
			for(int j =0; j<n; j++){
				System.out.print(array [j][i]);
			}
			System.out.println();
		}
		
		
	}
		
		 int FILAS = 6;
	        int COLS = 6;
	        int matriz[][]= new int [FILAS][COLS];
	       
	        for (int fil = 0; fil < FILAS; fil++) {
	            for (int col = 0; col < COLS; col++) {
	                //si es la primera fila
	                if (fil==0) matriz[fil][col]=col+1;
	                //si no, si es la primera columna
	                else if(col==0) matriz[fil][col]= matriz[fil-1][COLS-1];
	                // para el resto de casos
	                else matriz[fil][col]= matriz[fil-1][col-1];
	            }
	        }
	       
	        for (int i = 0; i < FILAS; i++) {
	            for (int j = 0; j < COLS; j++) {
	                if (matriz[i][j]<10) System.out.print(matriz[i][j]);
	                else System.out.print(matriz[i][j]);
	            }
	            System.out.println();
	        }
	       
	   
	    */
	
	int [] array1 = new int [] {3,4,5,8,9};
	
	//int [] array2 = new int [] {5,4,3};
	
	//array1 = array2 ;
	 
	
	int posI = 1;
	int posF = 3;
	//int x = array1.length - posF;
	int aux1 = array1[posI];
	//int aux2;
	for(int i =posI; i < posF; i ++){
		
	array1 [i]= array1[i+1];
	
	}
	array1 [posF]=aux1;
	for (int j = 0; j < array1.length; j++) {
       System.out.print(array1[j]);
       
    }
	}

}
