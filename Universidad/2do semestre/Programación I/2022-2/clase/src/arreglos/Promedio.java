package arreglos;

import javax.swing.JOptionPane; 
public class  Promedio 
{ 
	public static void main( String[] args ) 
	{ 
		int    cantidad;
		double datos[]; 
		double promedio; 
		int resultado;
		String posicionesMayor3, noPrimos; 
		String arregloInvertido="";

		cantidad = leerEntero ( "Ingrese la cantidad de elementos" );

		datos   = leerArregloDouble ( "Ingrese un número", cantidad ); 

		promedio = calcularPromedio ( datos ); 

		resultado = obtenerCantidadExcedePromedio(datos); 
		
		posicionesMayor3=mostrarPosicionesMayor3(datos);
		
		noPrimos=mostrarNoPrimos(datos);
		
		arregloInvertido=mostrarArregloInvertido(datos);
		
		imprimir( "El promedio es: " + promedio + 
				"\nLa cantidad de elementos que exceden el promedio es:  "+resultado+
				"\nEn las posiciones "+ posicionesMayor3+"los numeros son mayores a 3"+
				"\nLos numeros "+ noPrimos+"no son primos"+
				"\nEl arreglo invertido es igual a "+arregloInvertido); 
	} 


	/**
	 * Permite leer un numero entero mediante una caja de dialogo 
	 * @param mensaje El mensaje que verá el usuario 
	 * @return el numero ingresado por el usuario 
	 */
	public static int leerEntero (String mensaje) 
	{
		int dato= Integer.parseInt(JOptionPane.showInputDialog(mensaje)); 
		return dato;
	}

	/**
	 * Método para leer varios numeros  y retornarlos en un arreglo 
	 * @param pregunta Texto que se muestra al usuario 
	 * @param num Cantidad de elementos a leer
	 * @return Arreglo con la informacion ingresada por el usuario 
	 */
	public static double[] leerArregloDouble ( String pregunta, int num ) 
	{ 
		double arreglo[]= new double [ num ]; 
		for ( int i = 0 ; i < num ; i++ ) 
		{
			arreglo [ i ] = leerDouble( pregunta + 	"( " + (i+1) + " de " + num + " )" ); 
		} 
		return arreglo; 
	}

	/**
	 * Permite leer un numero double mediante una caja de dialogo 
	 * @param mensaje El mensaje que verá el usuario 
	 * @return el numero ingresado por el usuario 
	 */
	public static double leerDouble (String mensaje) 
	{
		double dato= Double.parseDouble(JOptionPane.showInputDialog(mensaje)); 
		return dato;
	}

	/**
	 * Método que calcula el  promedio de un arreglo 
	 * @param arreglo   Arreglo de números 
	 * @return El promedio de los números contenidos en el arreglo 
	 */
	public static double calcularPromedio ( double arreglo[] ) 
	{ 
		double promedio; 
		promedio = 0; 
		for ( int i = 0 ; i < arreglo.length ; i++ ) 
		{ 
			promedio = promedio + arreglo [ i ]; 
		} 
		promedio = promedio/ arreglo.length ; 
		return promedio;
	}  

	/**
	 * Método que obtiene la cantidad de elementos que excenden el promedio 
	 * @param arreglo   Arreglo de números 
	 * @return La cantidad de elementos que exceden el promedio 
	 */
	public static int obtenerCantidadExcedePromedio(double datos[]) 
	{ 
		int contador; 
		contador = 0; 
		double promedio= calcularPromedio ( datos ); 
		for ( int i = 0 ; i < datos.length ; i++ ) 
		{ 
			if(datos[i]>promedio)
			{ 
				contador++; 
			} 
		} 
		return contador; 
	} 
	
	public static String mostrarPosicionesMayor3(double arreglo[])
	{
		String respuesta="";
		
		for(int i=0; i<arreglo.length; i++)
		{
			if(arreglo[ i ]>3)
			{
				respuesta+= i+1+"  ";
			}
		}
		return respuesta;
	}
	
	public static boolean isPrimo(double num)
	{
		boolean centinela=true;
		for (int i=2; i<num;i++)
		{
			if(num%i==0)
			{
				centinela=false;
			}
		}
		return centinela;
	}
	
	public static String mostrarNoPrimos(double arreglo[])
	{
		String respuesta="";
		for (int i=0; i<arreglo.length; i++)
		{
			if(!(isPrimo(arreglo[i])))
			{
				respuesta+=(int)arreglo[i]+"  ";
			}
		}
		return respuesta;
	}
	
	public static String mostrarArregloInvertido(double arreglo[])
	{
		String respuesta="";
		for (int i=arreglo.length-1; i>=0; i--)
		{
			respuesta+=(int)arreglo[i]+"  ";
		}
		return respuesta;
	}

	/**
	 * Permite imprimir un mensaje
	 * @param mensaje El mensaje a imprimir 
	 */
	public static void imprimir (String mensaje) 
	{ 
		JOptionPane.showMessageDialog(null,mensaje); 
	}
}
