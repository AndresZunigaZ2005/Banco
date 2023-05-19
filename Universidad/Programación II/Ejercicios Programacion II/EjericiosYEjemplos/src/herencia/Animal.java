package herencia;

public class Animal {
	
	private String especie;
	private String nombreCientifico;
	private double promedioVida;
	private int cantidadPatas;
	private double peso;
	private String color;
	
	public Animal() {
		super();
	}	
	/**
	 * 
	 * @param especie
	 * @param nombreCientifico
	 * @param promedioVida
	 * @param cantidadPatas
	 * @param peso
	 * @param color
	 */
	public Animal(String especie, String nombreCientifico, double promedioVida, int cantidadPatas, double peso, String color) {
		super();
		this.especie = especie;
		this.nombreCientifico = nombreCientifico;
		this.promedioVida = promedioVida;
		this.cantidadPatas = cantidadPatas;
		this.peso = peso;
		this.color = color;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public double getPromedioVida() {
		return promedioVida;
	}

	public void setPromedioVida(double promedioVida) {
		this.promedioVida = promedioVida;
	}

	public int getCantidadPatas() {
		return cantidadPatas;
	}

	public void setCantidadPatas(int cantidadPatas) {
		this.cantidadPatas = cantidadPatas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
