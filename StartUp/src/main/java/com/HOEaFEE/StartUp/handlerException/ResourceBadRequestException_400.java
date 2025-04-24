package com.HOEaFEE.StartUp.handlerException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceBadRequestException_400 extends RuntimeException{

    public ResourceBadRequestException_400(String message) {
        super(message);
    }
}
