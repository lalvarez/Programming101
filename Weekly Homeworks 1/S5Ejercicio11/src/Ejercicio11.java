import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		
		//Declaro la coordenada x
		System.out.println("Introduce la cordenada x : ");
		int x = sc1.nextInt();
		
		//Declaro la coordenada y
		System.out.println("Introduce la cordenada y : ");
		int y = sc1.nextInt();
		
		//Primer cuadrante
		if(x > 0) {
			if(y > 0) {
				System.out.println("Estas en el primer cuadrante");}
		}
		
		//Segundo cuadrante
		if(x < 0){
			if(y > 0)
				System.out.println("Estas en el segundo cuadrante");
		}
		
		//Tercer cuadrante
		if(x < 0){
		   if(y < 0)
				System.out.println("Estas en el tercer cuadrante");
		}
		
		//Cuarto cuadrante
		if(x > 0){
			if(y < 0)
				System.out.println("Estas en el cuarto cuadrante");
		//Origen de coordenadas
		if(x == 0){
			if(y == 0)
				System.out.println("Estas en el origen de coordenadas");
				
		}
       
	}

}
}