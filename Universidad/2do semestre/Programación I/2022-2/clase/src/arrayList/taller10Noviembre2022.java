package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * Nombre: Andrés Felipe Zúñiga Zuluaga
 * Código: 1094889063
 * Universidad del Quindío
 * Facultad de ingeniería
 * Programa de Ingeniería de Sistemas y Computación
 * Programación I - Grupo 03D
 * Fecha: 13/11/2022
 */

public class taller10Noviembre2022 {
	
	public static void main(String []args) {
		int tamanio=5;
		//P1
		String matriz1[][]= {{"cama","maca"},
							{"reconocer","sedes"}};
		String imp1[]=devolverIgualdadPalabra(matriz1);
		imprimir("P1 "+Arrays.toString(imp1));
		//P2
		String matriz2[][]= {{"cama","maca","piramide"},
							{"reconocer","sedes","roma"},
							{"vida","ligaresseragil","radar"}};
		String imp2[] = retornarPalindromos(matriz2);
		imprimir("P2 "+Arrays.toString(imp2));
		//P3
		String matriz3[][]= {{"cama","maca"},{"reconocer","sedes"}};
		String imp3[] = devolverPalindromosMatriz(matriz3);
		imprimir("P3 "+Arrays.toString(imp3));
		//P4
		String placas[][] = {{"UMP666","GNT310","UFR428"},
							{"IUN286","HMO561","MPO496"},
							{"PTO660","ATM999","ETS666"}};
		String imp4[] = DevolverPlacasDosPerfectos(placas);
		imprimir("P4 "+Arrays.toString(imp4));
		//P5
		int matriz5[][]=llenarMatrizSerpiente(tamanio);
		String imp5= imprimirMatrizInt(matriz5);
		imprimir("P5\n"+imp5);
		//P6
		int matriz6[][] = llenarMatrizAlreves(tamanio);
		String imp6= imprimirMatrizInt(matriz6);
		imprimir("P6\n"+imp6);
		//P7
		int matriz7[][] = llenarMatrizAlrevesArribaAbajo(tamanio);
		String imp7=imprimirMatrizInt(matriz7);
		imprimir("P7\n"+imp7);
		//P8
		String matriz8[][]= {{"sien","encima","mapa"},
							{"pata","tapa","papa"},
							{"pato","toma","mama"}};
		boolean imp8 = verificarJuegoCadenaMatriz(matriz8);
		imprimir("P8\n"+imp8);
		//P9
		int tamanio2=5;
		int matriz9[][] = hacerPiramideUnos(tamanio2);
		String imp9=imprimirMatrizInt(matriz9);
		imprimir("P9\n"+imp9);
		//P10
		int matriz10[][]={{345,12,14,22},
						{21,15,1,0},
						{18,19,2016,345654}};
		String imp10[]=devolverPolidivisibles(matriz10);
		imprimir("P10\n"+Arrays.toString(imp10));
	}

	//Pregunta 1
	public static boolean revisarIgualdadPalabraSinOrden(String palabra1, String palabra2) {
		boolean respuesta=true;
		if(palabra1.length()==palabra2.length()) {
			for(int i=0; i<palabra1.length(); i++) {
				boolean aux = false;
				for(int j=0; j<palabra2.length();j++) {
					if(palabra1.charAt(i)==palabra2.charAt(j)) {
						aux=true;
						break;
					}
				}
				if(!aux) {
					respuesta=false;
					break;
				}
			}
		}
		else {
			respuesta=false;
		}
		return respuesta;
	}
	
	
	public static String[] devolverIgualdadPalabra(String arregloBidi[][]) {
		ArrayList<String>aux= new ArrayList<String>();
		for(int i = 0; i<arregloBidi.length; i++) {
			if(revisarIgualdadPalabraSinOrden(arregloBidi[i][0], arregloBidi[i][1])) {
				aux.add(i+"");
			}
		}
		String respuesta[] = new String[aux.size()];
		respuesta=aux.toArray(respuesta);
		return respuesta;
	}
	
