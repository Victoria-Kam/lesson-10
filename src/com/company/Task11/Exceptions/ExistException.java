package com.company.Task11.Exceptions;

// - Проверить содержит ли номер документа последовательность abc.

public class ExistException extends Exception{

    public ExistException(String message){
        super(message);
    }
}
