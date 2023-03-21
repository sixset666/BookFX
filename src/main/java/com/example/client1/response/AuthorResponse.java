package com.example.client1.response;

import com.example.client1.Entity.AuthorEntity;

public class AuthorResponse extends BaseResponse {
    public AuthorResponse(boolean success, String message, AuthorEntity author) {
        super(success, message);
        this.author = author;
    }
    public AuthorResponse(AuthorEntity author) {super(true, "Author Data");}
    private AuthorEntity author;
}
