package arreglos;

import java.util.Iterator;

public class TallerMatriz {

	public static void main(String[] args) {
		int matriz[][] = {{1,4,3},{4,6,1},{7,4,0}};
		recorrerMatriz1(matriz);
		recorrerMatriz2(matriz);
		recorrerMatriz3(matriz);
		recorrerMatriz4(matriz);
	}
	
	public static void recorrerMatriz1(int matriz[][]) {
		String resp = "";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				resp = matriz[i][j]+"";
			}
		}
		System.out.println(resp);
	}
	
	public static void recorrerMatriz2(int matriz[][]) {
		String resp = "";
		for (int i = matriz.length-1; i >= 0; i--) {
			for (int j = 0; j < matriz.length; j++) {
				resp = matriz[i][j]+"";
			}
		}
		System.out.println(resp);
	}
	
	public static void recorrerMatriz3(int matriz[][]) {
		String resp = "";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = matriz.length-1; j >= 0; j--) {
				resp = matriz[i][j]+"";
			}
		}
		System.out.println(resp);
	}
	
	public static void recorrerMatriz4(int matriz[][]) {
		String resp = "";
		for (int i = 0; matriz.length-1 >= 0; i--) {
			for (int j = matriz.length-1; j >= 0; j--) {
				resp = matriz[i][j]+"";
			}
		}
		System.out.println(resp);
	}
}
