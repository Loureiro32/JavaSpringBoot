package com.Mindera.rac.controller;

import com.Mindera.rac.entity.Account;
import com.Mindera.rac.entity.Vehicle;
import com.Mindera.rac.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(path = "{getDeactivatedAccountWithActiveVehicle}")
    public List<Account> getDeactivatedAccountWithActiveVehicle() {
        return this.vehicleService.getDeactivatedAccountsWithActiveVehicles();
    }

    @GetMapping(path = "{getActiveVehiclesWithDeactivatedAccount}")
    public List<String> getActiveVehiclesWithDeactivatedAccount() {
        return vehicleService.getActiveVehiclePlatesByDeactivatedAccounts();
    }

    @PostMapping
    public void createVehicle(@RequestBody Vehicle vehicle) {
        this.vehicleService.saveOrCreateVehicles(vehicle);
    }

    @PostMapping("/associate/{accountId}")
    public ResponseEntity<?> associateVehicleToAccount(@PathVariable Integer accountId, @RequestBody Vehicle vehicle) {
        try {
            vehicleService.associateVehicleToAccount(accountId, vehicle);
            return new ResponseEntity<>("Vehicle successfully associated with account", HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("An unexpected error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping(path = "/{id}/true")
    public ResponseEntity<Vehicle> updateVehicleStatusTrue(@PathVariable Integer id) {
        return ResponseEntity.ok(this.vehicleService.patchVehicleStatusTrue(id, true));
    }

    @PatchMapping(path = "/{id}/false")
    public ResponseEntity<Vehicle> updateVehicleStatusFalse(@PathVariable Integer id) {
        return ResponseEntity.ok(this.vehicleService.pathVehicleStatusFalse(id, false));
    }
}
