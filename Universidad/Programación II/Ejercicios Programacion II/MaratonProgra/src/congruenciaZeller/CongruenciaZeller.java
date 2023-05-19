package congruenciaZeller;

public class CongruenciaZeller {

	public static void hallarDiaSemana(int dia, MesCongruencia mes, int año) {
		int añoFormateado = año%100;
		int op1= ((13*mes.getValor())-1)/5;
		System.out.println(op1);
		int op2 = (añoFormateado)/4;
		System.out.println(op2);
		int op3 = hallarSiglo(año, mes)/4;
		System.out.println(op3);
		int op4 = dia+(añoFormateado-1);
		System.out.println(op4);
		int op5 = 2*(hallarSiglo(año, mes));
		int diaSemana = (op1+op2+op3+op4-op5)%7;
		System.out.println(diaSemana);
		System.out.println(hallarDia(diaSemana));
	}
	
	public static int hallarSiglo(int año, MesCongruencia mes) {
		int siglo = (año+99)/100;
		if(mes.getValor()==11 || mes.getValor()==12) {
			siglo--;
		}
		System.out.println("siglo " +siglo);
		return siglo;
	}
	

	
	public static void main(String []args) {
		hallarDiaSemana(15, MesCongruencia.FEBRERO, 2005);
	}
	
	public static String hallarDia(int diaSemana) {
		String dia="";
		if(diaSemana==0) {
			dia="Domingo";
		}else if (diaSemana==1) {
			dia = "Lunes";
		}else if (diaSemana==2) {
			dia = "Martes";
		}else if (diaSemana==3) {
			dia = "Miercoles";
		}else if (diaSemana==4) {
			dia = "Jueves";
		}else if (diaSemana==5) {
			dia = "Viernes";
		}else if (diaSemana==6) {
			dia = "Sabado";
		}
		return dia;
	}
}
