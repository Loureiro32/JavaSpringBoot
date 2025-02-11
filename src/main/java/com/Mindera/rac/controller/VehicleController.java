package com.Mindera.rac.controller;

import com.Mindera.rac.entity.Vehicle;
import com.Mindera.rac.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vehicle")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;


    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return this.vehicleService.getVehicles();
    }

    @PostMapping
    public void createVehicle(@RequestBody Vehicle vehicle) {
        this.vehicleService.saveOrCreateVehicles(vehicle);
    }


}