	//Pregunta 2
	public static String[] retornarPalindromos(String arreglo[][]){
		ArrayList<String> aux = new ArrayList<String>();
		for(int i=0; i<arreglo.length;i++) {
			for(int j=0; j<arreglo[i].length; j++) {
				String auxString=arreglo[i][j];
				if(isPalindromo(auxString)) {
					aux.add(i+" "+j);
				}
			}
		}
		String respuesta[] = new String[aux.size()];
		respuesta=aux.toArray(respuesta);
		return respuesta;
	}
	
	public static boolean isPalindromo(String palabra) {
		boolean respuesta=true;
		for(int i = 0; i<palabra.length(); i++) {
			if(palabra.charAt(i)!=palabra.charAt(palabra.length()-i-1)) {
				respuesta=false;
				break;
			}
		}
		return respuesta;
	}
	
	//Pregunta 3
	public static String[] devolverPalindromosMatriz(String arreglo[][]) {
		ArrayList <String> aux= new ArrayList<String>();
		for(int i = 0; i<arreglo.length; i++) {
			for(int j = 0; j<arreglo.length; j++) {
				if(i>j) {
					if(isPalindromo(arreglo[i][j])) {
						aux.add(arreglo[i][j]);
					}
				}
			}
		}
		String respuesta[] = new String[aux.size()];
		respuesta = aux.toArray(respuesta);
		return respuesta;
	}
	
	//Pregunta 4
	public static boolean isPerfecto(int numero) {
		int contador=0;
		boolean respuesta=false;
		for (int i = 1; i<numero; i++) {
			if((numero%i)==0) {
				contador+=i;
			}
		}
		if(contador==numero) {
			respuesta=true;
		}
		return respuesta;
	}
	
