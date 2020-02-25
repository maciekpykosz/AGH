module lesson6_JavaFX_Canban {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;

    opens canban;
    opens canban.controller;
    opens canban.model;
    opens canban.view;
}