package com.Mindera.FirstJavaApi.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class VehicleDto {

    private String plate;
    private String vehicleStatus;
    private String brand;
    private String color;
}
