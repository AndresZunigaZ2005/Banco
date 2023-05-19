package herencia;

public class Perro extends Animal {

	private String raza;
	private String placeBirth;
	private int age;
	
	public Perro() {
		super();
		
	}
	public Perro(String especie, String nombreCientifico, double promedioVida, 
			int cantidadPatas, double peso,	String color, String raza, 
			String placeBirth, int age) {
		super(especie, nombreCientifico, promedioVida, cantidadPatas, peso, color);
		this.raza = raza;
		this.placeBirth = placeBirth;
		this.age = age;
	}
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getPlaceBirth() {
		return placeBirth;
	}
	public void setPlaceBirth(String placeBirth) {
		this.placeBirth = placeBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
}
