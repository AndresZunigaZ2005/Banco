package co.edu.uniquindio.model;

import java.util.*;

public class Agenda {

	private String nombre;
	private List<Contacto> listaContactos = new ArrayList<>();
	private List<Grupo> listaGrupos = new ArrayList<>();
	private List<Reunion> listaReuniones = new ArrayList<>();
	
	public Agenda(String nombre, List<Contacto> listaContactos, List<Grupo> listaGrupos, List<Reunion> listaReuniones) {
		super();
		this.nombre = nombre;
		this.listaContactos = listaContactos;
		this.listaGrupos = listaGrupos;
		this.listaReuniones = listaReuniones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Contacto> getListaContactos() {
		return listaContactos;
	}

	public void setListaContactos(List<Contacto> listaContactos) {
		this.listaContactos = listaContactos;
	}

	public List<Grupo> getListaGrupos() {
		return listaGrupos;
	}

	public void setListaGrupos(List<Grupo> listaGrupos) {
		this.listaGrupos = listaGrupos;
	}

	public List<Reunion> getListaReuniones() {
		return listaReuniones;
	}

	public void setListaReuniones(List<Reunion> listaReuniones) {
		this.listaReuniones = listaReuniones;
	}
	
	
}
