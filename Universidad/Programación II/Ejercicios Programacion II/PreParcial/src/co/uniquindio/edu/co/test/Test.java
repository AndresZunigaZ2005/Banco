package co.uniquindio.edu.co.test;

import co.uniquindio.edu.co.model.Biblioteca;
import co.uniquindio.edu.co.model.Cargo;
import co.uniquindio.edu.co.model.DetallePrestamo;
import co.uniquindio.edu.co.model.Empleado;
import co.uniquindio.edu.co.model.Estudiante;
import co.uniquindio.edu.co.model.Libro;
import co.uniquindio.edu.co.model.NotFoundBookException;
import co.uniquindio.edu.co.model.Prestamo;
import co.uniquindio.edu.co.model.tipoLibro;

public class Test {
	
	public static void main(String [] args) {
		
		Biblioteca bibliotecaUq = new Biblioteca("Biblioteca UQ", "Calle 47 #25-50 bloque 1 apto 501", "3218861990");
		
		String estudiante1 = "";
		try {
			estudiante1 = bibliotecaUq.crearEstudiante("Andrés", "Zúñiga", 17, "Ing sistemas", "Activo", "1094889063");
		}catch (Exception e) {
			estudiante1 = e.getMessage();
		}
		System.out.println(estudiante1);
		
		String estudiante2 = "";
		try {
			estudiante2 = bibliotecaUq.crearEstudiante("Andrés", "Zúñiga", 17, "Ing sistemas", "Activo", "1094889063");
		}catch (Exception e) {
			estudiante2 = e.getMessage();
		}
		System.out.println(estudiante2);
		for (Estudiante estudiante : bibliotecaUq.getListaEstudiantes()) {
			System.out.println(estudiante);
		}
		
		System.out.println("\n\n");
									
		String libro1="";
		try {
			libro1 = bibliotecaUq.añadirLibro("8201845267309", "Steve Jobs: La manzana", "gabo", tipoLibro.Biografías);
		}catch (Exception e) {
			libro1 = e.getMessage();
		}
		System.out.println(libro1);
		
		String libro2="";
		try {
			libro2 = bibliotecaUq.añadirLibro("8201845267309", "Steve Jobs: La manzana", "gabo", tipoLibro.Biografías);
		}catch (Exception e) {
			libro2 = e.getMessage();
		}
		System.out.println(libro2);
		
		String libro3="";
		try {
			libro3 = bibliotecaUq.añadirLibro("8201845267310", "Steve Jobs: La manzana", "gabo", tipoLibro.Biografías);
		}catch (Exception e) {
			libro3 = e.getMessage();
		}
		System.out.println(libro3);
		
		String libro4="";
		try {
			libro4 = bibliotecaUq.añadirLibro("3437852978512", "Una brevisima historia de tiempo", "Stephen Hawkings", tipoLibro.Científicos);
		}catch (Exception e) {
			libro4 = e.getMessage();
		}
		System.out.println(libro4);
		
		String libro5="";
		try {
			libro5 = bibliotecaUq.añadirLibro("6910672891843", "La neurociencia y la toma de decisiones en el adolescente", "María del Sol Plaza", tipoLibro.Monografías);
		}catch (Exception e) {
			libro5 = e.getMessage();
		}
		System.out.println(libro5);		
		for (Libro libro : bibliotecaUq.getListaLibros()) {
			System.out.println(libro);
		}
		
		System.out.println("\n\n");
										
		String empleado1="";
		try {
			empleado1 = bibliotecaUq.contratarEmpleado("Jairo Pérez", "723763267", 10000, 3, Cargo.PROFESIONAL);
		}catch (Exception e) {
			empleado1 = e.getMessage();
		}
		System.out.println(empleado1);
		String empleado2="";
		try {
			empleado2 = bibliotecaUq.contratarEmpleado("Kola de baca", "34587i332", 8000, 1, Cargo.TECNICO);
		}catch (Exception e) {
			empleado2 = e.getMessage();
		}
		System.out.println(empleado2);
		String empleado3="";
		try {
			empleado3 = bibliotecaUq.contratarEmpleado("Pepito Antonio", "17421283", 8000, 5, Cargo.TECNICO);
		}catch (Exception e) {
			empleado3 = e.getMessage();
		}
		System.out.println(empleado3);
		String empleado4="";
		try {
			empleado4 = bibliotecaUq.contratarEmpleado("Robinson Arias", "184981298", 25000, 20, Cargo.AUXILIAR);
		}catch (Exception e) {
			empleado4 = e.getMessage();
		}
		System.out.println(empleado4);
		for (Empleado empleado : bibliotecaUq.getListaEmpleados()) {
			System.out.println(empleado);
		}
		
		System.out.println("\n\n");
		
		Libro buscarLibro1 = new Libro();	
		try {
			buscarLibro1 = bibliotecaUq.buscarLibro("8201845267309");
		} catch (Exception e) {
			System.out.println("Error en la busqueda del libro");
			e.printStackTrace();
		}
		Libro buscarLibro2 = new Libro();
		try {
			buscarLibro2 = bibliotecaUq.buscarLibro("3437852978512");
		} catch (Exception e) {
			System.out.println("Error en la busqueda del libro");
			e.printStackTrace();
		}
		DetallePrestamo detallePrestamo1 = new DetallePrestamo(2, "82982470921", 2, buscarLibro1);
		DetallePrestamo detallePrestamo2 = new DetallePrestamo(1, "6910672891843", 3, buscarLibro2);
		int dias = 10;
		double total = 0;
		Prestamo prestamo1 = new Prestamo("15/03/2023", total, dias, bibliotecaUq.buscarEmpleado("17421283"));
		prestamo1.getListaDetallesPrestamos().add(detallePrestamo1);
		prestamo1.getListaDetallesPrestamos().add(detallePrestamo2);
		for (DetallePrestamo detalles : prestamo1.getListaDetallesPrestamos()) {
			total+= detalles.getSubTotal()*detalles.getCantidad()*dias;
		}
		prestamo1.setTotal(total);
		System.out.println(prestamo1.toString());
		
		/*Estudiante buscarEstudiante1 = new Estudiante();	
		try {
			buscarEstudiante1 = bibliotecaUq.obtenerEstudiante("1094889063");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String titulo1 = "La neurociencia y la toma de decisiones en el adolescente";
			String isbn = "6910672891843";
			Prestamo prestamo1 = empleado3.crearPrestamo(buscarEstudiante1, titulo1, isbn);
		}catch (Exception e) {
			// TODO: handle exception
		}*/
	}
}
