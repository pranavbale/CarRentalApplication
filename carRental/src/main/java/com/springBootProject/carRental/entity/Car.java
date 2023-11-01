package com.springBootProject.carRental.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@ToString
public class Car {

    @Id
    @GeneratedValue
    private Long carId;
    private String ownerName;
    private String carNumber;
    private Integer noOfSeats;
    private String typeOfCar;
    
}
