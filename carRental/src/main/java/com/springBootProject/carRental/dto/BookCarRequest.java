package com.springBootProject.carRental.dto;

import com.springBootProject.carRental.entity.Car;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@ToString
public class BookCarRequest {

    private Date bookDate;
    private Date startDate;
    private Date EndDate;

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Car car;
}
