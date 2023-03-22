package com.example.client1.controllers;

import com.example.client1.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EditAuthorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        Stage newStage1 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        newStage1.setTitle("LibraryApp");
        newStage1.setScene(scene);
        newStage1.show();
    }

    @FXML
    void goSave(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }





}
