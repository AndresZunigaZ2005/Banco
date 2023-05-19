package arreglos;

public class TallerClase27Sept {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

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
	
	public static int contarVocales(String palabra)
	{
		int respuesta=0;
		for(int i=0; i<palabra.length(); i++)
		{
			if (isVocal(palabra.charAt(i)))
			{
				respuesta++;
			}
		}
		return respuesta;
	}
	
	public static int indicarPosicion(String arreglo[])
	{
		int mayor=0;
		int prueba1=0;
		int prueba2=0;
		for (int i=0 ; i<arreglo.length-1; i++)
		{
			prueba1= contarVocales(arreglo[i]);
			prueba2= contarVocales(arreglo[i+1]);
			if(prueba1>prueba2)
			{
				mayor=i;
			}
			else 
			{
				mayor=i+1;
			}
		}
		return mayor;
	}
}
