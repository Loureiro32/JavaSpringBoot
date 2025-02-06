package com.Mindera.FirstJavaApi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "firstName")
    private String fistName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "accountStatus")
    private Boolean accountStatus;

    @Column
    private int age;
}
