package cadena;

import java.util.ArrayList;

public class Robinson <T>{
	
	ArrayList<T> maleta = new ArrayList<>();
	
	public void empacar(T objeto) {
		maleta.add(objeto);
	}
	
	public void desempacar (T objeto) {
		maleta.remove(objeto);
	}
	
	public int escanear (ArrayList<? super Number> lista) {
		int cont = 0;
		for (Number number : lista) {
			cont+=number.intValue();
		}
		return cont;
	}
}
