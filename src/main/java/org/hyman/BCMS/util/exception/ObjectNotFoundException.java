package org.hyman.BCMS.util.exception;

public class ObjectNotFoundException extends RuntimeException{

    private final String message;


    public ObjectNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
