package com.example.client1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class BookModel {
    private String title;
    private String fio;
    private String publisher;
    private int year;
    private String kind;
    private String AuthorName;
    private String AuthorSurname;
    private String AuthorLastname;
    private String PublisherName;
    private String PublisherCity;
}
