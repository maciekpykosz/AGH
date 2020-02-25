package canban.controller;

import javafx.application.Platform;
import javafx.scene.control.Alert;

public class Controller {

    public void alertDialog(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("AUTHOR");
        alert.setHeaderText(null);
        alert.setContentText("Maciej Pykosz AGH");
        alert.showAndWait();
    }

    public void close(){
        Platform.exit();
    }
}
