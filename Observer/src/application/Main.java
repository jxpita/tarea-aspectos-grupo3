package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Observer.fxml"));
			Scene scene = new Scene(root);
			stage.setTitle("Patrón Observer implementado con AspectJ");
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
		} catch(Exception ex) {
            System.out.println(ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}