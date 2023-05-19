package collection_stream;

import java.util.*;

public class MainPrueba {

	public static void main(String[]args) {		
		Trader trader1 = new Trader("Londoño", "Cambridge");
		Trader trader2 = new Trader("Robinson", "Cambridge");
		Trader trader3 = new Trader("Carballo", "Milan");
		
		List<Trader> listTrader = new ArrayList<>();
		listTrader.add(trader1);
		listTrader.add(trader2);
		listTrader.add(trader3);
		
		Calendar calendar1 = new GregorianCalendar(2011, 11, 20);
		Transaction transaction1 = new Transaction(calendar1, 100000, trader1);
		
		Calendar calendar2 = new GregorianCalendar(2009, 1, 15);
		Transaction transaction2 = new Transaction(calendar2, 50000,trader1);
		
		Calendar calendar3 = new GregorianCalendar(2015, 12, 25);
		Transaction transaction3 = new Transaction(calendar3, 240000,trader2);
		
		Calendar calendar4 = new GregorianCalendar(2021, 5, 13);
		Transaction transaction4 = new Transaction(calendar4, 100000, trader3);
		
		Calendar calendar5 = new GregorianCalendar(2011, 1, 29);
		Transaction transaction5 = new Transaction(calendar5, 100000, trader2);
		
		List<Transaction> listTransaction= new ArrayList<>();
		listTransaction.add(transaction1);
		listTransaction.add(transaction2);
		listTransaction.add(transaction3);
		listTransaction.add(transaction4);
		listTransaction.add(transaction5);
		
		Principal principal = new Principal(listTrader, listTransaction);
		List<Transaction> primeraPregunta = principal.transaccionesAnioOrdenarValor(new GregorianCalendar(2011, 1, 1));
		System.out.println("Primera Pregunta");
		for (Transaction transaction : primeraPregunta) {
			System.out.println(transaction.toString());
		}
		
		List<String> segundaPregunta = principal.obtenerCiudadListaTraders();
		System.out.println("Segunda Pregunta");
		segundaPregunta.forEach(System.out::println);
		
		List<Trader> terceraPregunta = principal.filtrarCiudadOrdenarNombre("Cambridge ");
		System.out.println("Tercera Pregunta");
		terceraPregunta.forEach(System.out::println);
		
		String cuartaPregunta = principal.ordenarListaNombre();
		System.out.println("Cuarta Pregunta");
		System.out.println(cuartaPregunta);
		
		boolean quintaPregunta = principal.isCiudadTraderMilan("Milan");
		System.out.println("Quinta Pregunta");
		System.out.println(quintaPregunta+"");
		
		System.out.println("Sexta Pregunta");
		principal.imprimirTransaccionesCiudadEspecifica("Cambridge");
		
		double septimaPregunta = principal.devolverValorMayorTransaction();
		System.out.println("Septima Pregunta");
		System.out.println(septimaPregunta+"");
		
		Optional<Transaction> OctavaPregunta = principal.transactionMenorValor();
		System.out.println("Octava Pregunta");
		System.out.println(OctavaPregunta.toString());
	}
}
