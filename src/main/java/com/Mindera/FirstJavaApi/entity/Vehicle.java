package com.Mindera.FirstJavaApi.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Vehicle")
@Builder
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


}
