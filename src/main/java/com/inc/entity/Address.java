package com.inc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String name;
    private String street;
    private String zipCode;

    @ManyToOne
    private Customer customer;
}
