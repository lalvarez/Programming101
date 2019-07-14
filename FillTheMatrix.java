import java.lang.reflect.Array;

public class FillTheMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero =1;
		int numeroElementos=0;
		int [] matriz1 = new int [5];
		
		for(int i=0; i< 2 ; i++){
	
			matriz1 [i] = numero;
			numeroElementos = i +1;
			numero++;
			
			
		}
		for ( int i =0; i < matriz1.length; i++){
			if ( matriz1 [i] ==2){
				matriz1[i] =0;
				numeroElementos--;
			}
		}
		
		for (int i = 1; i < numeroElementos -1; i++){
		matriz1 [i] = matriz1 [i+1];	
		}
		
		for (int i =0;i <matriz1.length; i ++ ){
			System.out.print(matriz1 [i] + "\t");
		}
		
			
		}
	}


