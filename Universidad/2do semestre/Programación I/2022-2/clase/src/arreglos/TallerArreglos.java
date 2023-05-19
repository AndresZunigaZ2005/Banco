package arreglos;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class TallerArreglos {

	public static void main(String[] args) 
	{
		int cantidad=leerEntero("Ingrese el tamaño del arreglo");
		int datos1[]=leerArregloInt("Ingrese un numero en el arreglo 1", cantidad);
		int datos2[]=leerArregloInt("Ingrese un numero en el arreglo 2", cantidad);
		int numeroDecimal= leerEntero("Ingrese un numero para transformarlo a hexadecimal");
		double promedioNumeroPrimos = promedioNumerosPrimosArreglo(datos1);
		double promedioNumerosPerfectos = promedioNumerosPerfectosArreglo(datos1);
		String numeroHexademial[]= TransformarDecimalAHexadecimal(numeroDecimal);
		String[] diferenciaArreglos= hallarDiferencia(datos1, datos2);
		String impDatos1 =imprimirArregloInt(datos1);
		String impDatos2 =imprimirArregloInt(datos2);
		String impDiferenciaArrelo =Arrays.toString(diferenciaArreglos);
		String impNumeroHexadecimal = Arrays.toString(numeroHexademial);
		imprimir("El promedio de numeros primos del arreglo es: "+promedioNumeroPrimos+
				"\nEl promedio de numeros perfectos en el arreglo es de "+promedioNumerosPerfectos+
				"\nLa diferencia entre "+impDatos1+"y "+impDatos2+"es de "+impDiferenciaArrelo+
				"\nEl número hexadecimal de "+numeroDecimal+" es: "+impNumeroHexadecimal);
	}

	//Promedio numeros primos
	public static double promedioNumerosPrimosArreglo(int arreglo[])
	{
		double promedio=0;
		int contador=0;
		for(int i=0; i<arreglo.length;i++)
		{
			if (isPrimo(arreglo[i]))
			{
				promedio+=arreglo[i];
				contador++;
			}
		}
		promedio=promedio/contador;
		return promedio;
	}
	
	//Metodo para hallar promedio numeros perfectos arreglo
	public static double promedioNumerosPerfectosArreglo(int arreglo[])
	{
		double promedio=0;
		int contador=0;
		for(int i=0; i<arreglo.length;i++)
		{
			if (isPerfecto(arreglo[i]))
			{
				promedio+=arreglo[i];
				contador++;
			}
		}
		promedio=promedio/contador;
		return promedio;
	}
	
	//Metodo para hallar la diferencia entre dos conjuntos
	public static String[] hallarDiferencia(int arr1[],int arr2[])
	{
		int contador=0;
		boolean diferencia=true;
		ArrayList <String> respuesta=new ArrayList<String>();
		for (int i=0; i<arr1.length; i++)
		{
			diferencia=true;
			for (int j=0; j<arr2.length; j++)
			{
				if (arr1[i]==arr2[j])
				{
					diferencia=false;
				}
			}
			if (diferencia)
			{
				String aux =arr1[i]+"";
				respuesta.add(contador, aux);
				contador++;
			}
			for (int j=0; j<arr1.length; j++)
			{
				if (arr2[i]==arr1[j])
				{
					diferencia=false;
				}
			}
			if (diferencia)
			{
				String aux =arr2[i]+"";
				respuesta.add(contador, aux);
				contador++;
			}
		}
		String[] respuestaFinal= new String [respuesta.size()];
		respuestaFinal = respuesta.toArray(respuestaFinal);
		return respuestaFinal;
	}
	
	//Pasar de decimal a hexadecimal
	public static String[] TransformarDecimalAHexadecimal (int num)
	{
		ArrayList<String>respuesta= new ArrayList<String>();
		int contador=0;
		for (int i =0; i<num; num=num/16)
		{
			String aux =num%16+"";
			if (Integer.parseInt(aux)==10)
			{
				aux="A";
			}
			if (Integer.parseInt(aux)==11)
			{
				aux="B";
			}
			if (Integer.parseInt(aux)==12)
			{
				aux="C";
			}
			if (Integer.parseInt(aux)==13)
			{
				aux="D";
			}
			if (Integer.parseInt(aux)==14)
			{
				aux="E";
			}
			if (Integer.parseInt(aux)==15)
			{
				aux="F";
			}
			respuesta.add(contador, aux);
			contador++;
		}
		String[] respuestaInvertida= new String[respuesta.size()];
		respuestaInvertida = respuesta.toArray(respuestaInvertida);
		respuestaInvertida = invertirArreglo(respuestaInvertida);
		return respuestaInvertida;
	}
	
	//Metodo para pedir arreglo
	public static int[] leerArregloInt ( String pregunta, int num ) 
	{ 
		int arreglo[]= new int [ num ]; 
		for ( int i = 0 ; i < num ; i++ ) 
		{
			arreglo [ i ] = leerEntero( pregunta + 	"( " + (i+1) + " de " + num + " )" ); 
		} 
		return arreglo; 
	}
	
	//Metodo para invertir cadena
	public static String[] invertirArreglo(String[] arreglo)
	{
		String[] respuesta = new String [arreglo.length];
		String aux;
		int tamArreglo= arreglo.length-1;
		for (int i=0; i<arreglo.length; i++)
		{
			aux = arreglo[tamArreglo];
			tamArreglo=tamArreglo-1;
			respuesta[i]=aux;
		}
		return respuesta;
	}
	//Metodo numero primo
	public static boolean isPrimo(int num)
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
	//Metodo para hallar numeros perfectos
	public static boolean isPerfecto (int num)
	{
		int sumatoria=0;
		boolean respuesta = false;
		for (int i =1; i<num; i++)
		{
			if(num%i==0)
			{
				sumatoria+=i;
			}
		}
		if (sumatoria==num)
		{
			respuesta = true;
		}
		return respuesta;
	}
	
	public static int leerEntero (String mensaje) 
	{
		int dato= Integer.parseInt(JOptionPane.showInputDialog(mensaje)); 
		return dato;
	}
	public static void imprimir (String mensaje) 
	{ 
		JOptionPane.showMessageDialog(null,mensaje); 
	}
	public static String imprimirArregloInt(int arreglo[])
	{
		String respuesta="[ ";
		for (int i=0; i<arreglo.length; i++)
		{
			respuesta+=arreglo[i]+", ";
		}
		respuesta+="]";
		return respuesta;
	}
}
