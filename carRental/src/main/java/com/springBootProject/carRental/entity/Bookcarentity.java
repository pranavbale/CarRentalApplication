package com.springBootProject.carRental.entity;



import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class Bookcarentity {

    @Id
    @GeneratedValue
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

   

    private Date bookingDate;
    private Date returnDate;

  
}
