package com.springBootProject.carRental.controller;


import com.springBootProject.carRental.dto.BookCarRequest;
import com.springBootProject.carRental.entity.BookCar;
import com.springBootProject.carRental.exception.CarNotFoundException;
import com.springBootProject.carRental.service.BookCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookCar")
public class BookCarController {

    @Autowired
    BookCarService bookCarService;

    @PutMapping("/add")
    private ResponseEntity<BookCar> addBooking(@RequestBody BookCarRequest bookCarRequest) throws CarNotFoundException {
        return new ResponseEntity<>(bookCarService.addBooking(bookCarRequest), HttpStatus.CREATED);
    }
}
