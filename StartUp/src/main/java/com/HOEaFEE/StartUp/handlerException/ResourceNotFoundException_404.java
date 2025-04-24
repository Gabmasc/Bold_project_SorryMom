package com.HOEaFEE.StartUp.handlerException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException_404 extends RuntimeException{

    public ResourceNotFoundException_404(String message) {
        super(message);
    }
}
