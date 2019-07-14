import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Capital inicial
		Scanner numero1 = new Scanner(System.in);
		double capitalInicial;
		System.out.print("Introduzca una cantidad: ");
		capitalInicial = numero1.nextDouble();
		
		//Tipo de interes anual
		Scanner reader = new Scanner(System.in);
		String tipoDeInteresAnual;
		System.out.print("Introduzca un tipo de interes anual: ");
		tipoDeInteresAnual = reader.nextLine();
		
		//Valor de interes anual
	    Scanner numero2 = new Scanner(System.in);
		Double valorDeInteresAnual;
		System.out.print("Introduzca un valor de interes anual: ");
		valorDeInteresAnual = numero2.nextDouble();
		
		
		//Tiempo
		Scanner numero3 = new Scanner(System.in);
		double tiempo;
		System.out.print("Introduzca un periodo de tiempo (años): ");
		tiempo = numero3.nextDouble();
		
		//Capital generado
		String interesSimple = "Interes Simple"; //A partir de un interes simple
		double capitalFinal1; //A partir de un interes simple
		String interesCompuesto = "Interes Compuesto";
		double capitalFinal2; //A partir de un interes compuesto
		double dato1;
		
		if ( tipoDeInteresAnual.equals(interesSimple)){
		capitalFinal1 = capitalInicial * (1 + valorDeInteresAnual * tiempo);
		System.out.println("La cantidad final acumulada es " + capitalFinal1);}
		else if ( tipoDeInteresAnual.equals(interesCompuesto)) {
		dato1 =(1 + valorDeInteresAnual);
		capitalFinal2 =Math.pow(dato1, tiempo);
		capitalFinal2 = capitalInicial * capitalFinal2;
		System.out.println("La cantidad final acumulada es " + capitalFinal2);}
		
		else
			System.out.println("El tipo de interes introducido no es correcto");
	
	
		
	}

}
