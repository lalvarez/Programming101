
public class EjercicioGuiado {

		
		public static double calcularPoderBase(int territoriosConquistados, boolean hayRey, boolean hayDescendientes, int batallasPerdidas){
		
			double out= territoriosConquistados/12*15000000-batallasPerdidas*2000000;
		
			if(hayRey)
				out += 5000000;
			if(hayDescendientes)
				out += 1000000;
			
			return out;
		}
		
		public static void main (String args[]){

			double lannister = 0;
			double stark = 0;
			double baratheon = 0;
			double tyrell = 0;
			double martell = 0;
			double tully = 0;
			double arryn = 0;
			double presupuestoTotal = 50000000; 
			
			

			lannister= calcularPoderBase(3,true,true,0);
			stark= calcularPoderBase(5,false,true,2);
			baratheon= calcularPoderBase(2,false,true,1);
			tyrell= calcularPoderBase(1,false,true,1);
			martell= calcularPoderBase(1,false,false,0);
			tully= calcularPoderBase(0,false,false,0);
			arryn= calcularPoderBase(0,false,false,0);
			
			
			/*lannister = ((3.0/12.0)*presupuestoTerritorios)+plusRey+plusDescendientes-(0*penalizacionBatallaPerdida);
			stark = ((5.0/12.0)*presupuestoTerritorios)+0+plusDescendientes-(2*penalizacionBatallaPerdida);
			baratheon = ((2.0/12.0)*presupuestoTerritorios)+0+plusDescendientes-(1*penalizacionBatallaPerdida);
			tyrell = ((1.0/12.0)*presupuestoTerritorios)+0+plusDescendientes-(1*penalizacionBatallaPerdida);
			martell = ((1.0/12.0)*presupuestoTerritorios)+0+0-(0*penalizacionBatallaPerdida);
			tully = ((0.0/12.0)*presupuestoTerritorios)+0+0-(0*penalizacionBatallaPerdida);
			arryn = ((0.0/12.0)*presupuestoTerritorios)+0+0-(0*penalizacionBatallaPerdida);
			*/
			
			double poderTotal = lannister + stark + baratheon + tyrell + martell + tully + arryn;
			double resto = presupuestoTotal - poderTotal;
			
			if(resto > 0){
				lannister += resto/7;
				stark += resto/7;
				baratheon += resto/7;
				tyrell += resto/7;
				martell += resto/7;
				tully += resto/7;
				arryn += resto/7;
			}
			
			System.out.println("Presupuesto casa Lannister: "+ (int) lannister);
			System.out.println("Presupuesto casa Stark: "+  (int) stark);
			System.out.println("Presupuesto casa Baratheon: "+  (int) baratheon);
			System.out.println("Presupuesto casa Tyrell: "+  (int) tyrell);
			System.out.println("Presupuesto casa Martell: "+   (int) martell);
			System.out.println("Presupuesto casa Tully: "+  (int) tully);
			System.out.println("Presupuesto casa Arryn: "+  (int) arryn);

			
		}
	}


