public class Ejercicio7 {

	public static void main(String[] args) {
		// Programa del juego de cara o cruz
		
		//Bucle con contador 10 veces (las veces que se iniciara el juego)

		int puntosJugador1 = 0; //Declaro el marcador de los jugadores en 0 para comenzar
		int puntosJugador2 = 0;
		int puntosJugador3 = 0;
		
		String jugador1 = "JUGADOR1"; //Introduzco las variables para mostrar luego cada uno de los resultados de cada jugador
		String jugador2 = "JUGADOR2";
		String jugador3 = "JUGADOR3";
		
		int moneda1; 
		int moneda2;
		int moneda3; 
		
		final int cara =0;
		final int cruz = 1;
		
		for(int i = 0; i <=10 ; i++){
			moneda1 = (int) (Math.random()*2); //Se generan valores aleatorios para las monedas
			moneda2 = (int) (Math.random()*2); 
			moneda3 = (int) (Math.random()*2);
		
		//Si las monedas son iguales muestra que hay empate
		if (moneda1 == moneda2 && moneda2 == moneda3 && moneda3 == moneda1){
				System.out.println("Ha habido un empate en la tirada " + i);
				}
		
		//Diferentes posibilidades dentro del juego
		if (moneda1 != moneda2 && moneda2 == moneda3){
				
				//Se muestra el resultado de la tirada de cada jugador
				System.out.println("El " + jugador1 + " ha sacado " + moneda1);
				System.out.println("El " + jugador2 + " ha sacado " + moneda2);
				System.out.println("El " + jugador3 + " ha sacado " + moneda3);
				System.out.println("Ha ganado " + jugador1 + " en la tirada " + i);
				//Se le anade un punto al jugador ganador
				puntosJugador1++;
				//Se muestra el marcador actual
				System.out.println("JUGADOR 1 -->" + puntosJugador1);
				System.out.println("JUGADOR 2 -->" + puntosJugador2);
				System.out.println("JUGADOR 3 -->" + puntosJugador3);
				
			}
		}
			if (moneda2 != moneda1){
				if(moneda1 == moneda3){
					System.out.println("El " + jugador1 + " ha sacado " + moneda1);
					System.out.println("El " + jugador2 + " ha sacado " + moneda2);
					System.out.println("El " + jugador3 + " ha sacado " + moneda3);
					System.out.println("Ha ganado " + jugador1 + " en la tirada " + i);
					puntosJugador2++;
					System.out.println("JUGADOR 1 -->" + puntosJugador1);
					System.out.println("JUGADOR 2 -->" + puntosJugador2);
					System.out.println("JUGADOR 3 -->" + puntosJugador3);
			}
			}
			
			if (moneda3 != moneda2){
				if(moneda2 == moneda1){
					System.out.println("El " + jugador1 + " ha sacado " + moneda1);
					System.out.println("El " + jugador2 + " ha sacado " + moneda2);
					System.out.println("El " + jugador3 + " ha sacado " + moneda3);
					System.out.println("Ha ganado " + jugador1 + " en la tirada " + i);
					puntosJugador3++;
					System.out.println("JUGADOR 1 -->" + puntosJugador1);
					System.out.println("JUGADOR 2 -->" + puntosJugador2);
					System.out.println("JUGADOR 3 -->" + puntosJugador3);
				}
					
			}
		

		//El programa imprime por pantalla quien es el ganador segun las diferentes posibilidades
		if (puntosJugador1 > puntosJugador2){
			if (puntosJugador2 >= puntosJugador3){
				System.out.println("El " + jugador1 + " ha ganado la partida con " + puntosJugador1 + " puntos");
			}
		}
		
		if (puntosJugador2 > puntosJugador1){
			if (puntosJugador1 >= puntosJugador3){
				System.out.println("El " + jugador2 + " ha ganado la partida con " + puntosJugador2 + " puntos");
			}
		}
		
		if (puntosJugador3 > puntosJugador1){
			if (puntosJugador1 >= puntosJugador2){
				System.out.println("El " + jugador3 + " ha ganado la partida con " + puntosJugador1 + " puntos");
			}
		}
		
		if (puntosJugador3 > puntosJugador2){
			if (puntosJugador2 > puntosJugador1){
				System.out.println("El " + jugador3 + " ha ganado la partida con " + puntosJugador1 + " puntos");
			}
		}
		
		if (puntosJugador1 > puntosJugador3){
			if (puntosJugador3 > puntosJugador2){
				System.out.println("El " + jugador1 + " ha ganado la partida con " + puntosJugador1 + " puntos");
			}
		}
		
		if (puntosJugador2 > puntosJugador3){
			if (puntosJugador3 > puntosJugador1){
				System.out.println("El " + jugador2 + " ha ganado la partida con " + puntosJugador1 + " puntos");
			}
		}
		
		if (puntosJugador3 == puntosJugador2){
			if (puntosJugador2 > puntosJugador1){
				System.out.println("El " + jugador1 + " ha ganado la partida con " + puntosJugador1 + " puntos");
			}
		}
		
		if (puntosJugador3 == puntosJugador1){
			if (puntosJugador1 > puntosJugador2){
				System.out.println("El " + jugador1 + " ha ganado la partida con " + puntosJugador1 + " puntos");
			}
		}
		
		if (puntosJugador2 == puntosJugador1){
			if (puntosJugador1 > puntosJugador3){
				System.out.println("El " + jugador1 + " ha ganado la partida con " + puntosJugador1 + " puntos");
			}
		}
	}
}

//Idea de como solucionar el problema de 0 = cruz , 1 = cara
/*if (moneda1 == 1){
					String cara1 = Integer.toString(moneda1);
					cara1 = "cara";
				if (moneda1 == 0){
					String cruz1 = Integer.toString(moneda1);
					cruz1 = "cruz";
				if (moneda2 == 1){
					String cara2 = Integer.toString(moneda2);
					cara2 = "cara";
				if (moneda2 == 0){
					String cruz2 = Integer.toString(moneda2);
					cruz2 = "cruz";
				if (moneda3 == 1){
					String cara3 = Integer.toString(moneda3);
					cara3 = "cara";
				if (moneda3 == 0){
					String cruz3 = Integer.toString(moneda3);
					cruz3 = "cruz";*/


