package br.com.gustavoakira.microservices.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String msg){
        super("Resource not exists with id " +msg);
    }
}
