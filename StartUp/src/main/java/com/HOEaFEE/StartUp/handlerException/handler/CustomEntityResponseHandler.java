package com.HOEaFEE.StartUp.handlerException.handler;

import com.HOEaFEE.StartUp.handlerException.ExceptionResponse;
import com.HOEaFEE.StartUp.handlerException.ResourceBadRequestException_400;
import com.HOEaFEE.StartUp.handlerException.ResourceNotFoundException_404;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomEntityResponseHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> handleAllException(Exception e, WebRequest request){
        ExceptionResponse response = new ExceptionResponse(
                new Date(),
                e.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ResourceNotFoundException_404.class)
    public ResponseEntity<ExceptionResponse> handleNotFoundException(Exception e, WebRequest request){
        ExceptionResponse response = new ExceptionResponse(
                new Date(),
                e.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ResourceBadRequestException_400.class)
    public ResponseEntity<ExceptionResponse> handleBadRequestException(Exception e, WebRequest request){
        ExceptionResponse response = new ExceptionResponse(
                new Date(),
                e.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
