package herencia;

public class Empleado extends Persona{
	
	private double salary;
	private String employeePosition;
	private String email;
	private String phoneNumber;
	private String id;
	
	public Empleado() {
		super();
	}

	public Empleado(String name, int age, String placeBirth, String birthDay, 
			String ethnicity, String genre, double salary, String employeePosition, 
			String email, String phoneNumber, String id) {
		
		super(name, age, placeBirth, birthDay, ethnicity, genre);
		this.salary = salary;
		this.employeePosition = employeePosition;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
