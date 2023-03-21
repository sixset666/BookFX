package com.example.client1.response;

import com.example.client1.Entity.PublisherEntity;
import lombok.Data;

@Data
public class PublisherResponse extends BaseResponse {
    public PublisherResponse(boolean success, String message, PublisherEntity publisher){
        super(success,message);
        this.publisher = publisher;
    }
    public PublisherResponse(PublisherEntity publisher) {super(true,"Publishing data");}
    private PublisherEntity publisher;
}
