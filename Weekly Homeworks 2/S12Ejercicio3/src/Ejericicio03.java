/**
 * 
 */

import java.util.Scanner;


public class Ejericicio03 {
	
	public static void main(String[] args){
		
		
		//array long almacenara el numero de palabras de cada longitud hasta 10
		int[] long1 = new int[10];
		
		//array vocal almacenara el numero de palabras que empiezan por cada vocal
		int[] vocal = new int[5];
		
		
		String text;
		String[] textArray;
		
		//Metodo Scanner del texto 
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un texto: ");
		text = sc.nextLine();
		
		//Metodo ya programado devuelve un array con cada String del texto como elemento
		textArray = text.split(" ");
		
		//Cierre del metodo Scanner
		sc.close();
		
		for (int i = 0; i < textArray.length; i++) {
			
			int wordLong = textArray[i].length();
			if (wordLong-1 < 10){
				long1[wordLong-1]++;
			}
			
			//Este metodo almacena en firstChar la primera letra de cada plabra del texto
			String firstChar = String.valueOf(textArray[i].charAt(0));
			
			//Si la primera letra de la palabra es vocal se modifican los elementos del array vocal
			switch(firstChar){
			
				case "a": 
					vocal[0]++;
				break;
				case "e":
					vocal[1]++; 
				break;
				case "i":
					vocal[2]++; 
				break;
				case "o":
					vocal[3]++; 
				break;
				case "u":
					vocal[4]++; 
				break;
			
			}
			
		}
		
		//Bucle para imprimir array long1 y vocal
		for (int i=1; i<=long1.length; i++)
			System.out.println("Palabras de longitud "+i+":"+long1[i-1]);
		
		System.out.println("Palabras que empiezan por a:"+vocal[0]);
		System.out.println("Palabras que empiezan por e:"+vocal[1]);
		System.out.println("Palabras que empiezan por i:"+vocal[2]);
		System.out.println("Palabras que empiezan por o:"+vocal[3]);
		System.out.println("Palabras que empiezan por u:"+vocal[4]);
		
		
	}
	

}

