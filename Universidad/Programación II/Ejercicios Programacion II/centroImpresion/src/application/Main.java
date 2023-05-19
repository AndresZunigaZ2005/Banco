package application;
	
import java.lang.StackWalker.StackFrame;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	
	public void cicloVidaJavaFx() {
		System.out.println("Metodo constructor() ");
	}
	
	public void init() {
		System.out.println("metodo init()");
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Label label1 = new Label("Hola mundo");
			StackPane root = new StackPane();
			root.getChildren().add(label1);
			
			Scene scene = new Scene(root,600,500);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Centro de impresion");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void stop() {
		System.out.println("Metodo stop");
	}
	public static void main(String[] args) {
		launch(args);
	}
}
