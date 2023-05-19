package numeroFeliz;

import java.util.HashSet;
import java.util.Scanner;

public class NumeroFeliz {
	
	public static void main(String[] args) {
		System.out.println(isFeliz(141));
	}
	
	public static boolean isFeliz(int num) {
		int resultado =0;
		do {
			String aux = String.valueOf(num);
			for (int i = 0; i < aux.length(); i++) {
				resultado += (int) Math.pow(Integer.parseInt(aux.charAt(i)+""), 2);
			}
		} while (resultado > 1);
		return true;
	}
}
