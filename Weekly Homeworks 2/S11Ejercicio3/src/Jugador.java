
public class Jugador {
	private String name;
	private int score;
	private String strategy;
	private String option;
	private int valorCiclico;
	private int ronda;
	private String winerOption;
	private String option1;
	private String option2;
	
	public String getName (){
		return name;
		}
	public void setName (String name){
		this.name = name;
		
	}
	
	public int getScore (){
		return score;
		}
	public void setScore (int score){
		this.score = score;
		
	}
	
	public String strategy (){
		return strategy;
		}
	public void setStrategy (String strategy){
		this.strategy = strategy;
		
	}
	public String getOption (){
		return option;
		}
	public void setOption (String option){
		this.option = option;
		
	}
	public String getOption1 (){
		return option;
		}
	public void setOption1 (String option){
		this.option = option;
		
	}
	
	public String getOption2 (){
		return option;
		}
	public void setOption2 (String option){
		this.option = option;
		
	}
	
	
	
	public String option (String strategy){
		switch (strategy)
		
		{
			case "aleatorio": 
				int ValorAleatorio = (int) Math.random()*2;
				if (ValorAleatorio == 0)
					option = "piedra";
				else if (ValorAleatorio ==1 )
					option = "papel";
				else if (ValorAleatorio == 2)
				    option ="tijeras";
				
				break;
			
			case "ciclica":
				
				
					
			    break;
				
			case "copia":
				return winerOption;
				
			}
		return option;

		}
	
	public String juego (String option1, String option2){
		
	}
	

	public static void main(String[] args) {
		
		
		
		Jugador jugador1 = new Jugador();
		jugador1.setName("Pedro");
		jugador1.setStrategy("aleatorio");
		jugador1.setOption1(jugador1.option("aleatorio"));
		
		Jugador jugador2 = new Jugador();
		jugador2.setName("Juan");
		jugador2.setStrategy("ciclica");
		jugador2.option("ciclica");
		jugador2.setOption2(jugador2.option("ciclica"));
		
		
		
		

	}

}
