package com.example.productRental.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Documents")
@Data
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "passport_series", nullable = false, unique = true)
    private  Integer passport_series;
    @Column(name = "passport_number", nullable = false, unique = true)
    private Integer passport_number;

}
