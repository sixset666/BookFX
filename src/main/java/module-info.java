module com.example.client1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires static lombok;
    requires com.google.gson;
    opens com.example.client1 to javafx.fxml;
    exports com.example.client1;
    exports com.example.client1.controllers;
    opens com.example.client1.controllers to javafx.fxml;
    requires annotations;

    requires okhttp3;

    exports com.example.client1.Entity;
    opens com.example.client1.Entity to com.google.gson;

    exports com.example.client1.response;

    opens com.example.client1.response to com.google.gson;

    exports com.example.client1.service;

    exports com.example.client1.Utils;

}