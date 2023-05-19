package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Banco {
	private String nombre;
	private List<Transacciones> listaTransacciones = new ArrayList<Transacciones>();
	private List<trader> listaTraders = new ArrayList<trader>();
	public Banco() {
		super();
	}
	
	public Banco(String nombre, List<Transacciones> listaTransacciones, List<trader> listaTraders) {
		super();
		this.nombre = nombre;
		this.listaTransacciones = listaTransacciones;
		this.listaTraders = listaTraders;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Transacciones> getListaTransacciones() {
		return listaTransacciones;
	}
	public void setListaTransacciones(List<Transacciones> listaTransacciones) {
		this.listaTransacciones = listaTransacciones;
	}
	public List<trader> getListaTraders() {
		return listaTraders;
	}
	public void setListaTraders(List<trader> listaTraders) {
		this.listaTraders = listaTraders;
	}
	@Override
	public int hashCode() {
		return Objects.hash(listaTraders, listaTransacciones, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		return Objects.equals(listaTraders, other.listaTraders)
				&& Objects.equals(listaTransacciones, other.listaTransacciones) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", listaTransacciones=" + listaTransacciones + ", listaTraders="
				+ listaTraders + "]";
	}
	
	//* filtrar lista por anios
    public List<Transacciones> transaccionesAnio(Calendar fechaBusqueda) {
        return listaTransacciones.stream()
                .filter(transaccion -> transaccion.getYear() == fechaBusqueda.get(Calendar.YEAR))
                .sorted(Comparator.comparingDouble(Transacciones::getValor))
                .collect(Collectors.toList());
    }
    
    public Set<String> listaCiudadesTraders (){
    	return listaTraders.stream()
    			.map(trader::getCiudad)
    			.collect(Collectors.toSet());
    }
    
    public List<trader> listaTraderCiudad(String ciudad){
    	return listaTraders.stream()
    			.filter(traders -> traders.getCiudad().equals(ciudad))
    			.sorted(Comparator.comparing(trader::getNombre))
    			.collect(Collectors.toList());
    }
    public String listaTradersOrganizada(){
    	return listaTraders.stream()
    			.map(trader::getNombre)
    			.sorted()
    			.collect(Collectors.joining(", "));
    }
    public boolean estaEn (String ciudad) {
    	return listaTraders.stream()
    			.allMatch(trader -> trader.getCiudad().equalsIgnoreCase(ciudad));
    }
    public void TransaccionesEn(String ciudad) {
    	listaTransacciones.stream()
    		.filter(transaccion -> transaccion.getTrader().getCiudad().equalsIgnoreCase(ciudad))
    		.map(Transacciones::getValor)
    		.forEach(System.out::println);
    }
    public Double valorMasGrande () {
    	return listaTransacciones.stream()
    			.mapToDouble(Transacciones::getValor)
    			.max()
    			.orElse(0.0);
    }
    public Optional<Transacciones> valorMasPequeño () {
    	return listaTransacciones.stream()
    			.min(Comparator.comparingDouble(Transacciones::getValor)); 			
    }
}
