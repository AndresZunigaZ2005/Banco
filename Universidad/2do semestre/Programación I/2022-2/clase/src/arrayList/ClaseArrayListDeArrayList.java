package arrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ClaseArrayListDeArrayList {

	public static void main(String[] args) {
		ArrayList <String> [][] matriz= new ArrayList[3][3];
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[0].length; j++) {
				matriz[i][j] = new ArrayList<String>();
				ArrayList <Integer> llenarMatriz = llenarArrayListRandom(5);
				matriz[i][j].add(llenarMatriz+"");
			}
		}
		String imp1 = imprimirArrayListDeArrayList(matriz);
		imprimir(imp1);
	}
	public static ArrayList<Integer> llenarArrayListRandom(int tamanioMax) {
		ArrayList<Integer> respuesta = new ArrayList <Integer>(); 
		for(int i = 0; i<tamanioMax; i++) {
			int auxiliar = (int)Math.random()*15;
			respuesta.add(auxiliar);
		}
		return respuesta;
	}
	
	public static boolean isDefectuoso(int num) {
		boolean respuesta = true;
		int contador = 0;
		for(int i = 1; i<num; i++) {
			if((num%i)==0) {
				contador+=i;
			}
		}
		if(contador>num) {
			respuesta=false;
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
	
	private static int generarTamanioNumero(int num) {
		int contador=0;
		for(int i = 0; i<num; num=num/10) {
			contador++;
		}
		return contador;
	}
	public static int contarDefectuosos (ArrayList<String>[][] lista) {
		int contador=0;
		for(int i = 0; i<lista.length; i++) {
			for(int j = 0; j<lista[0].length; j++) {
				for(int k = 0; j<lista[i][j].size(); k++) {
					if(isDefectuoso(Integer.parseInt(lista[i][j].get(k)))) {
						contador++;
					}
				}
			}
		}
		return contador;
		
	}
	
	public static ArrayList<String> mostrarNarcicistasEncimaDiagonal(ArrayList<String>[][]lista){
		for(int i=0; i<lista.length; i++) {
			for(int j=0; i<lista[0].length; j++) {
				
			}
		}
	}
	public static String  imprimirArrayListDeArrayList(ArrayList<String>[][] lista) {
		String respuesta = "";
		for(int i=0; i<lista.length; i++) {
			for(int j = 0; j<lista[0].length; j++) {
				for(int k = 0; k<lista[i][j].size(); k++) {
					respuesta+=lista[i][j].get(k)+" ";
				}
				respuesta+="   ";
			}
			respuesta+="\n";
		}
		return respuesta;
	}
	
	public static void imprimir(String cadena)
	{
		JOptionPane.showMessageDialog(null, cadena);
	}
}
