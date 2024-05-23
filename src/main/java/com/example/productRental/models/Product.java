package com.example.productRental.models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "items")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "inventory_number", nullable = false, unique = true)
    private String inventoryNumber;

    @Column(name = "cost_per_day", nullable = false)
    private Integer cost_per_day;
}

