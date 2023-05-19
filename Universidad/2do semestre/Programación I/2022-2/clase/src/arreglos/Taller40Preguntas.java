package arreglos;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Taller40Preguntas 
{
	public static void main(String [] args){
		
	}
	
	public static void imprimir(String cadena)
	{
		JOptionPane.showMessageDialog(null, cadena);
	}
	
	public static void imprimirArregloInt(int arreglo[])
	{
		String respuesta = Arrays.toString(arreglo);
		imprimir(respuesta);
	}
	
	public static String leerString(String mensaje)
	{
		String dato= JOptionPane.showInputDialog(mensaje);
		return dato;
	}
	
	public static int leerInt(String mensaje) 
	{
		int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return dato;
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
	
	//Pregunta 10
	public static String[] eliminarPalabras(String arreglo[])
	{
		ArrayList <String> auxRespuesta = new ArrayList <String>();
		for (int i = 0; i<arreglo.length; i++)
		{
			if(!verificarPalabra(arreglo[i]))
			{
				auxRespuesta.add(arreglo[i]);
			}
		}
		String respuesta[] = new String[auxRespuesta.size()];
		respuesta = auxRespuesta.toArray(respuesta);
		return respuesta;
	}
	
	public static boolean verificarPalabra (String palabra)
	{
		boolean respuesta=false;
		if ((!isVocal(palabra.charAt(0))) && (!isVocal(palabra.charAt(palabra.length()-1))) 
				&& (!isVocal(palabra.charAt(palabra.length()/2))))
		{
			respuesta = true;
		}
		return respuesta;
	}
	
	public static boolean isVocal(char letra)
	{
		boolean respuesta=false;
		if(letra=='a' || letra=='A' || letra=='e' || letra=='E' || letra=='i' || letra=='I' ||
				letra=='o' || letra=='O' || letra=='u' || letra=='U')
		{
			respuesta = true;
		}
		return respuesta;
	}
	
	//Pregunta 12
	public static String[] devolverPosiciones(String arreglo[], String palabra)
	{
		ArrayList <String> auxRespuesta = new ArrayList <String>();
		for (int i = 0; i<arreglo.length; i++)
		{
			String palabraReversa = invertirCadena(palabra);
			if (palabra==arreglo[i] || palabraReversa==arreglo[i])
			{
				auxRespuesta.add(i+"");
			}
		}
		String respuesta[] = new String[auxRespuesta.size()];
		respuesta = auxRespuesta.toArray(respuesta);
		return respuesta;
	}
	
	//Pregunta 13
	public static String[] suprimir (String arreglo[])
	{
		String respuesta[] = new String [arreglo.length];
		for (int i = 0; i<arreglo.length; i++)
		{
			respuesta[i] = suprimirConsonantes(arreglo[i]);
		}
		return respuesta;
	}
	public static String suprimirConsonantes (String palabra)
	{
		String respuesta="";
		for (int i = 0; i<palabra.length(); i++)
		{
			if(isVocal(palabra.charAt(i)))
			{
				respuesta+=palabra.charAt(i)+"";
			}
		}
		return respuesta;
	}
	
	//Pregunta 14
	public static String modicificarVocalesYConsonantes(String palabra)
	{
		String vocales = ""; 
		String consonantes = "";
		String respuesta = "";
		for(int i = 0; i<palabra.length(); i++)
		{
			if (isVocal(palabra.charAt(i)))
			{
				vocales += palabra.charAt(i)+"";
			}
			else {
				consonantes += palabra.charAt(i)+"";
			}
		}
		respuesta = vocales + consonantes;
		return respuesta;
	}
	
	//Pregunta 16
	public static int[] unirVectoresIntercaladosArreglos5Numeros(int arreglo1[], int arreglo2[])
	{
		int respuesta[] = new int [9];
		for (int i = 0; i<5; i++)
		{
			respuesta[i] = arreglo1[i];
			respuesta[i+1] = arreglo2[i];
		}
		return respuesta;
	}
	
	//Pregunta 17
	public static int[] unirVectoresMenorAMayorArreglo10Numeros (int arreglo1[], int arreglo2[])
	{
		int respuesta[] = new int [19];
		for (int i = 0; i<20; i++)
		{
			respuesta[i] = arreglo1[i];
			respuesta[i+1] = arreglo2[i];
		}
		respuesta = ordenarBurbujaEntero(respuesta);
		return respuesta;
	}
	
	public static int[] ordenarBurbujaEntero( int arreglo[] ) 
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
	
	//Pregunta 18
	public static String verificarFormaOrdenar(int arreglo[])
	{
		String respuesta="Desordenado";
		for (int i = 0; i<arreglo.length-1; i++)
		{
			if(arreglo[i]<arreglo[i+1]){			
			}
			
			else{
				respuesta = "Desordenado";
				break;
			}
			respuesta = "Ordenado ascendentemente";
		}
		if (respuesta!="Ordenado ascendentemente")
		{
			for (int j = 0; j<arreglo.length-1; j++)
			{
				if(arreglo[j]>arreglo[j+1]){			
				}
			
				else{
					respuesta = "Desordenado";
					break;
				}
				respuesta = "Ordenado Descendentemente";
			}
		}
		return respuesta;
	}
	
	//Pregunta 19
	public static int[] ingresarNumerosOrdenarlos()
	{
		ArrayList<Integer>auxRespuesta = new ArrayList<Integer>();
		for(int i = 0; i<10; i++)
		{
			int numero = leerInt("Ingrese un número");
			auxRespuesta.add(0,numero);
			for (int j = 1; j<auxRespuesta.size(); j++)
			{
				if(numero>auxRespuesta.get(j))
				{
					int aux = auxRespuesta.get(j);
					auxRespuesta.set(j, numero);
					auxRespuesta.set(j-1, aux);
				}
			}
		}
		int respuesta[] = new int [auxRespuesta.size()];
		for(int k = 0; k<10; k++)
		{
			respuesta[k] = auxRespuesta.get(k);
		}
		return respuesta;
	}
	
	//Pregunta 21
	public static int[] ordenarVectorUsuario()
	{
		int respuesta[] = new int [19];
		for (int i = 0; i<20; i++)
		{
			int posicion = leerInt("Ingrese la posición en la que desea agregrar un número (máxima posición: 20)");
			ArrayList <Integer> arregloPosiciones = new ArrayList <Integer>();
			arregloPosiciones.add(posicion);
				if(verificarNumerosDiferentesPosiciones(posicion, arregloPosiciones))
				{
				int numero = leerInt("Ingrese el número que desea ingresar en la posición"+i);
				respuesta[posicion-1] = numero;
				}
				else {
					i--;
					arregloPosiciones.remove(i);
					imprimir("Posición repetida, Ingrese otra posición");
				}
		}
		return respuesta;
	}
	
	public static boolean verificarNumerosDiferentesPosiciones(int posicion, ArrayList <Integer> 
	arregloPosiciones)
	{
		boolean respuesta=true;
		for (int i = 0; i<arregloPosiciones.size(); i++)
		{
			if(posicion==arregloPosiciones.get(i))
			{
				respuesta=false;
			}
		}
		return respuesta;
	}
	
	//Pregunta 22
	public String[] ganaronTodas(String[] estudiantes, String[] calculo, 
			String[] algebraLineal, String[] programacion, String[] electronica) 
	{
		ArrayList <String> estudiantesGanadores = new ArrayList <String>();
		for (int i = 0; i<estudiantes.length; i++)
		{
			int contador=0;
			contador+=contarElementosRepetidosArreglo(estudiantes[i], calculo);
			contador+=contarElementosRepetidosArreglo(estudiantes[i], algebraLineal);
			contador+=contarElementosRepetidosArreglo(estudiantes[i], programacion);
			contador+=contarElementosRepetidosArreglo(estudiantes[i], electronica);
			if(contador==0)
			{
				estudiantesGanadores.add(estudiantes[i]);
			}
		}
		String respuesta[] = new String[estudiantesGanadores.size()];
		respuesta = estudiantesGanadores.toArray(respuesta);
		return respuesta;
	}
	
	public String[] perdieronUna(String[] estudiantes, String[] calculo,
			String[] algebraLineal, String[] programacion, String[] electronica) 
	{
		ArrayList <String> estudiantesUnaAsignatura = new ArrayList <String>();
		for (int i = 0; i<estudiantes.length; i++)
		{
			int contador=0;
			contador+=contarElementosRepetidosArreglo(estudiantes[i], calculo);
			contador+=contarElementosRepetidosArreglo(estudiantes[i], algebraLineal);
			contador+=contarElementosRepetidosArreglo(estudiantes[i], programacion);
			contador+=contarElementosRepetidosArreglo(estudiantes[i], electronica);
			if(contador==1)
			{
				estudiantesUnaAsignatura.add(estudiantes[i]);
			}
		}
		String respuesta[] = new String[estudiantesUnaAsignatura.size()];
		respuesta = estudiantesUnaAsignatura.toArray(respuesta);
		return respuesta;
	}
	
	public String[] perdieronDos(String[] estudiantes, String[] calculo,
			String[] algebraLineal, String[] programacion, String[] electronica) 
	{
		ArrayList <String> estudiantesDosAsignatura = new ArrayList <String>();
		for (int i = 0; i<estudiantes.length; i++)
		{
			int contador=0;
			contador+=contarElementosRepetidosArreglo(estudiantes[i], calculo);
			contador+=contarElementosRepetidosArreglo(estudiantes[i], algebraLineal);
			contador+=contarElementosRepetidosArreglo(estudiantes[i], programacion);
			contador+=contarElementosRepetidosArreglo(estudiantes[i], electronica);
			if(contador==2)
			{
				estudiantesDosAsignatura.add(estudiantes[i]);
			}
		}
		String respuesta[] = new String[estudiantesDosAsignatura.size()];
		respuesta = estudiantesDosAsignatura.toArray(respuesta);
		return respuesta;
	}
	
	public String[] perdieronTres(String[] estudiantes, String[] calculo,
			String[] algebraLineal, String[] programacion, String[] electronica) 
	{
		ArrayList <String> estudiantesTresAsignatura = new ArrayList <String>();
		for (int i = 0; i<estudiantes.length; i++)
		{
			int contador=0;
			contador+=contarElementosRepetidosArreglo(estudiantes[i], calculo);
			contador+=contarElementosRepetidosArreglo(estudiantes[i], algebraLineal);
			contador+=contarElementosRepetidosArreglo(estudiantes[i], programacion);
			contador+=contarElementosRepetidosArreglo(estudiantes[i], electronica);
			if(contador==3)
			{
				estudiantesTresAsignatura.add(estudiantes[i]);
			}
		}
		String respuesta[] = new String[estudiantesTresAsignatura.size()];
		respuesta = estudiantesTresAsignatura.toArray(respuesta);
		return respuesta;
	}
		
	public static int contarElementosRepetidosArreglo(String nombre, String arreglo[])
	{
		int respuesta = 0;
		for(int i = 0; i< arreglo.length; i++)
		{
			if (nombre==arreglo[i])
			{
				respuesta++;
			}
		}
		return respuesta;
	}
	
	//Pregunta 23
	public static int contarPalabrasUnicas (String arreglo[])
	{
		int respuesta = 0;
		for (int i = 0; i<arreglo.length; i++)
		{
			int contador=0;
			for (int j = 0; j<arreglo.length;j++)
			{
				if(arreglo[i]==arreglo[j])
				{
					contador++;
				}
			}
			if(contador==1)
			{
				respuesta++;
			}
		}
		return respuesta;
	}
	
	public static String [] ponerPalabrasRepetidasYCantidad(String arreglo[])
	{
		ArrayList <String> auxRespuesta = new ArrayList<String>();
		for (int i = 0; i<arreglo.length; i++)
		{
			int contador=0;
			for (int j = 0; j<arreglo.length;j++)
			{
				if(arreglo[i]==arreglo[j])
				{
					contador++;
				}
			}
			if(contador>1)
			{
				auxRespuesta.add(arreglo[i]+" "+contador);
			}
		}
		String respuesta[] = new String[auxRespuesta.size()];
		respuesta = auxRespuesta.toArray(respuesta);
		return respuesta;
	}
	
	//Pregunta 24
	public static String[] llenarDiccionarioALfabeticamente()
	{
		ArrayList <String>auxRespuesta = new ArrayList<String>();
		for (int i = 0; i<49; i++)
		{
			String palabra = leerString("Ingrese una palabra al diccionario");
			auxRespuesta.add(palabra);
			for (int j = auxRespuesta.size()-1; j<=0; j--)
			{
				String palabraMenor = hallarPalabraAlfabeto(palabra, auxRespuesta.get(j-1));
				if(palabraMenor==palabra)
				{
					String aux= auxRespuesta.get(j-1);
					auxRespuesta.set(j-1, palabraMenor);
					auxRespuesta.set(j, aux);
				}
				else {
					break;
				}
			}
		}
		String respuesta[] = new String [auxRespuesta.size()];
		respuesta = auxRespuesta.toArray(respuesta);
		return respuesta;
	}
	public static int hallarPalabraMasGrande(String palabra1, String palabra2)
	{
		int respuesta=0;
		int tam1=palabra1.length();
		int tam2=palabra2.length();
		if(tam1>=tam2)
		{
			respuesta=tam1;
		}
		else {
			respuesta=tam2;
		}
		return respuesta;
	}
	public static String hallarPalabraAlfabeto(String palabra1, String palabra2)
	{
		String respuesta = "";
		int tamMayor=hallarPalabraMasGrande(palabra1, palabra2);
		for(int i = 0; i<tamMayor; i++)
		{
			if(palabra1.charAt(i) < palabra2.charAt(i))
			{
				respuesta=palabra1;
				break;
			}
			else if(palabra2.charAt(i) < palabra1.charAt(i))
			{
				respuesta=palabra2;
				break;
			}
		}
		return respuesta;
	}
	
	//Pregunta 26
	public static int hacerMultiplicacionRusa(int num1, int num2)
	{
		int aux1[] = hacerArregloMultiplicacionRusa(num1);
		int aux2[] = new int [aux1.length];
		for (int i = 0; i<aux1.length; i++)
		{
			if(isPar(aux1[i]))
			{
				aux2[i] = num2*2;
			}
			else {
				aux2[i] = 0;
			}
		}
		int respuesta = sumarElementosArreglo(aux2);
		return respuesta;
	}
	public static boolean isPar (int num)
	{
		boolean respuesta=false;
		if((num%2)==0)
		{
			respuesta=true;
		}
		return respuesta;
	}
	public static int [] cambiarArrayListToArray(ArrayList<Integer> lista)
	{
		int respuesta[] = new int [lista.size()];
		for(int i = 0; i<respuesta.length; i++)
		{
			respuesta[i] = lista.get(i);
		}
		return respuesta;
	}
	public static int[] hacerArregloMultiplicacionRusa(int num)
	{
		ArrayList <Integer> auxRespuesta = new ArrayList <Integer>();
		for(int i = num; i>0; i+=0)
		{
			int aux = num/2;
			auxRespuesta.add(aux);
		}
		int respuesta[] = cambiarArrayListToArray(auxRespuesta);
		return respuesta;
	}
	public static int sumarElementosArreglo(int arreglo[])
	{
		int contador = 0;
		for (int i = 0; i<arreglo.length; i++)
		{
			contador+=arreglo[i];
		}
		return contador;
	}
	
	//Pregunta 28
	public static int[] sumarUnoVectoBinario (int vectorBinario[])
	{
		int num = pasarBinarioToDecimal(vectorBinario);
		num+=1;
		int respuesta[] = pasarDecimalToBinario(num);
		return respuesta;
	}
	public static int pasarBinarioToDecimal (int numeroBinario[])
	{
		int respuesta=0;
		for (int i = numeroBinario.length-1; i>=0; i--)
		{
			respuesta+=Math.pow(numeroBinario[i], i);
		}
		return respuesta;
	}
	
	public static int[] pasarDecimalToBinario(int num)
	{
		ArrayList<Integer> auxRespuesta= new ArrayList<Integer>();
		for (int i = num; i>1; i/=2)
		{
			int aux = i%2;
			auxRespuesta.add(0, aux);
		}
		int respuesta[] = cambiarArrayListToArray(auxRespuesta);
		return respuesta;
	}
	
	//Pregunta 29
	public static int[] rellenarArregloAleatorio(int tam, int rango)
	{
		int respuesta[] = new int[tam];
		for (int i = 0; i<tam; i++)
		{
			respuesta[i] = (int)(Math.random()*rango)+1;
		}
		return respuesta;
	}
	public static int[] determinarInicio(int arreglo[], int numInicio)
	{
		ArrayList<Integer> auxRespuesta= new ArrayList<Integer>();
		for(int i = 0; i<arreglo.length; i++)
		{
			String numero= String.valueOf(arreglo[i]);
			if (numero.charAt(0) == numInicio)
			{
				auxRespuesta.add(arreglo[i]);
			}
		}
		int respuesta[] = cambiarArrayListToArray(auxRespuesta);
		return respuesta;
	}
	//Pregunta 30
	public static void imprimirArregloElevadoOriginal(int arreglo[])
	{
		int arregloElevado [] = new int [arreglo.length];
		for(int i = 0; i<arreglo.length; i++)
		{
			arregloElevado[i] = (int)Math.pow(arreglo[i], i);
		}
		imprimirArregloInt(arreglo);
		imprimirArregloInt(arregloElevado);
	}
	//Pregunta 31
	public static int sumarPosicionesArreglo(int arreglo[])
	{
		int respuesta=0;
		if(arreglo[0]<arreglo.length && arreglo[arreglo.length-1]<arreglo.length)
		{
			if(arreglo[0] <= arreglo[arreglo.length-1])
			{
				for(int i = 0; i<arreglo.length;i++)
				{
					respuesta+=arreglo[i];
				}
			}
		}
		return respuesta;
	}
	//Pregunta 32
	public static int hallarMenorArreglo(int arreglo[])
	{
		int menor= arreglo[0];
		for (int i = 1; i<arreglo.length; i++)
		{
			if(arreglo[i] < menor)
			{
				menor = arreglo[i];
			}
		}
		return menor;
	}
	
	public static int hallarMayorArreglo(int arreglo[])
	{
		int mayor= arreglo[0];
		for (int i = 1; i<arreglo.length; i++)
		{
			if(arreglo[i] > mayor)
			{
				mayor = arreglo[i];
			}
		}
		return mayor;
	}
	
	//Pregunta 33
	public static int hallarRepeticionesNumeroArreglo(int arreglo[], int numero)
	{
		int contador=0;
		for (int i = 0; i<arreglo.length; i++)
		{
			if(arreglo[i]==numero)
			{
				contador++;
			}
		}
		return contador;
	}
	//Pregunta 34
	public static int[] eliminarRepetidos(int arreglo[])
	{
		ArrayList<Integer> auxRespuesta = new ArrayList<Integer>();
		for (int i = 0; i<arreglo.length; i++)
		{
			boolean centinela = true;
			for (int j=i+1; j<arreglo.length; j++)
			{
				if(arreglo[i]==arreglo[j])
				{
					centinela=false;
				}
			}
			if (centinela)
			{
				auxRespuesta.add(arreglo[i]);
			}
		}
		int respuesta[] = cambiarArrayListToArray(auxRespuesta);
		return respuesta;
	}
	
	//Pregunta 35
	public static String[] sumarASCII(String palabra1, String palabra2)
	{
		String mayor=hallarPalabraMasGrande1(palabra1, palabra2);
		String menor=hallarPalabraMasPequeña(palabra1, palabra2);
		menor= rellenarPalabraMasPequenia(palabra1, palabra2);
		String aux[] = new String [menor.length()];
		for(int i=0; i<menor.length(); i++)
		{
			int num1=mayor.charAt(i);
			int num2=menor.charAt(i);
			int resultado=num1+num2;
			aux[i] = (char)resultado+"";
		}
		return aux;
	}
	public static String rellenarPalabraMasPequenia(String palabra1, String palabra2)
	{
		for(int i = 0; i<palabra2.length()-palabra1.length(); i++)
		{
			palabra1+=palabra1.charAt(i)+"";
		}
		return palabra1;
	}
	
	public static String hallarPalabraMasGrande1(String palabra1, String palabra2)
	{
		String respuesta="";
		if(palabra1.length()<palabra2.length())
		{
			respuesta=palabra1;
		}
		else {
			respuesta=palabra2;
		}
		return respuesta;
	}
	
	public static String hallarPalabraMasPequeña(String palabra1, String palabra2)
	{
		String respuesta="";
		if(palabra1.length()>palabra2.length())
		{
			respuesta=palabra1;
		}
		else {
			respuesta=palabra2;
		}
		return respuesta;
	}
}
