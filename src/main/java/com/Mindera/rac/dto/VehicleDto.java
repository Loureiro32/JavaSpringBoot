package com.Mindera.rac.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VehicleDto {

    @NotNull(message = "Must have plate")
    private String plate;

    @NotNull
    private Boolean vehicleStatus;

    @NotNull
    private String brand;

    @NotNull
    private String color;

    private AccountDto account;

}
