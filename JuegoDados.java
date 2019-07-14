/**
	 * @author Laura
	 * @category 2016 Exam
	 * 
	 * Este programa simula un juego de dados, se establecen unos parametros iniciales por defecto:
	 * Numero de dados
	 * Numero de rondas
	 * Numero de jugadores
	 * 
	 *Por pantalla apareceran la simulacion de las rondas y la declaracion del ganador
	 *
	 */
public class Juego {
	
	//Funcion que declara al ganador
	//@param : rondas, dados, jugador, jugadores [][][], ganadores[]
	//@return : ganadores[]
	
	public static void generarPartida (int tiradas[][][], int ganadores[], int [] jugadoresGanadores, int rondas, int jugadores, int dados){
		
		
		
		for(int i =0; i <rondas; i++){
			ganadores[i]=-1;
			//Inicializo con un valor por defecto para todos que sera modificado segun avance el juego
			for(int j =0; j <jugadores; j++){
				for(int k =0; k <dados; k ++){
					tiradas[i][j][k] = (int)(Math.random()*7);
					//Todos los jugadores realizan su tirada en cada ronda
				}
			}
		}
	}
	
	public static void imprimirRonda(int [][][] tiradas, int ronda, int jugadores, int dados){
		//Imprime una ronda
		System.out.println("Ronda numero : "+ronda);
		for(int j =0; j <jugadores; j++){
			System.out.println("Jugador numero: " + j);
			for( int k =0; k <dados; k ++){
				System.out.println("Dado numero "+ k + ": "+ tiradas[ronda][j][k]);
			}
		}
	}
	
	public static int [][][] ordenarTiradas (int [][][] tiradas, int ronda, int jugadores, int dados){
	//Metodo de la burbuja para facilitar la eleccion del ganador
		int aux;
		for(int k =0; k <jugadores; k ++){
		
		for( int i =0; i <dados-1; i ++){
			for( int j =0; j <dados-1-i;j++){
				if (tiradas [ronda][k][j] > tiradas [ronda][k][j+1]){
					aux = tiradas [ronda][k][j];
					tiradas [ronda][k][j] = tiradas [ronda][k][j+1];
					tiradas [ronda][k][j+1]= aux;
				}}
			}
		}
		//imprimirRonda(tiradas, ronda, jugadores , dados);
		return tiradas;
	}
	
	public static void declararGanadorRonda (int [][][] tiradas, int [] ganadores, int ronda, int jugadores, int dados){
		
		ordenarTiradas(tiradas, ronda, jugadores,dados);
		
		int dado = dados;
		declararGanadorAux(tiradas,ganadores, jugadores,ronda,dado);
		System.out.println("El ganador de la ronda es : " + ganadores[ronda]);
	}
	public static int [] declararGanadorAux (int [][][] tiradas, int [] ganadores, int jugadores, int ronda, int dado){
		
		int max =0;
		for( int j =0; j <jugadores ; j ++){
			if (tiradas[ronda][j][dado-1] > max){
				ganadores [ronda]=j;
				//Almacena el numero del jugador que gana
				max = tiradas[ronda][j][dado-1];
				//Se actualiza el maximo 
				
			}
			else if (tiradas [ronda][j][dado-1] == max && dado >=0 ){
				dado --;
				declararGanadorAux (tiradas, ganadores, jugadores, ronda, dado);
				//Si tienen el mismo dado se compruba con el siguiente 
			}
			else{
				
			}
			
		}
		
		return ganadores;
	}
	
	public static void ganadorFinal (int [] ganadores, int [] jugadoresGanadores , int rondas , int jugadores){
		int max =0;
		int ganador =0;
		for(int i =0; i <rondas; i ++){
			//Se recorren todas las rondas
			for(int j =0; j <jugadores; j ++){
				//Este bucle comprueba jugador a jugador si gano esa ronda 
				if (ganadores [i] == j){
					jugadoresGanadores[j]++;
					//Por cada ronda que gana un jugador se le suma uno a su puntuacion 
				}
				
			}
		}
		
		//Ahora busco la mayor puntuacion dentro del array 
		for ( int i =0 ; i < jugadoresGanadores.length-1;i ++){
			//este array almacena el numero de partidas ganadas de cada jugador por lo que compruebo quien gano mas rondas
			if (jugadoresGanadores [i] > max ){
				max = jugadoresGanadores [i];
				ganador = i;
			}
		}
		System.out.println("El ganador del juego es " + " el jugador " + ganador);
	}

	public static void main(String[] args) {
	    
		//Parametros por defecto
		int rondas = 3;
		int dados = 4;
		int jugadores = 2;
		
		
		//Se crea un array tridimensional del juego
		int  ganadores [] ;
		int tiradas [][][] ;
		int jugadoresGanadores [];
		
		jugadoresGanadores = new int [rondas];
		tiradas = new int [rondas][jugadores][dados];
		ganadores  = new int [rondas];
		
			generarPartida(tiradas, ganadores, jugadoresGanadores, rondas, jugadores, dados);
			
			//Comienzan las rondas
			for ( int i =0; i < rondas ; i ++){
				imprimirRonda (tiradas, i , jugadores, dados);
				declararGanadorRonda(tiradas, ganadores, i, jugadores, dados);
				
				}
			
			ganadorFinal (ganadores,  jugadoresGanadores, rondas, jugadores);
			
			

		
		
	}

}
