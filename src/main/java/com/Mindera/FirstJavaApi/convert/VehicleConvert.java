package com.Mindera.FirstJavaApi.convert;

import com.Mindera.FirstJavaApi.dto.VehicleDto;
import com.Mindera.FirstJavaApi.entity.Vehicle;

import java.util.List;

public class VehicleConvert {

    public static VehicleDto fromVehicleToVehicleDto(List<Vehicle> vehicles){
        return VehicleDto.builder().build();
    }

    public static Vehicle fromVehicleDtoToVehicle(VehicleDto vehicleDto){
        return Vehicle.builder().build();
    }


}
