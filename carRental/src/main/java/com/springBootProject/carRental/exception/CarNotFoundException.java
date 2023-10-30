package com.springBootProject.carRental.exception;

public class CarNotFoundException extends Exception{
    public CarNotFoundException (){

    }
    public CarNotFoundException (String message){
        super(message);
    }
}
