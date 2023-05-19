package herencia;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		ArrayList<String>list= new ArrayList<>();
		list.add("Hola");
		list.add("2");
		
		ArrayList<String>list1= new ArrayList<>();
		list1.add("Hola");
		list1.add("2");

		if(list.equals(list1)) {
			System.out.println("Iguales");
		}
		else {
			System.out.println("Diferentes");
		}
	}

}
