package com.springBootProject.carRental.service;

import com.springBootProject.carRental.repository.BookCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookCarService {

    @Autowired
    BookCarRepository bookCarRepository;
}
