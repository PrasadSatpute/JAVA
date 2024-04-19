package com.microservice.user.service.exceptions;

public class ResorceNotFoundException extends RuntimeException{
    public ResorceNotFoundException(){
        super("Resource not found on server");
    }

    public ResorceNotFoundException(String message){
        super(message);
    }
}
