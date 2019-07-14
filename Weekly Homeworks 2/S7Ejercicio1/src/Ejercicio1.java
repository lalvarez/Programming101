
public class Ejercicio1 {

	public static void main(String[] args) {
		/*Cree un array de cualquier tipo dando valor a sus elementos en la misma
		declaración. Iguale dos de sus elementos (ejemplo a[5]=a[3]), imprima
		ambos elementos. A continuación en otra línea cambie el valor del segundo
		elemento, imprima los dos otra vez ¿cambia también el primero? ¿Por qué?
		¿Y si cambiamos el primero en lugar del segundo?*/

        int a [] = new int [] {1,2,3};
        a[0]=a[2];
        System.out.println(a[0]);
        System.out.println(a[2]);
        a[0]=4;
        System.out.println(a[0]);
        System.out.println(a[2]);
	}

}
