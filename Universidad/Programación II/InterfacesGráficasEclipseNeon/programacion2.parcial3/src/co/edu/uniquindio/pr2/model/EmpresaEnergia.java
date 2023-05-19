package co.edu.uniquindio.pr2.model;

import java.util.*;

import co.edu.uniquindio.pr2.Exceptions.ClienteException;
import co.edu.uniquindio.pr2.Exceptions.FacturaException;

public class EmpresaEnergia {

	private List<Factura> listaFacturas;
	private List<Cliente> listaClientes;
	private static EmpresaEnergia empresaEnergia;

	public static EmpresaEnergia getInstance(List<Factura> listaFacturas, List<Cliente> listaClientes){
		if(empresaEnergia==null){
			empresaEnergia = new EmpresaEnergia(listaFacturas, listaClientes);
			return empresaEnergia;
		}
		return empresaEnergia;
	}

	private EmpresaEnergia() {
		// TODO Auto-generated constructor stub
	}
	private EmpresaEnergia(List<Factura> listaFacturas, List<Cliente> listaClientes) {
		super();
		this.listaFacturas = listaFacturas;
		this.listaClientes = listaClientes;
	}
	public List<Factura> getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(List<Factura> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public static EmpresaEnergia getEmpresaEnergia() {
		return empresaEnergia;
	}

	public static void setEmpresaEnergia(EmpresaEnergia empresaEnergia) {
		EmpresaEnergia.empresaEnergia = empresaEnergia;
	}

	@Override
	public String toString() {
		return "EmpresaEnergia [listaFacturas=" + listaFacturas + ", listaClientes=" + listaClientes + "]";
	}

	/*
	 * Metodos CRUD ClienteNatural
	 */
	public void aniadirClienteNatural(ClienteNatural nuevoCliente) throws ClienteException{
		if(!verificarClienteNatural(nuevoCliente)){
			listaClientes.add(nuevoCliente);
		}
		throw new ClienteException("El cliente ya existe");
	}

	public Cliente obtenerClienteNatural(ClienteNatural clienteObtener)throws ClienteException{
		Cliente obtenerCliente = null;
		obtenerCliente = (Cliente) listaClientes.stream().filter(c -> c.verificarClienteNatural(clienteObtener));
		return obtenerCliente;
	}

	public boolean verificarClienteNatural(ClienteNatural cliente){
		return listaClientes.stream().anyMatch(c -> c.verificarClienteNatural(cliente));
	}

	/**
	 * Metodos CRUD ClienteJuridico
	 */
	public void aniadirClienteJuridico(ClienteJuridico nuevoCliente) throws ClienteException{
		if(!verificarClienteJuridico(nuevoCliente)){
			listaClientes.add(nuevoCliente);
		}
		throw new ClienteException("El cliente ya existe");
	}

	public Cliente obtenerClienteJuridico(ClienteJuridico clienteObtener)throws ClienteException{
		Cliente obtenerCliente = null;
		obtenerCliente = (Cliente) listaClientes.stream().filter(c -> c.verificarClienteJuridico(clienteObtener));
		return obtenerCliente;
	}

	public boolean verificarClienteJuridico(ClienteJuridico cliente){
		return listaClientes.stream().anyMatch(c -> c.verificarClienteJuridico(cliente));
	}
	/**
	 * Metodos CRUD Factura
	 */
	public void crearFactura(Factura nuevaFactura) throws FacturaException{
		if(!verificarFactura(nuevaFactura)){
			listaFacturas.add(nuevaFactura);
		}
		throw new FacturaException("La factura ya existe");
	}

	public Factura obtenerFactura(Factura facturaObtener){
		if(verificarFactura(facturaObtener)){
			return (Factura)listaFacturas.stream().filter(f -> f.equals(facturaObtener));
		}
		return null;
	}

	public boolean verificarFactura(Factura verificarFactura){
		return listaFacturas.stream().anyMatch(f -> f.equals(verificarFactura));
	}
}
