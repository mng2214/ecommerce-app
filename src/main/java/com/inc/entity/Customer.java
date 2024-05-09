package com.inc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String email;
    private String firstName;
    private String lastName;
    private String userName;

    @OneToOne(mappedBy = "customer")
    private Balance balance;

    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;
}
