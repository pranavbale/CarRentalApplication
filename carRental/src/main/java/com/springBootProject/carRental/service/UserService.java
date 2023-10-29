package com.springBootProject.carRental.service;

import com.springBootProject.carRental.dto.UserRequest;
import com.springBootProject.carRental.entity.User;
import com.springBootProject.carRental.exception.UserNotFoundException;
import com.springBootProject.carRental.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(UserRequest userRequest) {
        User user = User.build(Long.valueOf(0), userRequest.getName(), userRequest.getEmail(), userRequest.getPassword(), userRequest.getNumber(), userRequest.getDrivingLicenceNumber(), userRequest.getAddress());
        return userRepository.save(user);
    }

    public List<User> viewAllUser() {
        return (List) userRepository.findAll();
    }

    public User findUserById(Long id) throws UserNotFoundException{
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            User  user = userOptional.get();
            return user;
        } else {
            throw new UserNotFoundException("This user is not present " + id);
        }
    }


    public void deleteUser(Long id) throws UserNotFoundException {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            userRepository.delete(user);
        } else {

            throw new UserNotFoundException("This user does not exist" + id);
        }
    }


    public User updateUser(Long id, User user) throws UserNotFoundException{
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            User oldUser = optionalUser.get();

            if (!oldUser.getName().equals(user.getName())) {
                oldUser.setName(user.getName());
            }

            if (!oldUser.getEmail().equals(user.getEmail())) {
                oldUser.setEmail(user.getEmail());
            }

            if (!oldUser.getPassword().equals(user.getPassword())) {
                oldUser.setPassword(user.getPassword());
            }

            if (!oldUser.getNumber().equals(user.getNumber())) {
                oldUser.setNumber(user.getNumber());
            }

            if (!oldUser.getDrivingLicenceNumber().equals(user.getDrivingLicenceNumber())) {
                oldUser.setDrivingLicenceNumber(user.getDrivingLicenceNumber());
            }

            if (!oldUser.getAddress().equals(user.getAddress())) {
                oldUser.setAddress(user.getAddress());
            }

            return userRepository.save(oldUser);
        } else {
            throw new UserNotFoundException("user is not present having Id " + id);
        }
    }
}
