package co.edu.uniquindio.pr2.application;

import java.io.IOException;

import co.edu.uniquindio.pr2.controller.RegistrarClienteViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{

	private Stage primaryStage;
	private Application application;
	@Override
	public void start(Stage primaryStage) {

			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Empresa de Energía");
			this.primaryStage.setResizable(false);
			mostrarVentanaPrincipal();

		}

	private void mostrarVentanaPrincipal() {

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../view/RegistrarClienteView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			RegistrarClienteViewController registrarClienteViewController = loader.getController();
			registrarClienteViewController.setApplication(application);


			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		launch(args);
	}
}
