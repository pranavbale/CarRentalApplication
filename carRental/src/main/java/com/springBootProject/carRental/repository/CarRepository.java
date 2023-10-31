package com.springBootProject.carRental.repository;

import com.springBootProject.carRental.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository< Car,Long > {
}
