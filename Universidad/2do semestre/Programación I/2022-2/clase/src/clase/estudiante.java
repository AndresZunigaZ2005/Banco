package clase;

import javax.swing.JOptionPane;

public class estudiante {

	public static void main(String[] args) 
	{
		double nota1, nota2, nota3;
		double promedio =0.0;
		int contadorAprobo=0;
		String valoracion, nombreEstudiante;
		nota1 = leerDouble ("Ingrese la nota del parcial 1");
		nota2 = leerDouble ("Ingrese la nota del parcial 2");
		nota3 = leerDouble ("Ingrese la nota del parcial 3");
		nombreEstudiante = leerString("Ingrese el nombre del estudiante");
		if (isCorrecto(nota1)==true && isCorrecto(nota2)==true && isCorrecto(nota3)==true)
		{
			promedio = CalcularPromedio (nota1, nota2, nota3);
			imprimir ("El promedio de los parciales del estudiante "+nombreEstudiante+ " es de: "+promedio);
			contadorAprobo = aprobarNotas(nota1,nota2,nota3);
			imprimir ("El estudiante aprobó: "+contadorAprobo+" parciales.");
			valoracion = valorarPromedioFinal (promedio);
			imprimir (valoracion);
		}
		else
		{
			imprimir ("Ingrese de nuevo los datos.");
		}
		
	}
	
	//Función para leer numeros reales	
	public static double leerDouble(String mensaje) 
	{
		double dato = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return dato;
	}
	
	//Funcion para leer cadenas
	public static String leerString(String mensaje)
	{
		String dato= JOptionPane.showInputDialog(mensaje);
		return dato;
	}
	//Función para calcular promedio
	public static double CalcularPromedio (double nota1, double nota2,double nota3)
	{
		double promedio;
		promedio = (nota1+nota2+nota3)/3;
		return promedio;
	}
	
	//Función para establecer si la nota está en el rango correcto
	public static boolean isCorrecto(double nota)
	{
		boolean centinela = false;
		if (nota>=0 && nota<=5)
		{
			centinela = true;
		}
		return centinela;
	}
	
	//Función para saber si aprobó los parciales
	public static int aprobarNotas (double nota1,double nota2,double nota3)
	{
		int contador=0;
		if (nota1>=3)
		{
			contador++;
    	}
		if (nota2>=3)
		{
			contador++;
		}
		if (nota3>=3)
		{
			contador++;
		}
		return contador;
	}
		
	//Función para valorar promedio
	public static String valorarPromedioFinal(double promedio)
	{
		String mensaje = ("");
		if (promedio>=0 && promedio<3)
		{
			mensaje = ("El rendimiento del estudiante es deficiente");
		}
		else if (promedio>=3 && promedio<4)
		{
			mensaje = ("El rendimiento del estudiante es aceptable");
		}
		else if (promedio>=4 && promedio<4.5)
		{
			mensaje = ("El rendimiento del estudiante es bueno");
		}
		else if (promedio>=4.5 && promedio<=5)
		{
			mensaje = ("El rendimiento del estudiante es excelente");
		}
		return mensaje;	
	}
	public static void imprimir(String cadena)
	{
		JOptionPane.showMessageDialog(null, cadena);
	}
}