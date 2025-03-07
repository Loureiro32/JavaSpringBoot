package com.Mindera.rac.mapper;


import com.Mindera.rac.dto.VehicleDto;
import com.Mindera.rac.entity.Account;
import com.Mindera.rac.entity.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface VehicleMapper {

    VehicleMapper vehicleMapper = Mappers.getMapper(VehicleMapper.class);

    Vehicle vehicleDtoToVehicle(VehicleDto vehicleDto);

    VehicleDto vehicleToDto(Account account);

    //Vehicle vehicleUpdateDtoToVehicle(VehicleDto vehicleDto);

    List<VehicleDto> vehiclesToVehicleDtos(List<Vehicle> vehicleList);

    List<Vehicle> vehicleDtosToVehicles(List<VehicleDto> vehicleDtoList);

}
