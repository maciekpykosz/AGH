package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller {
    private DrawerTask task;

    @FXML
    private Canvas canvas;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private TextField textField;
    @FXML
    private Label label;

    @FXML
    public void handleRunButtonAction() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        if (textField.getText().length() > 0) {
            try {
                int amountOfPoints = Integer.parseInt(textField.getText());
                if (amountOfPoints > 0) {
                    task = new DrawerTask(gc, amountOfPoints);
                    progressBar.progressProperty().bind(task.progressProperty());
                    task.setOnSucceeded(event -> label.setText(Double.toString((Double) task.getValue())));
                    new Thread(task).start();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Too small value!");
                    alert.setHeaderText("Please enter correct value!");
                    alert.showAndWait();
                }
            } catch (NumberFormatException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Entered value is incorrect!");
                alert.setHeaderText("Please enter correct value!");
                alert.showAndWait();
            }
        }
    }

    public void handleStopButtonAction() {
        if (task!= null) {
            task.cancel();
        }
    }

    private void drawShapes(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }
}
