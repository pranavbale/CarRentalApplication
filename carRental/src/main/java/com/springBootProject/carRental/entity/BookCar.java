package com.springBootProject.carRental.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@ToString
public class BookCar {

    @Id
    @GeneratedValue
    private Long bookId;
    private Date bookDate;
    private Date startDate;
    private Date EndDate;

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Car car;
}
