package com.springBootProject.carRental.exception;

import org.apache.logging.log4j.message.Message;

public class UserNotFoundException extends Exception{

    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
