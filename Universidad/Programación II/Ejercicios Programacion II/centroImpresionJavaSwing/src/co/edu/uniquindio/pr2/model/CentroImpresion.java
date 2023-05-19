package co.edu.uniquindio.pr2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CentroImpresion implements Serializable{

	private String nombre;
	private List<Impresora> listaImpresoraConectada;
	private List<Documento> listaDocumentos;
	
	public CentroImpresion(String nombre) {
		super();
		this.nombre = nombre;
		this.listaImpresoraConectada = new ArrayList<>();
		this.listaDocumentos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Impresora> getListaImpresoraConectada() {
		return listaImpresoraConectada;
	}

	public void setListaImpresoraConectada(List<Impresora> listaImpresoraConectada) {
		this.listaImpresoraConectada = listaImpresoraConectada;
	}

	public List<Documento> getListaDocumentos() {
		return listaDocumentos;
	}

	public void setListaDocumentos(List<Documento> listaDocumentos) {
		this.listaDocumentos = listaDocumentos;
	}

	@Override
	public String toString() {
		return "CentroImpresion [nombre=" + nombre + ", listaImpresoraConectada=" + listaImpresoraConectada + ", listaDocumento="
				+ listaDocumentos + "]";
	}
	
	public Impresora obtenerImpresora(String codigo) {
		Impresora impresoraEncontrada = null;
		for (Impresora impresora : listaImpresoraConectada) {
			if(impresora.getCodigo().equals(codigo)) {
				impresoraEncontrada = impresora;
			}
		}
		return impresoraEncontrada;
	}
	
	public void añadirImpresora(Impresora impresoraNueva) throws Exception{
		if(obtenerImpresora(impresoraNueva.getCodigo())!=null) {
			throw new Exception("Esta impresora ya existe, código repetido");
		}
		listaImpresoraConectada.add(impresoraNueva);
	}
	
	public void addDocImprimir(Documento documentoImprimir) {
		listaDocumentos.add(documentoImprimir);
	}
}
