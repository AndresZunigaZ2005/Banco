
package arreglos;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class EjerciciosArreglosOctubre {

	public static void main(String[] args) 
	{
		int opcion;
		int tamano = leerInt("Ingrese la cantidad de empleados");
		do 
		{	
			opcion = leerInt ( "--- Menú Principal ---\n\n" 
								+ "1: Primera pregunta\n"
								+ "2: Segunda pregunta\n"
								+ "3: Tercera pregunta\n"
								+ "4: Cuarta pregunta\n"
								+ "5: Quinta pregunta\n"
								+ "6: Sexta pregunta\n"
								+ "7: Septima pregunta\n"
								+ "8: Octava pregunta\n"
								+ "9: Salir");
			switch (opcion) 
			{
				case 1: pregunta1(tamano);
						break;
				case 2: pregunta2(tamano);
						break;
				case 3: pregunta3(tamano);
						break;
				case 4: pregunta4(tamano);
						break;
				case 5: pregunta5(tamano);
						break;
				case 6: pregunta6(tamano);
						break;
				case 7: pregunta7(tamano);
						break;
				case 8: pregunta8(tamano);
						break;
				case 9: imprimir("Ha salido del sistema");
						break;
				default: imprimir("Opción Inválida");
					break;
			}
		}
		while(opcion!=9);
		System.exit(0);
	}
	
	public static void pregunta1 (int tamano)
	{
		String DNI[] = new String [tamano];
		double salario[] = new double [tamano];
		int estrato [] = new int [tamano];
		for (int i=0; i<tamano; i++)
		{
			DNI[i] = leerString("Ingrese la identificación del empleado " +(1+i));
			salario[i] = leerDouble("Ingrese el salario del empleado "+(1+i));
			estrato[i] = leerInt("Ingrese el estrato del empleado "+(1+i));
		}
		double respuesta = hallarPromedio(DNI, salario, estrato);
		imprimir ("El promedio del salario de empleado de estrato mayor a cuatro"
				+ " y con identificación con al menos dos números pares" +respuesta);
	}
	
	public static void pregunta2(int tamano)
	{
		String DNI[] = new String [tamano];
		double salario[] = new double [tamano];
		for (int i=0; i<tamano; i++)
		{
			DNI[i] = leerString("Ingrese la identificación del empleado " +(1+i));
			salario[i] = leerDouble("Ingrese el salario del empleado "+(1+i));
		}
		String respuesta = hallarSalarioMenor(salario, DNI);
		imprimir ("La identificación del empleado con salario más bajo:"+respuesta);
	}
	
	public static void pregunta3(int tamano)
	{
		String DNI[]= new String [tamano];
		String placa[] = new String [tamano];
		for (int i=0; i<tamano; i++)
		{
			DNI[i] = leerString("Ingrese la identificación del empleado " +(1+i));
			placa[i] = leerString("Ingrese la placa del vehículo del empleado " +(1+i));
		}
		String aux[] = hallarPlaca(DNI, placa);
		String respuesta = Arrays.toString(aux);
		imprimir("placa con propietario de número de identificacion que termina e inicia en 1"
				+respuesta);
	}
	
	public static void pregunta4(int tamano)
	{
		String placa[] = new String [tamano];
		for (int i=0; i<tamano; i++)
		{
			placa[i] = leerString("Ingrese la placa del vehículo del empleado " +(1+i));
		}
		int respuesta = contarPlacasConLetrasEntreAyD(placa);
		imprimir(""+respuesta);
	}
	
	public static void pregunta5 (int tamano)
	{
		String DNI[]= new String [tamano];
		String placa[] = new String [tamano];
		double salario[] = new double [tamano];
		int estrato [] = new int [tamano];
		int num = leerInt ("Ingrese el número de documento que desea eliminar");
		String apellidos[] = new String [tamano];
		for (int i=0; i<tamano; i++)
		{
			DNI[i] = leerString("Ingrese la identificación del empleado " +(1+i));
			placa[i] = leerString("Ingrese la placa del vehículo del empleado " +(1+i));
			salario[i] = leerDouble("Ingrese el salario del empleado "+(1+i));
			estrato[i] = leerInt("Ingrese el estrato del empleado "+(1+i));
			apellidos[i] = leerString("Ingrese el apellido del empleado " +(1+i));
			
		}
		String aux[] = eliminarParametro(placa, DNI, salario, estrato, apellidos, num);
		String respuesta = Arrays.toString(aux);
		imprimir(respuesta);
	}
	
	public static void pregunta6(int tamano)
	{
		String placa[] = new String [tamano];
		for (int i=0; i<tamano; i++)
		{
			placa[i] = leerString("Ingrese la placa del vehículo del empleado " +(1+i));
		}
		String aux[] = mostrarPlacaDigitos000y400(placa);
		String respuesta = Arrays.toString(aux);
		imprimir(respuesta);
	}
	
	public static void pregunta7(int tamano)
	{
		String DNI[]= new String [tamano];
		String placa[] = new String [tamano];
		for (int i=0; i<tamano; i++)
		{
			DNI[i] = leerString("Ingrese la identificación del empleado " +(1+i));
			placa[i] = leerString("Ingrese la placa del vehículo del empleado " +(1+i));
		}
		String aux[] = mostrarIdentificaionPlacaPerfectos(DNI, placa);
		String respuesta = Arrays.toString(aux);
		imprimir(respuesta);
	}
	
	public static void pregunta8(int tamano)
	{
		String DNI[]= new String [tamano];
		String apellidos[] = new String [tamano];
		for (int i=0; i<tamano; i++)
		{
			DNI[i] = leerString("Ingrese la identificación del empleado " +(1+i));
			apellidos[i] = leerString("Ingrese el apellido del empleado " +(1+i));
			
		}
		String aux[] = hallarIdentificacion(apellidos, DNI);
		String respuesta = Arrays.toString(aux);
		imprimir(respuesta);
	}
	
	
	//Pregunta 1: hallar promedio con unas especificaciones 
	public static double hallarPromedio(String DNI[], double salario[], int estrato[])
	{
		double promedio=0;
		String aux; 
		char aux2;
		int contador=0;
		int contador2=0;
		for (int i = 0; i<salario.length; i++)
		{
			contador = 0;
			for (int j=0; j<DNI[i].length(); j++)
			{
				aux = DNI[i];
				aux2 = aux.charAt(j);
				if(isPar(Character.getNumericValue(aux2)))
				{
					contador++;
				}
			}
			if(estrato[i]>=4 && contador>=2)
			{
				promedio+=salario[i];
				contador2++;
			}
		}
			promedio = promedio / contador2;
			return promedio;
	}
	
	//Pregunta 2: Hallar el empleado con el salario mas bajo
	public static String hallarSalarioMenor(double salario[], String DNI[])
	{
		String salarioMenor="";
		int posicion=DNI.length-1;
		for (int i=0; i<salario.length-1; i++)
		{
			for (int j=0; j<salario.length-1; j++)
			{
				if (salario[i]<salario[j+1])
				{
					posicion=i;
					salario[j+1] = salario [i];
				}
			}
		}
		salarioMenor=DNI[posicion];
		return salarioMenor;
	}
	
	//Pregunta 3: retornar placa con propietario de identificacion que termina e inicia en 1
	public static String[] hallarPlaca (String DNI[], String placa[])
	{
		ArrayList <String> placas = new ArrayList<String>();
		int contador=0;
		for (int i=0; i<DNI.length; i++)
		{
			if (DNI[i].endsWith("1") && DNI[i].endsWith("1"))
			{
				placas.add(contador, placa[i]);
				contador++;
			}
		}
		String respuesta [] = new String [placas.size()];
		respuesta = placas.toArray(respuesta);
		return respuesta;
	}
	
	//Pregunta 4: Cantidad de placas con por lo menos una letra entre la A y la D
	public static int contarPlacasConLetrasEntreAyD(String placas[])
	{
		int contador=0;
		for(int i =0; i<placas.length; i++)
		{
			String auxPlaca = placas[i];
			for(int j=0; j<auxPlaca.length(); j++)
			{				
				if (auxPlaca.charAt(j)>='A' && auxPlaca.charAt(j)<='D')
				{
					contador++;
				}
			}
		}
		return contador;
	}
	
	//Pregunta 5: Eliminar un empleado de acuerdo al numero de identificacion
	public static String[] eliminarParametro(String placa[], String DNI[], double salario[], int estrato[], 
			String apellido[],int eliminar)
	{
		ArrayList <String> aux = new ArrayList<String>();
		int contador = 0;
		String numCadena = eliminar+"";
		for (int i=0; i<DNI.length; i++)
		{
			if(DNI[i]!=numCadena)
			{
				aux.add(contador, DNI[i]);
			}
		}
		String respuesta[] = new String [aux.size()];
		respuesta = aux.toArray(respuesta);
		return respuesta;
	}
	
	//Pregunta 6: Mostrar en un arreglo los digitos de las placas que estan entre 000 y 400
	public static String[] mostrarPlacaDigitos000y400(String placas[])
	{
		ArrayList <String> arregloPlacas = new ArrayList<String>();
		int contador=0;
		for(int i=0; i<placas.length; i++)
		{
			String auxPlaca = placas[i];
			int digitosPlaca = Integer.parseInt(auxPlaca.substring(3));
			if (digitosPlaca>=0 && digitosPlaca<=400)
			{
				arregloPlacas.add(contador, auxPlaca);
				contador++;
			}
		}
		String respuesta[] = new String [arregloPlacas.size()];
		respuesta = arregloPlacas.toArray(respuesta);
		return respuesta;
	}
	
	/*Pregunta 7: Mostrar la identificación de los empleados, cuyos vehículos tengan en sus placas dígitos
constituyan en su estructura al menos dos números perfectos.*/
	public static String[] mostrarIdentificaionPlacaPerfectos (String DNI[], String placas[])
	{
		ArrayList<String> auxDNI= new ArrayList<String>();
		int contador=0;
		String aux;
		int contador2=0;
		for (int i = 0; i<DNI.length; i++)
		{
			contador=0;
			String auxNum = (placas[i].substring(3));
			for (int j=0; j<auxNum.length(); j++)
			{
				aux = auxNum.charAt(j)+"";
				if (j==2)
				{
					if(isPerfecto(Integer.parseInt(aux)))
					{
						contador++;
					}
				}	
				for (int k = j+1; k<auxNum.length(); k++)
				{
					if(isPerfecto(Integer.parseInt(aux)))
					{
						contador++;
					} 
					aux = aux+auxNum.charAt(k);
				}
			}
			if (contador>=2)
			{
				auxDNI.add(contador2, DNI[i]);
				contador2++;
			}
		}
		String respuesta[] = new String [auxDNI.size()];
		respuesta = auxDNI.toArray(respuesta);
		return respuesta;
	}
	
	
	/*Pregunta 8: mostrar identificación cuyo apellido tiene más de 3 vocales y cuya
	identificación tiene más de 2 números primos.*/
	public static String[] hallarIdentificacion (String apellido[], String DNI[])
	{
		ArrayList<String> identificacion= new ArrayList<String>();
		int contador=0;
		for(int i=0; i<apellido.length; i++)
		{
			int contarVocales = contarVocalesApellido(apellido[i]);
			int contarNumeroPrimoDNI = contarNumerosPrimosDNI(DNI[i]);
			if(contarVocales>=3 && contarNumeroPrimoDNI>=2)
			{
				identificacion.add(contador, DNI[i]);
				contador++;
			}
		}
		String respuesta[] = new String [(identificacion.size())];
		respuesta = identificacion.toArray(respuesta);
		return respuesta;
	}
	
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
	
	public static int contarNumerosPrimosDNI(String DNI)
	{
		int respuesta=0;
		for (int i =0; i<DNI.length(); i++)
		{
			int auxNum= DNI.charAt(i)-48;
			if (isPrimo(auxNum))
			{
				respuesta++;
			}
		}
		return respuesta;
	}
	
	public static int contarVocalesApellido (String apellido)
	{
		int contarVocales=0;
		for (int i = 0; i<apellido.length(); i++)	
		{
			if(isVocal(apellido.charAt(i)))
			{
				contarVocales++;
			}
		}
		return contarVocales;
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
	
	public static boolean isPar(int num)
	{ 
		boolean respuesta=false;
		if (num%2==0)
		{
			respuesta =true;
		}
		return respuesta;
	}
	
	public static boolean isPrimo(int num)
	{
		boolean respuesta=true;
		for(int i=2; i<num;i++)
		{
			if(num%i==0)
			{
				respuesta=false;
			}
		}
		return respuesta;
	}
	
	public static double leerDouble (String mensaje) 
	{
		double dato= Double.parseDouble(JOptionPane.showInputDialog(mensaje)); 
		return dato;
	}
	
	public static String leerString(String mensaje)
	{
		String dato= JOptionPane.showInputDialog(mensaje);
		return dato;
	}
	
	public static double[] leerArregloDouble ( String pregunta, int num ) 
	{ 
		double arreglo[]= new double [ num ]; 
		for ( int i = 0 ; i < num ; i++ ) 
		{
			arreglo [ i ] = leerDouble( pregunta + 	"( " + (i+1) + " de " + num + " )" ); 
		} 
		return arreglo; 
	}
	
	public static int leerInt(String mensaje) 
	{
		int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return dato;
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
	
	public static void imprimir(String cadena)
	{
		JOptionPane.showMessageDialog(null, cadena);
	}
}
