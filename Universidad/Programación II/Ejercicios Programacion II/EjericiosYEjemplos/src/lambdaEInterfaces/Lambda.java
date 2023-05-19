package lambdaEInterfaces;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
	List<Integer> lista = Arrays.asList(2,5,8,0,2,5,6);
	List <Integer> pares = lista.stream().filter(x -> x%2==1).collect(Collectors.toList());
	System.out.println(pares.toString());
	}
}
