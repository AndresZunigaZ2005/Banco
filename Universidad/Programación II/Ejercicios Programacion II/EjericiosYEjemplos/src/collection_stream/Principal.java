package collection_stream;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	private List<Trader> listTraders;
	private List<Transaction> listTransaction;
	
	public Principal(List<Trader> listTraders, List<Transaction> listTransaction) {
		super();
		this.listTraders = new ArrayList<>();
		this.listTransaction = new ArrayList<>();
	}
	public List<Trader> getListTraders() {
		return listTraders;
	}
	public void setListTraders(List<Trader> listTraders) {
		this.listTraders = listTraders;
	}
	public List<Transaction> getListTransaction() {
		return listTransaction;
	}
	public void setListTransaction(List<Transaction> listTransaction) {
		this.listTransaction = listTransaction;
	}
	@Override
	public String toString() {
		return "Principal [listTraders=" + listTraders + ", listTransaction=" + listTransaction + "]";
	}
	
	//Filtrar lista por año y oredenarla de menor a mayor valor, 1ra pregunta
	public List<Transaction> transaccionesAnioOrdenarValor(Calendar fechaBusqueda) {
		return listTransaction.stream()
				.filter(lt -> lt.getCalendarYear() == fechaBusqueda.get(Calendar.YEAR))
				.sorted(Comparator.comparingDouble(Transaction::getValue))
				.collect(Collectors.toList());
	}
	
	//Obtener ciudades de todos los traders 2da pregunta
	public List<String> obtenerCiudadListaTraders(){
		return listTraders.stream()
				.map(Trader::getCity)
				.collect(Collectors.toList());
	}
	
	
	//Obtener traders de una ciudad especifica 3ra pregunta
	public List<Trader> filtrarCiudadOrdenarNombre(String city){
		return listTraders.stream().filter(lt -> lt.getCity().equals(city))
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
	}
	
	//Ordenar lista de trader por nombre 4ta pregunta
	public String ordenarListaNombre(){
		return listTraders.stream()
				.map(Trader::getName)
				.sorted()
				.collect(Collectors.joining(", "));
	}
	
	//¿Hay algú vendedor de milan? 5ta pregunta 
	public boolean isCiudadTraderMilan(String ciudad) {
		return listTraders.stream().anyMatch(lt -> lt.getCity().equalsIgnoreCase(ciudad));
	}
	
	//Imprimir transacciones de trader de cambridge 6ta pregunta
	public void imprimirTransaccionesCiudadEspecifica(String ciudad) {
		listTransaction.stream()
		.filter(lt -> lt.getTrader().getCity().equalsIgnoreCase(ciudad))
		.forEach(System.out::println);
	}
	
	//valor más grande 7ma pregunta
	public double devolverValorMayorTransaction() {
		return listTransaction.stream()
				.mapToDouble(i -> i.getValue())
				.max()
				.getAsDouble();
	}
	
	//Transaction valor mas pequeño 8va pregunta
	public Optional<Transaction> transactionMenorValor() {
		return listTransaction.stream()
				.min(Comparator.comparingDouble(Transaction::getValue));
	}
}
