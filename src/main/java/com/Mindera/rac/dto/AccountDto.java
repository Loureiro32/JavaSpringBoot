package com.Mindera.rac.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountDto {

    @NotNull(message = "Must have first name")
    private String firstName;

    @NotNull(message = "Must have last name")
    private String lastName;

    @NotNull(message = "Must have Account Status")
    private Boolean accountStatus;

    @NotNull(message = "Must have age")
    private int age;

    List<VehicleDto> vehicleDtoList;

}
