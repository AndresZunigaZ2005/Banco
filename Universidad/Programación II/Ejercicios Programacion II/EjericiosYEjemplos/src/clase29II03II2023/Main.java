package clase29II03II2023;

public class Main {

	public static void main(String[] args) {
		
		Ejemplo numero1 = new Ejemplo();
		
		InterfaceA interfaceA1 = new InterfaceA() {
			
			@Override
			public void metodo(String id) {
				System.out.println("Hola Mundo");
				
			}
		};
		interfaceA1.metodo("");
	
		InterfaceA interfaceA2 = new InterfaceA() {
		
			@Override
			public void metodo(String id) {
				System.out.println("Hola mundo");
			
			}
		};
		interfaceA2.metodo("");
	
		InterfaceA interfaceA3 = new InterfaceA() {
		
			@Override
			public void metodo(String id) {
				System.out.println("Chao mundo");
		
			}
		};
		interfaceA3.metodo("");
	}
}


