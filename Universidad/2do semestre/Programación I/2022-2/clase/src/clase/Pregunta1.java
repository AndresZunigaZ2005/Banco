package clase;

import javax.swing.JOptionPane;

public class Pregunta1 {
	
	public static void main(String[]args)
	{
		double salario,salarioNuevo,porcentajeAumento;
		salario = leerDouble("Ingrese el salario del empleado");
		porcentajeAumento = leerDouble ("Ingrese al porcentaje a aumenta al empleado");
		salarioNuevo = salariar (salario, porcentajeAumento);
		imprimir ("El salario nuevo del empleado es de "+salarioNuevo+", tuvo un aumento de: "+porcentajeAumento+"%");
	}
	
	public static double leerDouble(String mensaje) 
	{
		double dato = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return dato;
	}
	
	public static void imprimir(String cadena)
	{
		JOptionPane.showInputDialog(null, cadena);
	}

	public static double salariar(double salario, double porcentaje)
	{
		double resultado;
		resultado=salario+salario*(porcentaje/10);
		return resultado;
	}

}
