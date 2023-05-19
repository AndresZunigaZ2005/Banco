package mainLibrary;
import javax.swing.JOptionPane;

public class library {
	
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
	
	public static String leerString(String mensaje)
	{
		String dato= JOptionPane.showInputDialog(mensaje);
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
	
	public static double[] leerArregloDouble ( String pregunta, int num ) 
	{ 
		double arreglo[]= new double [ num ]; 
		for ( int i = 0 ; i < num ; i++ ) 
		{
			arreglo [ i ] = leerDouble( pregunta + 	"( " + (i+1) + " de " + num + " )" ); 
		} 
		return arreglo; 
	}
	
	public static int[] leerArregloInteger ( String pregunta, int num ) 
	{ 
		int arreglo[]= new int [ num ]; 
		for ( int i = 0 ; i < num ; i++ ) 
		{
			arreglo [ i ] = leerInt( pregunta + 	"( " + (i+1) + " de " + num + " )" ); 
		} 
		return arreglo; 
	}
	
	public static void imprimir(String cadena)
	{
		JOptionPane.showMessageDialog(null, cadena);
	}
}