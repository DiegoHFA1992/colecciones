package arrays;

public class DeclararArrays {

	public static void main(String[] args) {
		//Declarar primer array(de enteros)
		//creamos la referencia
		int[] referenciaEnteros;
		//creamos el array
		referenciaEnteros = new int[3];
		//inicializamos los datos
		referenciaEnteros[0]=12;
		referenciaEnteros[1]=13;
		referenciaEnteros[2]=14;
		for (int i = 0; i < referenciaEnteros.length; i++) {
			System.out.println("valor "+i+": "+referenciaEnteros[i]);
		}
		//declaramos y creamos el array
		double[] referenciaDoubles= new double[3];
		//iniciamos los valores
		referenciaDoubles[0]=12.1;
		referenciaDoubles[1]=12.2;
		referenciaDoubles[2]=12.3;
		//recorremos el array
		for (int i = 0; i < referenciaDoubles.length; i++) {
			System.out.printf("valor %d: %.2f%n",i,referenciaDoubles[i]);
		}
		//declaramos, creamos e inicializamos el array
		String[] referenciaCadenas = {"hola", " ", "mundo"};
		//recorremos el array
		for (int i = 0; i < referenciaCadenas.length; i++) {
			System.out.print(referenciaCadenas[i]);
		}
		System.out.println();//salto de linea
		//creamos e inicializamos array de boolean
		boolean[] referenciasBoolean ={true,false,true,true};
		//recorremos el array de forma clasica
		for (int i = 0; i < referenciasBoolean.length; i++) {
			System.out.printf("%b ",referenciasBoolean[i]);
		}
		System.out.println();
		//recorremos arrays con bucle mejorado
		for(String cadena: referenciaCadenas){
			System.out.print(cadena);
		}
		System.out.println();
		for (boolean b : referenciasBoolean) {
			System.out.printf("%b ",b);
		}
			

	}
		
}
