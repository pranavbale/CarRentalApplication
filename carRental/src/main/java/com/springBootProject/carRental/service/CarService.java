package com.springBootProject.carRental.service;

import com.springBootProject.carRental.dto.CarRequest;
import com.springBootProject.carRental.entity.Car;
import com.springBootProject.carRental.repository.CarRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;


    public Car creatCar(CarRequest carRequest) {
        Car car=Car.build(Long.valueOf(0),carRequest.getOwnerName(),carRequest.getCarNumber(),carRequest.getNoOfSeats(),carRequest.getTypeOfCar());
        return carRepository.save(car);
    }
}
