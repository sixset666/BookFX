package com.example.client1.controllers;

import com.example.client1.Application;
import com.example.client1.Entity.BookEntity;
import com.example.client1.Utils.HTTPUtils;
import com.example.client1.response.BookListResponse;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationController {
    public static String api = "http://localhost:2825/api/v1/book/";

    public static ObservableList<BookEntity> booksData = FXCollections.observableArrayList();
    static HTTPUtils http = new HTTPUtils();
    static Gson gson = new Gson();
    @FXML
    public TableView<BookEntity> tableBooks;
    @FXML
    private TableColumn<BookEntity, String> bookName;
    @FXML
    private TableColumn<BookEntity, String> bookAuthor;
    @FXML
    private TableColumn<BookEntity, String> bookPublisher;
    @FXML
    private TableColumn<BookEntity, String> bookYear;
    @FXML
    private TableColumn<BookEntity, String> bookChapter;

    @FXML
    private Button is;

    @FXML
    void is(ActionEvent event) {
    }

    @FXML
    private Button add;

    @FXML
    private void initialize() throws Exception {
        getData();
        updateTable();
    }

    private void updateTable() throws Exception {
        bookName.setCellValueFactory(new PropertyValueFactory<BookEntity, String>("title"));
        bookPublisher.setCellValueFactory(new PropertyValueFactory<BookEntity, String>("publisher"));
        bookYear.setCellValueFactory(new PropertyValueFactory<BookEntity, String>("year"));
        bookChapter.setCellValueFactory(new PropertyValueFactory<BookEntity, String>( "kind"));
        bookAuthor.setCellValueFactory(new PropertyValueFactory<BookEntity, String>("author"));
        tableBooks.setItems(booksData);
    }
    @FXML
    public static void getData() throws Exception {
        String res = http.get(api, "all");
        System.out.println(res);

        JsonObject base = gson.fromJson(res, JsonObject.class);
        JsonArray dataArr = base.getAsJsonArray("data");

        for (int i = 0; i < dataArr.size(); i++) {
            BookEntity newBook = gson.fromJson(dataArr.get(i).toString(), BookEntity.class);
            booksData.add(newBook);

        }
    }
        @FXML
        public void isOkCliked (ActionEvent event) throws Exception {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Application.class.getResource("EditBook.fxml"));
            Scene scene = new Scene(loader.load(), 500, 300);
            Stage dialogStage = new Stage();
            dialogStage.setScene(scene);
            dialogStage.show();

        }

        @FXML
        public void goEdit (ActionEvent event) throws IOException {
            Stage newStage1 = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("EditAuthor.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 300);
            newStage1.setTitle("LibraryApp");
            newStage1.setScene(scene);
            newStage1.show();

        }

}
