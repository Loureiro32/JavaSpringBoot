package com.Mindera.rac.dtos;

import jakarta.validation.constraints.NotBlank;

public class AccountDto {

    @NotBlank(message = "Must Have first Name")
    private String firstName;

    @NotBlank(message = "Must have last name")
    private String lastName;

    private Boolean accountStatus;

    private int age;
}
