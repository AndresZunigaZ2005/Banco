package clase;

public class parcial1 {

	public static void main(String[] args) {
		
		String lim1="1000000020";
		String lim2="1000000050";
		int respuesta = contarCodigoBarras(lim1,lim2);
		System.out.println(respuesta);
		int lim3=1;
		int lim4=1000;
		int respuesta2 = contarNumNarcicistasCon2DigitosMenor5(lim3,lim4);
		System.out.println(respuesta2);
		int lim5=5;
		String matriz=generarMatriz(lim5);
		System.out.print(matriz);
	
	}
	
	//pregunta 1
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
	
	public static boolean isPar(int num)
	{
		boolean respuesta = false;
		if (num%2==0)
		{
			respuesta=true;
		}
		return respuesta;
	}
	
	public static int factor3Y1(int num)
	{
		int contador=0;
		int aux=0;
		for (int i=0; i<num; num=num/10)
		{
			aux=num%10;
			if(isPar(aux))
			{
				contador+=num*1;
			}
			else
			{
				contador+=num*3;
			}
		}
		return contador;
	}
	
	public static int contarCodigoBarras(String lim1, String lim2)
	{
		int mitad1,mitad2,contador1,contador2;
		int contador=0;
		int numeroPerfectoComprobacion=0;
		int limite1=Integer.valueOf(lim1);
		int limite2=Integer.valueOf(lim2);
		for (int i=limite1; i<=limite2; i++)
		{
			mitad1=i/100000;
			mitad2=i%100000;
			contador1=factor3Y1(mitad1);
			contador2=factor3Y1(limite2);
			numeroPerfectoComprobacion=mitad1/10000+mitad2%10;
			if(contador1>contador2 && isPerfecto(numeroPerfectoComprobacion))
			{
				contador++;
			}
		}
		return contador;
	}
	
	
//Pregunta 2
	public static int generarTamanioNumero(int num)
	{
		int contador=0;
		for (int i =0; i<num; num=num/10)
		{
			contador++;
		}
		return contador;
	}
	
	public static boolean isMenor5(int num)
	{
		boolean respuesta = false;
		if(num<5)
		{
			respuesta=true;
		}
		return respuesta;
	}
	
	public static boolean isNarcicista(int num)
	{
		int aux2=num;
		int contador=0;
		boolean respuesta=false;
		int tamanio=generarTamanioNumero(num);
		int aux=0;
		for (int i=0; i<tamanio; i++)
		{
			aux=num%10;
			contador+=(int)Math.pow(aux, tamanio);
			num=num/10;
		}
		if(contador==aux2)
		{
			respuesta=true;
		}
		return respuesta;
	}
	
	public static int contarMenor5(int num)
	{
		int contador=0;
		int aux=0;
		for(int i=0; i<num; num=num/10)
		{
			aux=num%10;
			if(isMenor5(aux))
			{
				contador++;
			}	
		}
		return contador;
	}
	
	public static int contarNumNarcicistasCon2DigitosMenor5(int lim1,int lim2)
	{
		int contador=0;
		int contarMenor5=0;
		for(int i=lim1; i<=lim2; i++)
		{
			contarMenor5=contarMenor5(i);
			if (isNarcicista(i) && contarMenor5>=2)
			{
				contador++;
			}
		}
		return contador;
	}
	
	
	//Pregunta 3
	public static String generarMatriz(int num)
	{
		String respuesta="";
		for (int i=0; i<num; i++)
		{
			for (int j=0; j<num; j++)
			{
				if(i<j) 
				{
					respuesta+="2 ";	
				}
				else
				{
					respuesta+=(int)Math.pow(i, j)+" ";
				}
			}
			respuesta+="\n";
		}
		return respuesta;
	}
}
