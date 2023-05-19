package co.uniquindio.banco.application;

import java.util.Scanner;

import co.uniquindio.banco.exceptions.CuentaException;
import co.uniquindio.banco.model.CuentaAhorros;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		//		try {
		//			BorderPane root = new BorderPane();
		//			Scene scene = new Scene(root,400,400);
		//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		//			primaryStage.setScene(scene);
		//			primaryStage.show();
		//		} catch(Exception e) {
		//			e.printStackTrace();
		//		}



	}

	public static void main(String[] args) throws CuentaException {
		Scanner input = new Scanner(System.in);
		System.out.println("Cuenta de ahorros");
		System.out.println("Ingrese saldo inicial= $");
		float saldoInicialAhorros = input.nextFloat();
		System.out.print("Ingrese tasa de inter�s= ");
		float tasaAhorros = input.nextFloat();
		CuentaAhorros cuenta1 = new	CuentaAhorros(saldoInicialAhorros, tasaAhorros);
		System.out.print("Ingresar cantidad a consignar: $");
		float cantidadDepositar = input.nextFloat();
		cuenta1.consignar(cantidadDepositar);
		System.out.print("Ingresar cantidad a retirar: $");
		float cantidadRetirar = input.nextFloat();
		cuenta1.retirar(cantidadRetirar);
		cuenta1.extractoMensual();
		cuenta1.imprimir();
	}
}
