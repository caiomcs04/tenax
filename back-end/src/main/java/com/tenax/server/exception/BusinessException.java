package com.tenax.server.exception;
public class BusinessException extends RuntimeException{
    public BusinessException(String message){
        super(message);
    }
}