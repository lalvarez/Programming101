import java.util.Scanner;
public class Persona {
	
	//Declaracion de los atributos
	private String nombre;
	private int edad;
	private int dni;
	private char letraDni;
	private String sexo;
	private double peso;
	private double altura;
	private int numeroDePersona;
	
	//Constructor por parametros para un objeto de tipo persona
	public Persona ( String nombre, String sexo, int edad, int dni, double peso,double altura){
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	//Metodos get y set para numero de persona
	public int getnumeroDePersona (){
		return numeroDePersona;
	}

	
	public void setnumeroDePersona (int numeroDePersona){
		this.numeroDePersona = numeroDePersona;
	}
	
	//Constructor por defecto para el atributo sexo del objeto persona
	public Persona (){
		sexo = "Mujer";
		altura =  180.0;
		peso = 90.0;
	}
	
	
	//Metodos set para los atributos nombre edad sexo altura peso y dni
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	
	public void setSexo(String sexo){
		this.sexo = sexo;
		
	}
	
	public void setDni (int dni){
		int cifras = 0;
		while (dni%10 !=0){
			dni =dni/10;
			cifras ++;
		}
		
		if (cifras >0 && cifras < 9){
		this.dni = dni;
		calcularLetraDni(dni);
		
		}
		while (cifras <1 || cifras >8 ) {
			System.out.println("El numero de Dni no tiene las cifras correctas");
			break;
		}
	}
	
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	//Metodo para calcular la letra del dni
	public void calcularLetraDni (int dni){
         int valor = dni%23;
		 
         //Se declara la array que determina el valor para cada letra
		 char [] arrayNIF = new char [23];
		 arrayNIF [0] = 'T';
		 arrayNIF [1] = 'R';
		 arrayNIF [2] = 'W';
		 arrayNIF [3] = 'A';
 		 arrayNIF [4] = 'G';
		 arrayNIF [5] = 'M';
		 arrayNIF [6] = 'Y';
		 arrayNIF [7] = 'F';
		 arrayNIF [8] = 'P';
		 arrayNIF [9] = 'D';
		 arrayNIF [10] = 'X';
		 arrayNIF [11] = 'B';
		 arrayNIF [12] = 'N';
		 arrayNIF [13] = 'J';
		 arrayNIF [14] = 'Z';
		 arrayNIF [15] = 'S';
		 arrayNIF [16] = 'Q';
		 arrayNIF [17] = 'V';
		 arrayNIF [18] = 'H';
		 arrayNIF [19] = 'L';
		 arrayNIF [20] = 'C';
		 arrayNIF [21] = 'K';
		 arrayNIF [22] = 'E';
		 
		 //La letra se almacenara en la variable letraDni
		 this.letraDni = arrayNIF[valor];
		 
	}
	
	
	  public String getNombre( ){
		    return this.nombre;
		  }
	  public int getEdad( ){
		    return this.edad;
		  }
	  public int getDni( ){
		    return this.dni;
		  }
		 
     
	
	public void imprimirPersona () {
		System.out.println("Informacion del participante numero " + numeroDePersona + " : ");
		System.out.println("Nombre: " + nombre);
		System.out.println("Sexo: " + sexo);
		System.out.println("Edad: " + edad + " anios");
		System.out.println("DNI: " + dni + letraDni);
		System.out.println("Peso: " + peso + " Kg");	
		System.out.println("Altura: " + altura + " m");
		System.out.println();
		
	}
	
	

	public static void main(String[] args) {

		
		//Objeto persona1
		Persona persona1 = new Persona();
		persona1.setnumeroDePersona(1);
		
		Scanner read = new Scanner(System.in);
		
		//El programa pide los datos necesarios
		System.out.println("Datos del participante numero 1");
		System.out.println("Introduzca su nombre: ");
		String nombre = read.next();
		System.out.println("Introduzca su edad: ");
		int edad = read.nextInt();
		System.out.println("Introduzca su Dni: ");
		int dni = read.nextInt();
		persona1.setDni(dni);
		System.out.println("Introduzca su sexo : ");
		String sexo = read.next();
		System.out.println("Introduzca su peso: ");
		double peso = read.nextDouble();
		System.out.println("Introduzca su altura: ");
		double altura = read.nextDouble();
		
		//Con el metodo set se inicializan los atributos de persona1
		persona1.setNombre(nombre);
		persona1.setEdad(edad);
		persona1.setDni(dni);
		persona1.setSexo(sexo);
		persona1.setPeso(peso);
		persona1.setAltura(altura);
		
		
		//Metodo para imprimir los datos
		persona1.imprimirPersona();
		
		
		
		//Se crea el objeto persona 2
		Persona persona2 = new Persona();
		persona2.setnumeroDePersona(2);
		
		//Los valores de nombre edad y dni para persona2 seran los de persona 1
		persona1.getNombre();
		persona2.setNombre(nombre);
		persona1.getEdad();
		persona2.setEdad(edad);
		persona1.getDni();
		persona2.setDni(dni);
	
		//Los valores de peso sexo y altura se dan por defecto
		
		// Llamada al metodo para imprimir los datos
		persona2.imprimirPersona();
		
		
		//Objeto persona 3
		
		//Los atributos de este objeto se dan a traves de un constructor
		Persona persona3 = new Persona("Lola","Mujer",45,2624486,55.0,165.0);
		persona3.setnumeroDePersona(3);
		persona3.calcularLetraDni(2624486);
		
		persona3.imprimirPersona();
	
		
		
		
		
		
		
		

	}

}
