package com.springBootProject.carRental.service;

import com.springBootProject.carRental.dto.BookCarRequest;
import com.springBootProject.carRental.entity.BookCar;
import com.springBootProject.carRental.entity.Car;
import com.springBootProject.carRental.exception.CarNotFoundException;
import com.springBootProject.carRental.repository.BookCarRepository;
import com.springBootProject.carRental.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookCarService {

    @Autowired
    BookCarRepository bookCarRepository;

    @Autowired
    CarRepository carRepository;

    public BookCar addBooking(BookCarRequest bookCarRequest) throws CarNotFoundException {

        BookCar bookcar = BookCar.build(Long.valueOf(0), bookCarRequest.getBookDate(), bookCarRequest.getStartDate(), bookCarRequest.getEndDate(), bookCarRequest.getCar());
        Optional<Car> carOptional = carRepository.findById(bookcar.getCar().getCarId());

        if (!carOptional.isPresent()) {
            throw new CarNotFoundException("Car is not present with id " + bookcar.getCar().getCarId());
        }

        return bookCarRepository.save(bookcar);
    }
}
