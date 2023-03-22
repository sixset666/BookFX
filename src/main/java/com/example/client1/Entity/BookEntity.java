package com.example.client1.Entity;


import lombok.*;




@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class BookEntity {
    private String id;
    private String title;
    private String author;
    private String publishing;
    private String year;
    private String kind;

}
