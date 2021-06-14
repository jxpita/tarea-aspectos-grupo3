package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class ObserverController {

    @FXML
    private AnchorPane container;
    @FXML
    private Button turquesa;
    @FXML
    private Button carmin;
    @FXML
    private Button morado;

    @FXML
    public void fondoTurquesa(ActionEvent evento) {
        container.setStyle("-fx-background-color: #5DC1B9");
    }

    @FXML
    public void fondoCarmin(ActionEvent evento) {
        container.setStyle("-fx-background-color: #E51A4C");
    }

    @FXML
    public void fondoMorado(ActionEvent evento) {
        container.setStyle("-fx-background-color: #4C2882");
    }

}
