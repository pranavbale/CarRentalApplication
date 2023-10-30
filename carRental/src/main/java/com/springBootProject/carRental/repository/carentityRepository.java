
package com.springBootProject.carRental.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springBootProject.carRental.entity.carentity;

@Repository
public interface carentityRepository extends CrudRepository<carentity, Long> {
    
}

