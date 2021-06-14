package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		try {
			AnchorPane root = new AnchorPane();
			Scene scene = new Scene(root, 600, 400);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Patr�n Observer implementado con AspectJ");
			stage.show();
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
