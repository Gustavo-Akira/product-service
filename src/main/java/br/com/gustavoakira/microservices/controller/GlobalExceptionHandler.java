package br.com.gustavoakira.microservices.controller;

import br.com.gustavoakira.microservices.exception.ErrorDetails;
import br.com.gustavoakira.microservices.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundHandler(ResourceNotFoundException ex, WebRequest request){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorDetails(ex.getMessage(),request.getDescription(false)));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> resourceNotFoundHandler(Exception ex, WebRequest request){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorDetails(ex.getMessage(),request.getDescription(false)));
    }
}
