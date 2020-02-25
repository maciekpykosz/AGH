module lesson8_Serialization {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;

    opens canban;
    opens canban.controller;
    opens canban.model;
    opens canban.view;
}