package leapYear;

import java.util.Scanner;

public class anioBisiesto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String anio = verificarAnio(sc.nextInt());
		System.out.println(anio);
	}
	
	public static String verificarAnio(int anio) {
		String respuesta="";
		boolean leap = false;
		if(((anio%4)==0) && ((anio%400)==0) && ((anio%100)!=0)) {
			respuesta += "This is leap year.";
			leap = true;
		}else if (leap && anio%15==0) {
			respuesta+="This is huluculu festival year.";
		}else if(leap && anio%55==0) {
			respuesta+="This is Bulukulu festival year.";
		}else {
			respuesta+="This is a ordinary year.";
		}
		return respuesta;
	}
}
