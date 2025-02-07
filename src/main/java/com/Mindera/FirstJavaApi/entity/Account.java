package com.Mindera.FirstJavaApi.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
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
