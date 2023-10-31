package com.springBootProject.carRental.exception;

public class BookingNotFoundException extends Exception{
    public BookingNotFoundException () {

    }

    public BookingNotFoundException(String massage) {
        super(massage);
    }
}
