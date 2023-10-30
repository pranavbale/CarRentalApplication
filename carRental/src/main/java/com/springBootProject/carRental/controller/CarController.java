package com.springBootProject.carRental.controller;

import com.springBootProject.carRental.dto.CarRequest;
import com.springBootProject.carRental.entity.Car;
import com.springBootProject.carRental.exception.CarNotFoundException;
import com.springBootProject.carRental.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("/creatCar")
    private ResponseEntity<Car> creatCar(@RequestBody CarRequest carRequest){
        return new ResponseEntity<>(carService.creatCar(carRequest), HttpStatus.CREATED);
    }
    @GetMapping("/findAll")
    private ResponseEntity<List<Car>> findAllCar(){
        return ResponseEntity.ok(carService.findAllCar());
    }

    @GetMapping("/findByID/{id}")
    private ResponseEntity<Car> findCarByID(@PathVariable Long id) throws CarNotFoundException {
        return ResponseEntity.ok(carService.findCarByID(id));
    }
    
}
