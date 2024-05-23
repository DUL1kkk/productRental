package com.example.productRental.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "rentals")
@Data
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    @JoinTable(
            name = "operation_products",
            joinColumns = @JoinColumn(name = "operation_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client; // много операций-1 клиент

    @Column(name = "rental_start_date", nullable = false)
    private LocalDateTime rentalStartDate;

    @Column(name = "rental_end_date", nullable = false)
    private LocalDateTime rentalEndDate;

    @Column(name = "daily_rental_cost", nullable = false)
    private Integer dailyRentalCost;
}
