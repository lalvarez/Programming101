
public class Ejercicio2 {

	public static void main(String[] args) {
		/*Cree una clase y dentro de ella cree un método main. Cree un array de
		cualquier tipo. Dé valor a sus elementos. Cree un segundo array e iguálelo
		al primero (haciendo a=b). En una línea posterior cambie el valor de un
		elemento del primer array. ¿Cambia el elemento correspondiente del
		segundo? ¿Por qué? ¿Y si cambiamos un elemento del segundo, cambia el
		primero?
		Cree otros dos arrays diferentes y haga lo mismo, pero ahora en lugar de
		igualarlos use System.arraycopy(origen, elemento, destino, elemento, nº).
		¿Hay alguna diferencia?*/
		
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
