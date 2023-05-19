package arreglos;

public class TallerClaseMiguelFlorez {

	public static void main(String[] args) {
		int arreglo[] = {2,4,3,5,6,2,3,6,2,9,2};
		System.out.println(a(arreglo));
	}
	
	public static String a(int arreglo[]) {
		String salida = "";
		int tamanio = arreglo.length;
		int numMayor = 0;
		if(tamanio==0) {
			salida = "nada";
		} else {
			for (int i : arreglo) {
				if(vaca(arreglo, i)>numMayor) {
					numMayor = vaca(arreglo, i);
				}
				salida = "mas repetido es: "+numMayor;
			}
		}
		return salida;
	}
	
	public static int vaca(int arr[], int num) {
		int cont = 0;
		for (int i : arr) {
			if(i==num) {
				cont++;
			}
		}
		return cont;
	}
}
