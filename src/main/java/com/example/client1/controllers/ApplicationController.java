package com.example.client1.controllers;

import com.example.client1.Application;
import com.example.client1.Entity.BookEntity;
import com.example.client1.Utils.HTTPUtils;
import com.example.client1.response.BookListResponse;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.IOException;

public class ApplicationController {
    public static ObservableList<BookEntity> booksData = FXCollections.observableArrayList();
    HTTPUtils http = new HTTPUtils();
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
    private void initialize() throws Exception {
        BookListResponse book = http.get("http://localhost:2825/api/v1/book/all", "all");
        for (int i = 0;i<book.data.size();i++) booksData.add(book.data.get(i));
        bookName.setCellValueFactory(new PropertyValueFactory<BookEntity,String>("tittle"));
        bookAuthor.setCellValueFactory(new PropertyValueFactory<BookEntity,String>("author"));
        bookPublisher.setCellValueFactory(new PropertyValueFactory<BookEntity,String>("publisher"));
        bookYear.setCellValueFactory(new PropertyValueFactory<BookEntity,String>("yearPub"));
        bookChapter.setCellValueFactory(new PropertyValueFactory<BookEntity,String>("kind"));
        tableBooks.setItems(booksData);
    }
z
    @FXML
   private Button is;
    @FXML
    void is(ActionEvent event) {
}

    @FXML
    private Button add;



}
