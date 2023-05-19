package clase;
//import java.util.Scanner;
import javax.swing.JOptionPane;

public class pruebas {

	public static void main(String[] args) 
	{
		String placa = leerString("Ingrese una placa");
		int resultado = contarLetrasEntreMyW(placa);
		imprimir (""+resultado);
		
		
		/*Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de filas: ");
        int numFilas = sc.nextInt();
        sc.close();
 
        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }*/
	}
	public static String generarNumero1A1(int num)
	{
		String resultado="";
		for(int i=1; i<=num;i++)
		{
			resultado+=i+ " ";
		}
		return resultado;
	}
	
	public static String generarsucesionMenorMayor(int num)
	{
		String resultado="";
		for (int i=1; i<=num; i++)
		{
			resultado+=i+" "+num+" ";
		}
		return resultado;
	}
	public static String generarsucesionFib(int numero)
	{
		String resultado="";
		int i=0;
		int j=1;
		while(j<=numero)
		{
			resultado+=i+" "+j+" ";
			i+=j;
			j+=i;		
		}
		return resultado;
	}
	public static int sumarDigitos(String placa)
	{
		int longitud = placa.length();
		int contador=0;
		int num;
		char caracter;
		for(int i=0; i<longitud; i++)
		{
			caracter=placa.charAt(i);
			num = caracter;
			contador+=num;
		}
		return contador;
	}
	public static int contarLetrasEntreMyW(String placa)
	{
		int contador=0;
		for(int i=0; i<4; i++)
		{
			if(placa.charAt(i)>'M' && placa.charAt(i)<'W')
			{
				contador++;
			}
		}
		return contador;
	}

	
	public static String leerString(String mensaje)
	{
		String dato= JOptionPane.showInputDialog(mensaje);
		return dato;
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
}
