package com.springBootProject.carRental.service;

import com.springBootProject.carRental.dto.UserRequest;
import com.springBootProject.carRental.entity.User;
import com.springBootProject.carRental.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(UserRequest userRequest) {
        User user = User.build(Long.valueOf(0), userRequest.getName(), userRequest.getEmail(), userRequest.getPassword(), userRequest.getNumber(), userRequest.getDrivingLicenceNumber(), userRequest.getAddress());
        return userRepository.save(user);
    }
}
