package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prueba {
	
	public static void main(String [] args) {
		List<String> listaPrueba = new ArrayList<String>();
		listaPrueba.add("Hola");
		listaPrueba.add("raton");
		listaPrueba.add("cuaderno");
		listaPrueba.add("carton");
		List<String> lista1 = listaPrueba.stream().filter(n -> n.endsWith("n")).collect(Collectors.toList());
		for (String numero : lista1) {
			System.out.println("filtrar: "+ numero);
		}
		List<Integer> lista2 = listaPrueba.stream().map(s -> s.length()-4).collect(Collectors.toList());
		for (Integer numero : lista2) {
			System.out.println("Longitud cada elemento: "+ numero);
		}
		int contar=(int) listaPrueba.stream().count();
		System.out.println("Contar cantidad: "+contar);
		
		Collections.sort(listaPrueba);
		List<String> listaOrdenada = listaPrueba.stream()
				.sorted()
				.collect(Collectors.toList());
		for (String cadenaOrdenada : listaOrdenada) {
			System.out.println(cadenaOrdenada);
		}
	}
}
