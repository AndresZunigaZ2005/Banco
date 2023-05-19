package co.uniquindio.edu.co.model;

public class Libro {

	private String isbn;
	private String titulo;
	private String autor;
	private tipoLibro tipoLibro;
	
	public Libro() {
		
	}
	
	/**
	 * 
	 * @param isbn
	 * @param titulo
	 * @param autor
	 */
	public Libro(String isbn, String titulo, String autor, tipoLibro tipoLibro) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.tipoLibro = tipoLibro;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	public tipoLibro getTipoLibro() {
		return tipoLibro;
	}

	public void setTipoLibro(tipoLibro tipoLibro) {
		this.tipoLibro = tipoLibro;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + "]";
	}
	
}
