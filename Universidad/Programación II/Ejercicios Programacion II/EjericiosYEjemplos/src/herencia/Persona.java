package herencia;

public class Persona {
	
	private String name;
	private int age;
	private String placeBirth;
	private String birthDay;
	private String ethnicity;
	private String genre;
	
	public Persona() {
		super();
	}
	/**
	 * 
	 * @param name
	 * @param age
	 * @param placeBirth
	 * @param birthDay
	 * @param ethnicity
	 * @param genre
	 */
	public Persona(String name, int age, String placeBirth, String birthDay, String ethnicity, String genre) {
		super();
		this.name = name;
		this.age = age;
		this.placeBirth = placeBirth;
		this.birthDay = birthDay;
		this.ethnicity = ethnicity;
		this.genre = genre;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlaceBirth() {
		return placeBirth;
	}
	public void setPlaceBirth(String placeBirth) {
		this.placeBirth = placeBirth;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getEthnicity() {
		return ethnicity;
	}
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
