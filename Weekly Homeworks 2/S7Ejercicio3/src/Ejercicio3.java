
public class Ejercicio3 {

	public static void main(String[] args) {
		/*Crear una clase y su correspondiente m�todo main. Definir un array de
		String bidimensional irregular llamado a�o. Cada una de sus filas
		representar� un mes, mientras que el n�mero de elementos de cada fila
		(columnas) depender� del n�mero de d�as que tenga el mes
		correspondiente en un a�o no bisiesto, es decir, el primer elemento tendr�
		longitud 31, el segundo 28, etc�tera. 
		Ponga "hoy no hay clase" en el 6 de Enero, y alg�n otro texto en el d�a de hoy. Use un bucle para Imprimir por
		pantalla el n�mero de filas del array y el n�mero de columnas de cada fila.*/
		
		// year[month][day]
		String [][] year = new String[][] {
			{"1", "2", "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"},
			{"1", "2", "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28"},
			{"1", "2", "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"},
			{"1", "2", "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"},
			{"1", "2", "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"},
			{"1", "2", "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"},
			{"1", "2", "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"},
			{"1", "2", "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"},
			{"1", "2", "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"},
			{"1", "2", "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"},
			{"1", "2", "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"},
			{"1", "2", "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"},

		};
		
		// 6/1 = year[0][5]
		year [5][0] = "Hoy no hay clase";
		// 23/10 = year[9][22]
		year [9][22] = "Hoy";
		
		System.out.println(year.length);
		
		for(int i =0 ;i<year.length;i++){
			for(int j =0; j<year[i].length;j++)
			System.out.println(year[i][j]);
		}
	}
	
	

}