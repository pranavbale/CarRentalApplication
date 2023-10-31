package com.springBootProject.carRental.repository;

import com.springBootProject.carRental.entity.BookCar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCarRepository extends CrudRepository<BookCar, Long> {
}