	public static int contarPerfectosNumero(int num) {
		String numero=num+"";
		String aux="";
		int contador=0;
		for(int i = 0; i<numero.length(); i++) {
			aux="";
			for(int j = i; j<numero.length(); j++) {
				aux+=numero.charAt(j);
				if(isPerfecto(Integer.parseInt(aux))) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public static String[] DevolverPlacasDosPerfectos(String placas[][]) {
		ArrayList<String> auxRespuesta = new ArrayList<String>();
		int contador=0;
		for(int i = 0; i<placas.length; i++) {
			for(int j = 0; j<placas.length; j++) {
				contador=0;
				if(j>i) {
					contador=contarPerfectosNumero(Integer.parseInt(placas[i][j].substring(3)));
				}
				if(contador>=2) {
					auxRespuesta.add(placas[i][j]);
				}
			}
		}
		String respuesta[] = new String[auxRespuesta.size()];
		respuesta=auxRespuesta.toArray(respuesta);
		return respuesta;
	}
	
	//Pregunta 5
	public static int[][] llenarMatrizSerpiente(int tamanio) {
		int matriz[][] = new int [tamanio][tamanio];
		int contador = 1;
		int i=0;
		while (i<tamanio) {
			for(int j = 0; j<tamanio; j++) {
				matriz[j][i] = contador;
				contador++;
			}
			i++;
			if(i<tamanio-1) {
				for(int k = tamanio-1; k>=0; k--) {
					matriz[k][i]=contador;
					contador++;
				}
			}
			i++;
		}
		return matriz;
	}
	
	//Pregunta 6
	public static int[][] llenarMatrizAlreves(int tamanioMatriz){
		int matriz[][] = new int[tamanioMatriz][tamanioMatriz];
		int contador=1;
		for(int i = 0; i<matriz.length; i++) {
			for(int j=matriz.length-1; j>=0; j--) {
				matriz[i][j] = contador;
				contador++;
			}
		}
		return matriz;
	}
	
	//Pregunta 7
	public static int[][] llenarMatrizAlrevesArribaAbajo(int tamanioMatriz){
		int matriz[][] = new int[tamanioMatriz][tamanioMatriz];
		int contador=1;
		for(int i = matriz.length-1; i>=0; i--) {
			for(int j=0; j<=matriz.length-1; j++) {
				matriz[j][i] = contador;
				contador++;
			}
		}
		return matriz;
	}
	
	//Pregunta 8
	public static boolean verificarJuegoCadenaMatriz(String matriz[][]) {
		boolean respuesta=true;
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz.length; j++) {
				if(i==matriz.length-1 && j==matriz.length-1) {
					break;
				}
				if(j==matriz.length-1) {
					if(!verificarJuegoCadena(matriz[i][j], matriz[i+1][0])) {
						respuesta=false;
					}
				}
				else {
					if(!verificarJuegoCadena(matriz[i][j], matriz[i][j+1])) {
						respuesta=false;
					}
				}
			}
			if(!respuesta) {
				break;
			}
		}
		return respuesta;
	}
	public static boolean verificarJuegoCadena(String palabra1, String palabra2) {
		boolean respuesta=false;
		String pal1=palabra1.substring(palabra1.length()-2);
		String pal2=palabra2.substring(0,2);
		if(pal1.equals(pal2)) {
			respuesta=true;
		}
		return respuesta;
	}
	
	//Pregunta 9
	public static int[][] hacerPiramideUnos(int tamanio){
		int matriz[][] = new int[tamanio][2*tamanio];
		int limiteIzquierdo = matriz[0].length/2-1, limiteDerecho=matriz[0].length/2;
		for(int i = 0; i<=matriz.length/2-1; i++) {
			for(int j = 0; j<matriz[0].length; j++) {
				if(j>=limiteIzquierdo && j<=limiteDerecho) {
					matriz[i][j]=1;
				}
			}
			limiteIzquierdo-=2;
			limiteDerecho+=2;
		}
		if((tamanio)%2!=0) {
			limiteIzquierdo=0;
			limiteDerecho=matriz[0].length-1;
			for(int i = matriz.length/2; i<matriz.length; i++) {
				for(int j = 0; j<matriz[0].length; j++) {
					if(j>=limiteIzquierdo && j<=limiteDerecho) {
						matriz[i][j]=1;
					}
				}
				limiteIzquierdo+=2;
				limiteDerecho-=2;
			}
		}
		else {
			limiteIzquierdo=1;
			limiteDerecho=matriz[0].length-2;
			for(int i = matriz.length/2; i<matriz.length; i++) {
				for(int j = 0; j<matriz[0].length; j++) {
					if(j>=limiteIzquierdo && j<=limiteDerecho) {
						matriz[i][j]=1;
					}
				}
				limiteIzquierdo+=2;
				limiteDerecho-=2;
			}
		}
		return matriz;
	}
	
	//Pregunta 10
	public static boolean isPolidivisible(int num) {
		boolean respuesta=true;
		String auxNum=num+"";
		String auxChars="";
		int contador=1;
		for(int i=0; i<auxNum.length(); i++) {
			auxChars+=auxNum.charAt(i);
			if(Integer.parseInt(auxChars)>0 && Integer.parseInt(auxChars)%contador==0) {
				contador++;
			}
			else {
				respuesta=false;
				break;
			}
		}
		return respuesta;
	}
	
	public static String[] devolverPolidivisibles(int matriz[][]) {
		ArrayList<String> aux = new ArrayList <String>();
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[0].length; j++) {
				if(isPolidivisible(matriz[i][j])) {
					aux.add(matriz[i][j]+"");
				}
			}
		}
		String respuesta[] = new String [aux.size()];
		respuesta = aux.toArray(respuesta);
		return respuesta;
	}
	
	public static String imprimirMatrizInt(int arregloBi[][]){
		
		String respuesta="";
		for (int i = 0; i<arregloBi.length; i++) {
			for (int j = 0;j<arregloBi[0].length;j++) {
				respuesta+=arregloBi[i][j]+" ";
			}
			respuesta+="\n";
		}
		return respuesta;
	}
	public static void imprimir(String cadena)
	{
		JOptionPane.showMessageDialog(null, cadena);
	}
	public static String imprimirArregloInt(int arreglo[])
	{
		String respuesta="[ ";
		for (int i=0; i<arreglo.length; i++)
		{
			respuesta+=arreglo[i]+", ";
		}
		respuesta+="]";
		return respuesta;
	}
}
