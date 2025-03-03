package com.Mindera.rac.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column
    private String plate;

    @Column
    private Boolean vehicleStatus;

    @Column
    private String brand;

    @Column
    private String color;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;
}
