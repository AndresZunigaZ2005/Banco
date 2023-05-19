package clase;
import javax.swing.JOptionPane;

public class Taller {

	public static void main(String[] args)
	{
		menu();
	}

//Pregunta 1
public static boolean isPalindromo (String cadena)
{
	int i=0;
	int longitud = cadena.length();
	boolean respuesta = true;
	while (i<longitud)
	{
		if(cadena.charAt(i)!=cadena.charAt(longitud-1))
		{
			respuesta = false;
		}
		i++;
		longitud--;
	}
	return respuesta;
	}

//Pregunta 2
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

public static boolean determinaMYDosperfectos(String placa)
{
	boolean unaM= false;
	boolean respuesta = false;
	int longitud = placa.length();
	int contador = 0;
	for (int i=0; i<longitud;i++)
	{
		if((placa.charAt(i)=='M' || placa.charAt(i)=='m') && i<3)
		{
			unaM= true; 
		}
		if(isPerfecto(placa.charAt(i)) && i>=3)
		{
			contador++;
		}
	}
	if(contador==2 && unaM)
	{
		respuesta = true;
	}
	return respuesta;
}

//Pregunta 3
public static boolean isDefectuoso(int numero)
{
	boolean respuesta = false;
	int sumatoria =0;
	for (int i=1; i<numero;i++)
	{
		if(numero%i == 0)
		{
			sumatoria+=i;
		}
	}
	if(numero<sumatoria)
	{
		respuesta = true;
	}
	return respuesta;
}


//Pregunta 4
public static String hallarMatriz1(int num)
{
	String cadena = "";
	for(int i=0;i<num;i++)
	{
		for(int j = 0; j<num; j++)
		{
			if(i==j)
			{
				cadena+=i+"   ";
			}
			if(i<j)
			{
				cadena+= "2"+"   ";
			}
			if(i>j)
			{
				cadena+=(int)Math.pow(i, j)+"   ";
			}
		}
		cadena+="\n";
	}
	return cadena;
}

//Pregunta 5
public static String hallarMatriz2(int num)
{
	String cadena = "";
	for(int i=0;i<num;i++)
	{
		for(int j = 0; j<num; j++)
		{
			if(i>j)
			{
				cadena+="1"+"   ";
			}
			if(i<j)
			{
				cadena+= "2"+"   ";
			}
			if(i==j)
			{
				if (i==0 && j==0)
				{
					cadena+="0"+"   ";
				}
				else
				{	
				cadena+=(int)Math.pow(i, j)+"   ";
				}
			}
		}
		cadena+="\n";
	}
	return cadena;
}

//Pregunta 6
public static String hallarVocalesAYO(String palabra1, String palabra2)
{
	String respuesta = "";
	int contador1 = 0;
	int contador2=0;
	int longitud1 = palabra1.length();
	int longitud2 = palabra2.length();
	for (int i = 0; i<longitud1; i++)
	{
		if (palabra1.charAt(i)=='A' || palabra1.charAt(i)=='a' || palabra1.charAt(i)=='O' || palabra1.charAt(i)=='o')
		{
			contador1++;
		}	
	}
	for (int j = 0; j<longitud2; j++)
	{
		if (palabra2.charAt(j)=='A' || palabra2.charAt(j)=='a' || palabra2.charAt(j)=='O' || palabra2.charAt(j)=='o')
		{
			contador2++;
		}
	}
	if (contador1>contador2)
	{
		respuesta= palabra1;
	}
	else
	{
		respuesta = palabra2;
	}
	return respuesta;
}

public static void menu()
{
	String msj="";
	boolean bandera = true;
	while (bandera)
	{
		msj="1. Escriba una palabra, para determinar si es palíndroma o no.(sin espacios)\n\n";

		msj+="2. Escriba una placa, para determinar si exíste alguna letra M  y por lo menos \n dos números perfectos en ella.\n\n"; 

		msj+="3. Escriba un número y determinar si es un número defectuoso o no.\n\n";

		msj+="4. Imprimir matriz tipo 1:\n\n";

		msj+="5. Imprimir matriz tipo 2:\n\n";

		msj+="6. Comparar dos palabras y determinar cual de las dos contiene más A's y O's\n\n";

		msj+="0. Terminar las preguntas.\n\n";
		int opcion = leerInt(msj+ "Ingrese el numeral de la pregunta que quiere resolver");
		if(opcion==1)
		{
			String palabra = leerString ("Ingrese una palabra para determinar si es palíndroma");
			String respuesta= "";
			boolean palindromo = isPalindromo (palabra);
			if (palindromo==true)
			{
				respuesta = " si";
			}
			else
			{
				respuesta = " no";
			}
			imprimir ("¿La palabra es palindroma?"+ respuesta);
		}
		else if (opcion==2) 
		{
			String respuesta ="";
			String placa= leerString("Ingrese una placa de un carro en Colombia");
			boolean eleccion = determinaMYDosperfectos(placa);
			if (eleccion)
			{
				respuesta= "La placa tiene al menos una M y dos número perfectos en sus dígitos";
			}
			else
			{
				respuesta = "La placa no tiene M o dos números perfectos";
			}
			imprimir (respuesta);
		}
		else if(opcion==3)
		{
			String palabra = "";
			int numero= leerInt("Ingrese un número para determinar si es defectuoso");
			boolean respuesta=isDefectuoso(numero);
			if(respuesta)
			{
				palabra = "El número "+numero+" es un número defectuoso";
			}
			else
			{
				palabra = "El número "+numero+" no es un número defectuoso";
			}
			imprimir (palabra);
		}
		else if (opcion==4)
		{
			int matrizCuadrada1= leerInt("Ingrese un número para una matriz cuadrada");
			String palabra = hallarMatriz1(matrizCuadrada1);
			imprimir (palabra);
		}
		else if(opcion==5)
		{
			int matrizCuadrada2= leerInt("Ingrese un número para una matriz cuadrada");
			String palabra = hallarMatriz2(matrizCuadrada2);
			imprimir (palabra);
		}
		else if(opcion==6)
		{
			String palabra1=leerString("Ingrese la palabra número 1");
			String palabra2=leerString("Ingrese la palabra número 2");
			String respuesta = hallarVocalesAYO(palabra1, palabra2);
			imprimir ("La palabra "+respuesta+" contiene más A's y más O's que la otra palabra");
		}
		else if (opcion==0)
		{
			bandera= false;
			imprimir ("Gracias por participar");
		}
		else 
		{
			imprimir("Opción incorrecta, ingrese otro número");
		}
	}
}
public static double leerDouble(String mensaje) 
{
	double dato = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
	return dato;
}

public static int leerInt(String mensaje) 
{
	int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
	return dato;
}


public static void imprimir(String cadena)
{
	JOptionPane.showMessageDialog(null, cadena);
}

public static String leerString(String mensaje)
{
	String dato= JOptionPane.showInputDialog(mensaje);
	return dato;
}
}