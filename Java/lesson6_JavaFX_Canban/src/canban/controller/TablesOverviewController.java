package canban.controller;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;
import canban.MainApp;
import canban.model.Task;
import canban.model.taskPriority;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TablesOverviewController implements Initializable {
    @FXML
    private ListView toDoListView;
    @FXML
    private ListView inProgressListView;
    @FXML
    private ListView doneListView;

    private MainApp mainApp;
    private static ObservableList<Task> toDoList = FXCollections.observableArrayList();
    public static ObservableList<Task> getToDoList() {
        return toDoList;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        toDoListView.getItems().add(new Task("English", taskPriority.HIGH,"22.04.2019","Exam is coming!"));
        toDoListView.getItems().add(new Task("Shopping",taskPriority.NORMAL,"23.04.2019","Beeeeeeer!"));
        toDoListView.getItems().add(new Task("Serialization",taskPriority.LOW,"20.05.2019","Project in Java."));

        inProgressListView.getItems().add(new Task("Canban",taskPriority.HIGH,"09.04.2019","Project in JavaFX."));

        doneListView.getItems().add(new Task("Dinner",taskPriority.LOW,"08.04.2019","Beeeeeeer!"));

        toolTip(toDoListView);
        toolTip(inProgressListView);
        toolTip(doneListView);
    }

    public void showNewTaskOverview() {
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/NewTaskOverview.fxml"));
            AnchorPane page = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("ADDING A NEW TASK");
            dialogStage.setScene(new Scene(page,400,600));
            dialogStage.showAndWait();
            updateToDo();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private void updateToDo(){
        toDoListView.getItems().removeAll(toDoList);
        toDoListView.getItems().addAll(toDoList);

    }

    private void showEditTaskOverview(ListView<Task> list){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/EditTaskOverview.fxml"));
            AnchorPane page = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("EDITING A TASK");
            dialogStage.initModality(Modality.WINDOW_MODAL);

            Scene scene = new Scene(page);
            dialogStage.setScene(scene);


            dialogStage.showAndWait();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private void toolTip(ListView<Task> list){
        list.setCellFactory(new Callback<ListView<Task>, ListCell<Task>>() {
            @Override
            public ListCell<Task> call(ListView<Task> param) {
                final Tooltip tooltip = new Tooltip();

                final ListCell<Task> cell = new ListCell<Task>() {

                    @Override
                    public void updateItem(Task item, boolean empty) {
                        super.updateItem(item, empty);

                        ContextMenu contextMenu = new ContextMenu();
                        MenuItem deleteitem = new MenuItem();
                        MenuItem edit = new MenuItem();
                        deleteitem.textProperty().bind(Bindings.format("DELETE"));
                        deleteitem.setOnAction(event -> list.getItems().remove(this.getItem()));
                        edit.textProperty().bind(Bindings.format("EDIT"));
                        edit.setOnAction(event -> showEditTaskOverview(list));
                        contextMenu.getItems().add(deleteitem);
                        contextMenu.getItems().add(edit);
                        this.setContextMenu(contextMenu);

                        setText(empty ? null : item.toString());

                        if (item != null) {
                            tooltip.setText(item.getDescription());
                            setTextFill(item.getTaskColor());
                            setTooltip(tooltip);
                        }
                    }
                };
                return cell;
            }
        });
    }

    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;

    }

    public void moveToProgress(){
        Task tmp = new Task((Task) toDoListView.getSelectionModel().getSelectedItem());
        toDoListView.getItems().remove(toDoListView.getSelectionModel().getSelectedItem());
        inProgressListView.getItems().add(tmp);

    }

    public void moveToDone(){
        Task tmp = new Task((Task) inProgressListView.getSelectionModel().getSelectedItem());
        inProgressListView.getItems().remove(inProgressListView.getSelectionModel().getSelectedItem());
        doneListView.getItems().add(tmp);
    }
}
