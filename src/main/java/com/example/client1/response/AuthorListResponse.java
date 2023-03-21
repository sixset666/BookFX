package com.example.client1.response;

import com.example.client1.Entity.AuthorEntity;
import lombok.Data;

import java.util.List;

@Data
public class AuthorListResponse extends BaseResponse {
    public AuthorListResponse(List<AuthorEntity> data){
        super(true,"Авторы");
        this.data = data;
    }
    private List<AuthorEntity> data;
}
