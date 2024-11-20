package com.rohan.esd_yummyapp.repo;

import com.rohan.esd_yummyapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmail(String email);
}