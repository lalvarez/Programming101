
public class Ejercicio4 {

	public static void main(String[] args) {
		/*Crear arrays o matrices que sirvan para guardar los siguientes
		datos:
			a) Los resultados de la quiniela para una sola jornada (15 resultados que
			pueden ser 1 X o 2). Rellenarlo al azar usando un bucle e imprimirlo.
			b) Los resultados de la quiniela para todas las jornadas (38 jornadas y
			15 resultados cada una). Rellenarlo también al azar e imprimirlo
			(cada semana debe ser una columna)*/
        //a
		
		int num = 0;
		int k =0;
		String[][] quiniela = new String[15][38];
		
		
		for (k=0; k<38;k++){
		for (int i=0; i<quiniela.length; i++){
			num = (int) (Math.random()*3);
			
			if (num == 0) {
				quiniela[i][k] = "0";
			}
			else if (num == 1){
				quiniela[i][k] = "1";
			}
			else {
				quiniela[i][k] ="X";
				
			}
			
			System.out.println(quiniela[i][k]);
			}
          
		
		
		}
}}