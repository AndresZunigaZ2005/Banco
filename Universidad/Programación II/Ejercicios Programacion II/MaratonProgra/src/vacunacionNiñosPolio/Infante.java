package vacunacionNiñosPolio;

public class Infante {

	private String nombre;
	private Genero genero;
	private boolean isVacunado;
	
	public Infante(String nombre, Genero genero, boolean isVacunado) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.isVacunado = isVacunado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public boolean getIsVacunado() {
		return isVacunado;
	}

	public void setVacunado(boolean isVacunado) {
		this.isVacunado = isVacunado;
	}
	
}
