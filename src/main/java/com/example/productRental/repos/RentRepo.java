package com.example.productRental.repos;

import com.example.productRental.models.Client;
import com.example.productRental.models.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepo extends JpaRepository<Rent, Long> {
}
