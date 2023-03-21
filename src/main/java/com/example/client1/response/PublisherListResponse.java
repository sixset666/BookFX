package com.example.client1.response;

import com.example.client1.Entity.AuthorEntity;
import com.example.client1.Entity.PublisherEntity;
import lombok.Data;

import java.util.List;


@Data
public class PublisherListResponse extends BaseResponse {
    public  PublisherListResponse(List<PublisherEntity> data) {
        super(true,"Издательства");
        this.data = data;
    }
    private List<PublisherEntity> data;
}
