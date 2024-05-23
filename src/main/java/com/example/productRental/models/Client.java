package com.example.productRental.models;


import jakarta.persistence.*;
import lombok.Data;

import javax.print.Doc;

@Entity
@Table(name = "clients")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "inn", nullable = false, unique = true)
    private Integer inn;
    @ManyToOne
    @JoinColumn(name = "document_id", nullable = false)
    private Document document; // много документов-1 клиент

    @Column(name = "address", nullable = false)
    private String Address;
}
