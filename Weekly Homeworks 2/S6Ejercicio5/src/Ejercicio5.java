import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		{
			
			
			Scanner sc = new Scanner(System.in);
	  	    System.out.println("Introduce el orden del cuadro: ");
	    	int n = sc.nextInt();
			
			int j = 1;
			int prueba = n;
			
			for (int i = 1; i < n + 1 ; i++){
				System.out.print(i + " ");
			}
			while (j < n){

			System.out.print("\n");
			
			System.out.print(prueba + " ");
			
			for(int i = 1; i < n; i++){
				
				System.out.print(i + " ");
			}
			j++;
			prueba--;
			
			}
		}

	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int n = 100, m =0;
		int valorAleatorio = (int) Math.floor(Math.random()*(n-m+1) +m);
		
		System.out.println("Se ha generado un numero aleatorio");
 
   	    
   	    do {
   	    	
   	    	Scanner sc = new Scanner(System.in);
   			System.out.println("Introduce el numero");
   		    int numeroIntento = sc.nextInt();
   	   
   	    	if (numeroIntento>valorAleatorio){
   	    		System.out.println("El numero es menor que " + numeroIntento);
   	    		System.out.println("Sigue intentandolo!");
   	    		
   	  	        
   	    	}
   	    	if (numeroIntento<valorAleatorio){
   	    		System.out.println("El numero es mayor que " + numeroIntento);
   	    		System.out.println("Sigue intentandolo!");
   	        
   	  	      
   	    		}
   	    
   	    }
   	    	while(!=valorAleatorio);
   	    }
	}
	*/

   	    
   	    	
   	    
	

