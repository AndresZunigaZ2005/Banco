package arrayList;

import java.util.ArrayList;

import java.util.Arrays;

import javax.swing.JOptionPane;
public class clase13Octubre 
{
	public static void main (String [] args)
	{
		/*1. Se puede retornar un ArrayList
		 *2. Un metodo puede recibir uno o más ArrayList
		 *3. Puede contener diferentes tipos de dato (<Object>) 
		 *4. Puede asignar un tamaño 
		  5. Operaciones */
		ArrayList<String> arreglo = new ArrayList<String>();
		arreglo.add("Hola");
		arreglo.add(", bien o no Kliche?");
		arreglo.add(" Hola ");
		for (int i=0; i<arreglo.size();i++)
		{
			System.out.print(arreglo.get(i));
		}
		/*int tamanio = 2;
		String placas[] = leerArregloString("Ingrese la placa del vehículo", tamanio);
		String placasOrdenadas[] = ordenarDigitosPlacas(placas);
		System.out.print(Arrays.toString(placasOrdenadas));*/
		
		String numero = "7308";
		int menor = hallarNumeroMenorString(numero);
		System.out.print(menor);
		String placas [] = {"RNP059", "TCE380", "EBP020"};
		placas = ordenarDigitosPlacas(placas);
		System.out.print(Arrays.toString(placas));
	}
	//PLACAS
	//1. Ordenar de menor a mayor según los números de las placas
	public static String[] ordenarDigitosPlacas (String placas[])
	{
		int aux2 = 0;
		int k=0;
		String aux3 = "";
		int arregloDigitos[] = new int[placas.length];
		arregloDigitos = sacarDigitosPlaca(placas);
		for (int i = 0; i<arregloDigitos.length-1; i++)
		{
			int menor = arregloDigitos[i];
			for (int j = i+1; j<arregloDigitos.length; j++)
			{
				int numSiguiente = arregloDigitos[j];
				k = i;
				if (numSiguiente < menor)
				{
					menor = numSiguiente;
					k=j;
				}
			}
			aux2 = arregloDigitos[k];
			aux3 = placas[k];
			arregloDigitos[k] = arregloDigitos[i];
			arregloDigitos[i] = aux2;
			placas[k] = placas[i];
			placas[i] = aux3;
		}
		return placas;
	}
	
	/*2. modificar el número de la placa
	 * Hallar el menor valor de los números
	 cambiar las posiciones impares al número menor*/
	public static String[] ponerImparesDigitoMenor (String placas[])
	{
		String respuesta[] = new String[placas.length];
		int numMenor=0;
		String aux2 = "";
		for (int i = 0; i<placas.length; i++)
		{
			String aux = placas[i].substring(3);
			numMenor = hallarNumeroMenorString(aux);
			for (int j = 0; j<placas[i].length(); j++)
			{
				aux2 = placas[i];
				if(!isPar(j))
				{
					aux2 = aux2.replace(aux.charAt(j), (char) numMenor);
				}
			}
			respuesta[i] = aux2;
		}
		return respuesta;
	}
	
	public static int[] sacarDigitosPlaca(String placas[])
	{
		int arregloDigitos [] = new int [placas.length];
		for (int i = 0; i<placas.length; i++)
		{
			arregloDigitos[i] = Integer.parseInt(placas[i].substring(3));
		}
		return arregloDigitos;
	}
	
	public static boolean isPar(int num)
	{
		boolean respuesta = false;
		if(( num%2 )== 0)
		{
			respuesta = true;
		}
		return respuesta;
	}
	
	public static int hallarNumeroMenorString(String num)
	{
		int menor=Integer.parseInt(num.charAt(0)+"");
		int numSiguiente=0;
		for(int j=1; j<num.length(); j++)
		{
			numSiguiente = Integer.parseInt(num.charAt(j)+"");
			if(numSiguiente < menor)
			{
				menor = numSiguiente;
			}
		}
		return menor;
	}
	
	public static int[] ordenarBurbuja( int arreglo[] ) 
	{ 
		int temp;
		for( int j = 1 ; j < arreglo.length ; j++) 
		{
			for( int i = 0 ; i<arreglo.length-1 ; i++) 
			{
				if ( arreglo[ i ] > arreglo[i+1] ) 
				{
					temp = arreglo[ i ]; 
					arreglo[i] = arreglo[i + 1]; 
					arreglo[i+1] = temp;
				} 
			}
		}
		return arreglo;
	}  
	
	public static String[] leerArregloString (String pregunta, int num)
	{
		String arreglo[] = new String[num];
		for ( int i =0; i<num; i++)
		{
			arreglo [i] = leerString (pregunta +"( " + (i+1) + " de " + num + " )" );
		}
		return arreglo;
	}
	
	public static String leerString(String mensaje)
	{
		String dato= JOptionPane.showInputDialog(mensaje);
		return dato;
	}
	
	public static void imprimir(String cadena)
	{
		JOptionPane.showMessageDialog(null, cadena);
	}
}
