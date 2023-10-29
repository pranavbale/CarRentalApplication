package com.springBootProject.carRental.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@ToString
public class UserRequest {

    @NotNull(message = "username must be present")
    private String name;
    @Email(message = "Invalid email address")
    private String email;
    @NotNull(message = "Password mast be present or invalid password")
    private String password;
    @Pattern(regexp = "^\\d{10}$", message = "invalid mobile number")
    private String number;
    private String drivingLicenceNumber;
    private String address;
}
