package com.dh.Xplorando.exceptions;

public class BadRequestException extends Exception{
    public BadRequestException(String mensaje){
        super(mensaje);
    }
}
