
public class Ejercicio2 {

	public static void main(String[] args) {
		/*Cree una clase y dentro de ella cree un m�todo main. Cree un array de
		cualquier tipo. D� valor a sus elementos. Cree un segundo array e igu�lelo
		al primero (haciendo a=b). En una l�nea posterior cambie el valor de un
		elemento del primer array. �Cambia el elemento correspondiente del
		segundo? �Por qu�? �Y si cambiamos un elemento del segundo, cambia el
		primero?
		Cree otros dos arrays diferentes y haga lo mismo, pero ahora en lugar de
		igualarlos use System.arraycopy(origen, elemento, destino, elemento, n�).
		�Hay alguna diferencia?*/
		
		int a [] = new int [] {1,2};
		int b [] = new int [] {8,7};
		a = b;
		a[0] = 4;
		System.out.println(b[0]);
		
		
		int c [] = new int [] {1,2};
		int d [] = new int [] {7,8};
		System.arraycopy(d, 0, c, 0, 2);
		c[0] = 4;
		
		
		System.out.println(d[0]);

		
		
		
		
		
		


	}

}
