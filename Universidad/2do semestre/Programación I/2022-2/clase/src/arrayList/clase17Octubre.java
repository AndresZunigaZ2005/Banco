package arrayList;

import java.util.ArrayList;

public class clase17Octubre 
{
	public static void main (String [] args){
		
		
	}
	//Pregunta 1
	public static double hallarPromedio (int arreglo[], int n)
	{
	double promedio=0;
	int contadorPrimos=0;
	for (int i = 0; i<arreglo.length; i++)
	{
		if(isPrimo(arreglo[i]) && arreglo[i]>i)
		{
			promedio = arreglo[i];
			contadorPrimos++;
		}
	}
	promedio /= contadorPrimos;
	return promedio;
	}
	
	public static boolean isPrimo (int n)
	{
	boolean aux = true;
	for (int i = 0; i<n; i++)
	{
		if ((n % i)==0)
		{
			aux = true;
		}
	}
	return aux;
	}

	//Pregunta 2
	public static String[] eliminarPerfectos(int arreglo[])
	{
	ArrayList <Integer> auxArreglo = new ArrayList<Integer>();
	for (int i = 0; i<arreglo.length; i++)
	{
		if(isPerfecto(arreglo[i]))
		{
			auxArreglo.add(arreglo[i]);
		}
	}
	String respuesta[] = new String[auxArreglo.size()];
	respuesta = auxArreglo.toArray(respuesta);
	return respuesta;
	}
	
	public static boolean isPerfecto (int n)
	{
	int suma = 0;
	boolean respuesta = false;
	for (int i = 1; i<n; i++)
	{
		if (n%i==0)
		{
			suma+=i;
		}
	}
	if(n==suma)
	{
		respuesta=true;
	}
	return respuesta;
	}

	//pregunta 3
	
	//Pregunta 4
	public static String hallarHexadecimal (int num)
	{
		String respuesta="";
		for (int i = 0; i<num; num=num/16)
		{
			int aux = num%16;
			if(aux==10)
			{
				respuesta+='A';
			}
			else if(aux==11)
			{
				respuesta+='B';
			}
			else if(aux==12)
			{
				respuesta+='C';
			}
			else if(aux==13)
			{
				respuesta+='D';
			}
			else if(aux==14)
			{
				respuesta+='E';
			}
			else if(aux==15)
			{
				respuesta+='F';
			}
			else
			{
				respuesta+=""+aux;
			}
		}
		respuesta = invertirCadena(respuesta);
		return respuesta;
	}
	
	public static String invertirCadena(String cadena)
	{
		String respuesta="";
		for(int i = cadena.length()-1; i>=0; i-=1)
		{
			respuesta += cadena.charAt(i)+"";
		}
		return respuesta;
	}
	
	//Pregunta 5
	
	//Pregunta 6
	public static boolean verificarContenecia (int arregloA[], int arregloB[])
	{
		boolean respuesta=true;
		for (int i = 0; i<arregloB.length; i++)
		{
			boolean aux=true;
			for (int j = 0; j<arregloA.length; j++)
			{
				if (arregloA[j] == arregloB[i])
				{
					aux=false;
				}
			}
			if (aux)
			{
				respuesta=false;
			}
		}
		return respuesta;
	}
	
	//Pregunta 7
	public static void ordenarArreglo (int arreglo[])
	{
		int aux;
		for (int i = 1; i<arreglo.length; i++)
		{
			for (int j = 0; j<arreglo.length;j++)
			{
				if ( arreglo[ i ] > arreglo[i+1] ) 
				{
					aux = arreglo[ i ]; 
					arreglo[i] = arreglo[i + 1]; 
					arreglo[i+1] = aux;
				} 
			}
		}
	}
	
	//Pregunta 8
	public static void ordenarArreglo2(String arreglo[])
	{
		
	}
}
