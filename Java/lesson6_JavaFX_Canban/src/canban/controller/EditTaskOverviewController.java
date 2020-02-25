package canban.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import canban.model.Task;
import canban.model.taskPriority;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class EditTaskOverviewController implements Initializable {
    @FXML
    private TextField title;
    @FXML
    private TextArea description;
    @FXML
    private ChoiceBox<taskPriority> priority;
    @FXML
    private DatePicker date;
    @FXML
    private Button editButton;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        priority.getItems().setAll(taskPriority.values());
    }

    public Task editTask(){
        Task tmp = new Task(title.getText(),priority.getValue(),
                date.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")),description.getText());
        return tmp;

    }
}
