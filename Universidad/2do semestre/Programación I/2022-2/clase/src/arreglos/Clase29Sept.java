package arreglos;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Clase29Sept {

	public static void main(String[] args) 
	{
		String arreglo[]=new String[10];
		Arrays.fill(arreglo, "5");
		String imp=Arrays.toString(arreglo);
		imprimir (imp);
		String arreglo1[]= {"Carlos", "Kliche","Colombia","Narciso"};
		String arreglo2[]= {"Carlos","Kliche", "Colombia","Narciso"};
		boolean igual=Arrays.equals(arreglo1, arreglo2);
		imprimir(""+igual);
		String palabra= "esternocleidomastoideo";
		boolean inicio=palabra.startsWith("ester");
		imprimir (""+inicio);
		boolean final1=palabra.endsWith("wgefi");
		imprimir (""+final1);
		String dividir[]=palabra.split("o");
		String imp2= Arrays.toString(dividir);
		imprimir (imp2);
	}
	public static void imprimir (String mensaje) 
	{ 
		JOptionPane.showMessageDialog(null,mensaje); 
	}
	
}
