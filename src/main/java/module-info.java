module com.example.client1 {
    requires javafx.controls; requires javafx.fxml;
    requires lombok;
    requires okhttp3;

    requires com.google.gson;

    exports com.example.client1;
    exports com.example.client1.controllers;
    exports com.example.client1.Entity;
    opens com.example.client1.Entity to com.google.gson;
    exports com.example.client1.response;
    exports com.example.client1.service;
    exports com.example.client1.Utils;
    opens com.example.client1.controllers to javafx.fxml;

}