package application;

import java.io.IOException;
import java.net.URL;
import co.edu.uniquindio.bank.controllers.CuentaAhorrosController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Main extends Application {

	private Stage primaryStage;
	private Application application;
	@Override
	public void start(Stage primaryStage) throws Exception {

		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Banco");
		this.primaryStage.setResizable(false);
		mostrarVentanaPrincipal();
	}

	private void mostrarVentanaPrincipal() {

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../view/CuentaAhorros.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			CuentaAhorrosController cuentaAhorrosController = loader.getController();
			cuentaAhorrosController	.setApplication(application);


			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
        launch(args);
    }




}
