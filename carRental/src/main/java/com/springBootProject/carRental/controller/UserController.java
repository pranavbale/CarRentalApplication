package com.springBootProject.carRental.controller;

import com.springBootProject.carRental.dto.UserRequest;
import com.springBootProject.carRental.entity.User;
import com.springBootProject.carRental.exception.UserNotFoundException;
import com.springBootProject.carRental.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    private ResponseEntity<User> addUser(@RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(userService.addUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    private ResponseEntity<List<User>> viewAllUser() {
        return ResponseEntity.ok(userService.viewAllUser());
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<User> findUserById(@PathVariable Long id) throws UserNotFoundException {
        return ResponseEntity.ok(userService.findUserById(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> deleteUser(@PathVariable Long id) throws UserNotFoundException {
        userService.deleteUser(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

}
