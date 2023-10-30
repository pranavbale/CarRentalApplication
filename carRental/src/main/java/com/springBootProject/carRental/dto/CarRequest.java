package com.springBootProject.carRental.dto;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@ToString
public class CarRequest {

    @NotNull(message = "Owner Name Must Be Present")
    private String ownerName;
    @NotNull(message = "Car Number MustBe Entered")
    private String carNumber;
    private Integer noOfSeats;
    private String typeOfCar;
}
