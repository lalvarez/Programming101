
public class Ejercicio1 {

	public static void main(String[] args) {
		/*Cree un array de cualquier tipo dando valor a sus elementos en la misma
		declaraci�n. Iguale dos de sus elementos (ejemplo a[5]=a[3]), imprima
		ambos elementos. A continuaci�n en otra l�nea cambie el valor del segundo
		elemento, imprima los dos otra vez �cambia tambi�n el primero? �Por qu�?
		�Y si cambiamos el primero en lugar del segundo?*/

        int a [] = new int [] {1,2,3};
        a[0]=a[2];
        System.out.println(a[0]);
        System.out.println(a[2]);
        a[0]=4;
        System.out.println(a[0]);
        System.out.println(a[2]);
	}

}
