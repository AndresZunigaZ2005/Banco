package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;

public class Libro {
	
    private String titulo;
    private String autor;
    private String editorial;
    private ArrayList<Libro> listaLibro;
    
    public Libro() {
    	
    }
    /**
     * 
     * @param titulo
     * @param autor
     * @param editorial
     */
    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.listaLibro = new ArrayList<Libro>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

	public ArrayList<Libro> getListaLibro() {
		return listaLibro;
	}

	public void setListaLibro(ArrayList<Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + "]";
	}
    
	public boolean verificarAutor(String autor) {
		
		return getAutor().equals(autor);
	}
}
