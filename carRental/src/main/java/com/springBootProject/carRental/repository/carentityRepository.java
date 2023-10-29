
package com.springBootProject.carRental.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBootProject.carRental.entity.carentity;

@Repository
public interface carentityRepository extends JpaRepository<carentity, Long> {
    
}

