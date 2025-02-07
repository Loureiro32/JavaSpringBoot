package com.Mindera.FirstJavaApi.controller;

import com.Mindera.FirstJavaApi.entity.Vehicle;
import com.Mindera.FirstJavaApi.repository.VehcileRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Vehicle")
public class VehicleController {
    private final VehcileRepository repository;


    public VehicleController(VehcileRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public void createVehicle(@RequestBody Vehicle vehicle){
        repository.save(vehicle);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles(){
        return repository.findAll();
    }


}
