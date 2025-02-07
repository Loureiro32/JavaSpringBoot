package com.Mindera.FirstJavaApi.service;

import com.Mindera.FirstJavaApi.entity.Vehicle;
import com.Mindera.FirstJavaApi.repository.VehcileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehcileRepository vehcileRepository;

    public List<Vehicle> getVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        this.vehcileRepository.findAll().forEach(vehicles::add);
        return vehicles;
    }

    public void saveOrCreateVehicles(Vehicle vehicle) {
        vehcileRepository.save(vehicle);
    }


}
