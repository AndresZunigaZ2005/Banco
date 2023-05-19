package arrayList;

import javax.swing.JOptionPane;


public class clase27Octubre {
	//Arreglos Bidimensionales
	
	public static void main(String[]args) {
		
		String arregloBi[][] = new String[3][3];
		for (int i = 0; i<arregloBi.length; i++) {
			for(int j = 0; j<arregloBi.length; j++) {
				arregloBi[j][i] = j+","+i;
			}
		}
		String respuesta = imprimirMatizCuadradaString(arregloBi);
		imprimir(respuesta);
		
		
		
		
		int suma=0;
		int arregloInt[][] = new int[3][3];
		for (int i = 0; i<arregloInt.length; i++) {
			for(int j = 0; j<arregloInt.length; j++) {
				arregloInt[i][j] = suma;
				suma++;
			}
		}
		String respuesta1 = imprimirMatizCuadradaInt(arregloInt);
		imprimir (respuesta1);
		
		int respuesta2=0;
		for(int i = 0; i<arregloInt.length; i++) {
			for(int j = 0; j<arregloInt.length;j++) {
				if(i>j)
				{
					respuesta2+=arregloInt[i][j];
				}
			}
		}
		imprimir(respuesta2+"");
		
		
		
		String respuesta3="";
		for (int i = 0; i<arregloInt.length; i++) {
			for (int j = 0; j<arregloInt.length; j++) {
				if(isPar(j))
				{
					respuesta3+=arregloInt[i][j]+"  ";
				}
			}
			respuesta3+="\n";
		}
		imprimir (respuesta3);
		
		
		
		
		int respuesta4=0;
		for(int i = 0; i<arregloInt.length;i++) {
			for(int j = 0; j<arregloInt.length; j++) {
				if((i+j)==arregloInt.length-1) {
					respuesta4+=arregloInt[i][j];
				}
			}
		}
		imprimir(respuesta4+"");
		
		
		
		int suma1=0;
		int arregloInt2[][] = new int[3][3];
		for (int i = 0; i<arregloInt2.length; i++) {
			for(int j = 0; j<arregloInt2.length; j++) {
				arregloInt2[i][j] = suma1;
				suma1++;
			}
		}
		int matrizSuma[][] = new int [3][3];
		for(int i = 0; i<matrizSuma.length; i++) {
			for(int j = 0; j<matrizSuma.length; j++) {
				matrizSuma[i][j]=arregloInt[i][j]+arregloInt2[i][j];
			}
		}
		String respuesta5=imprimirMatizCuadradaInt(matrizSuma);
		imprimir(respuesta5);
		
		
		boolean respuesta6=isSimetricaMatriz(matrizSuma);
		imprimir (respuesta6+"");
		
		
		
		
		int menor=hallarMenorElemnotMatriz(matrizSuma);
		imprimir(menor+"");
	}
	
	public static void imprimir(String cadena)
	{
		JOptionPane.showMessageDialog(null, cadena);
	}
	
	public static String imprimirMatizCuadradaInt(int arregloBi[][]){
		
		String respuesta="";
		for (int i = 0; i<arregloBi.length; i++) {
			for (int j = 0;j<arregloBi.length;j++) {
				respuesta+=arregloBi[i][j]+" ";
			}
			respuesta+="\n";
		}
		return respuesta;
	}
	
	public static String imprimirMatizCuadradaString(String arregloBi[][]){
		
		String respuesta="";
		for (int i = 0; i<arregloBi.length; i++) {
			for (int j = 0;j<arregloBi.length;j++) {
				respuesta+=arregloBi[i][j]+"  ";
			}
			respuesta+="\n";
		}
		return respuesta;
	}
	public static boolean isPar(int num) {
		boolean respuesta=true;
		if((num%2)!=0) {
			respuesta=false;
		}
		return respuesta;
	}
	
	public static int[][] hallarTranspuesta(int matriz[][]){
		int respuesta[][] = new int [matriz.length-1][matriz.length-1];
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz.length; j++) {
				respuesta[j][i]=matriz[i][j];
			}
		}
		return respuesta;
	}
	
	public static boolean isSimetricaMatriz(int matriz[][]) {
		boolean respuesta=true;
		for(int i = 0; i<matriz.length; i++)
		{
			for(int j = 0; j<matriz.length; j++)
			{
				if(matriz[i][j]!=matriz[j][i])
				{
					respuesta=false;
					break;
				}
			}
			if(!respuesta)
			{
				break;
			}
		}
		return respuesta;
	}
	
	public static int hallarMenorElemnotMatriz(int matriz[][]) {
		int menor=matriz[0][0];
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz.length; j++) {
				if(matriz[i][j]<menor)
				{
					menor = matriz[i][j];
				}
			}
		}
		return menor;
	}
	
	
}
