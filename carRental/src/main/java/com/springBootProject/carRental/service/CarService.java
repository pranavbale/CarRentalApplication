package com.springBootProject.carRental.service;

import com.springBootProject.carRental.dto.CarRequest;
import com.springBootProject.carRental.entity.Car;
import com.springBootProject.carRental.exception.CarNotFoundException;
import com.springBootProject.carRental.repository.CarRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;


    public Car creatCar(CarRequest carRequest) {
        Car car=Car.build(Long.valueOf(0),carRequest.getOwnerName(),carRequest.getCarNumber(),carRequest.getNoOfSeats(),carRequest.getTypeOfCar());
        return carRepository.save(car);
    }

    public List<Car> findAllCar() {
        return (List<Car>) carRepository.findAll();
    }

    public Car findCarByID(Long id) throws CarNotFoundException {
        Optional<Car> optionalCar=carRepository.findById(id);
        if (optionalCar.isPresent()){
            Car car = optionalCar.get();
            return car;
        }else {
            throw new CarNotFoundException("Car Is Not Found Having ID " +id);
        }
    }

    public void deleteCarById(Long id) throws CarNotFoundException {
        Optional<Car> optionalCar=carRepository.findById(id);
        if (optionalCar.isPresent()){
            Car car = optionalCar.get();
            carRepository.delete(car);
        }else {
            throw new CarNotFoundException("Car Is Not Found Having ID " +id);
        }
    }

    public Car updateCar(Car newCar, Long id) throws CarNotFoundException {
        Optional<Car> optionalCar=carRepository.findById(id);
        if (optionalCar.isPresent()){
            Car oldCar=optionalCar.get();

            oldCar.setCarNumber(newCar.getCarNumber());
            oldCar.setOwnerName(newCar.getOwnerName());
            oldCar.setNoOfSeats(newCar.getNoOfSeats());
            oldCar.setTypeOfCar(newCar.getTypeOfCar());

            return carRepository.save(oldCar);

        }else {

            throw new CarNotFoundException("Car Is Not Found Having ID " +id);
        }
    }
}
