package com.springBootProject.carRental.exception;

import org.apache.logging.log4j.message.Message;

public class UserNotFoundException extends Exception{

    UserNotFoundException() {
        super();
    }

    UserNotFoundException(String message) {
        super(message);
    }
}
