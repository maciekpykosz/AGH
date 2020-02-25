package canban.controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import canban.model.Task;
import canban.model.taskPriority;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;


public class NewTaskOverviewController implements Initializable {
    @FXML
    private TextField title;
    @FXML
    private TextArea description;
    @FXML
    private ChoiceBox<taskPriority> priority;
    @FXML
    private DatePicker date;
    @FXML
    private Button addButton;

    public void addTask() {

        Task task = new Task(title.getText(), priority.getValue(),
                date.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")),description.getText());
        TablesOverviewController.getToDoList().add(task);
        Stage stage = (Stage)addButton.getScene().getWindow();
        stage.show();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        priority.getItems().setAll(taskPriority.values());
    }
}
