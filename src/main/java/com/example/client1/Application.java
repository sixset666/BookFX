package com.example.client1;

import com.example.client1.Entity.BookEntity;
import com.example.client1.controllers.ApplicationController;
import com.example.client1.controllers.EditBookController;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        stage.setTitle("LibraryApp");
        stage.setScene(scene);
        ApplicationController controller = fxmlLoader.getController();
        stage.show();

    }

    public static boolean showPersonEditDialog() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Application.class.getResource("EditBook.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Реадктирование книги");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            EditBookController controller = loader.getController();

//            controller.setDialogStage(dialogStage);
//            controller.setLabels(bookObj, id);
//            dialogStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
            return false;

        }

        return false;
    }




    public static void main(String[] args) {
        launch();
    }
}