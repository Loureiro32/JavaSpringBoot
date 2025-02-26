package com.Mindera.rac.service;

import com.Mindera.rac.entity.Account;
import com.Mindera.rac.entity.Vehicle;
import com.Mindera.rac.repository.AccountRepository;
import com.Mindera.rac.repository.VehcileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehcileRepository vehcileRepository;
    AccountRepository accountRepository;

    public List<Vehicle> getVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        this.vehcileRepository.findAll().forEach(vehicles::add);
        return vehicles;
    }

    public void saveOrCreateVehicles(Vehicle vehicle) {
        if (this.vehcileRepository.existsByPlate(vehicle.getPlate())) {
            throw new IllegalStateException("Vehicle Already registered");
        }
        this.vehcileRepository.save(vehicle);
    }

    public Vehicle patchVehicleStatusTrue(Integer id, Boolean value) {
        Vehicle vehicle = this.vehcileRepository.findById(id).orElseThrow(() -> new RuntimeException("Vehicle not found"));
        vehicle.setVehicleStatus(value);
        return this.vehcileRepository.save(vehicle);
    }

    public Vehicle pathVehicleStatusFalse(Integer id, Boolean value) {
        Vehicle vehicle = this.vehcileRepository.findById(id).orElseThrow(() -> new RuntimeException("Vehicle Not Found"));
        vehicle.setVehicleStatus(value);
        return this.vehcileRepository.save(vehicle);
    }

    public void associateVehicleToAccount(Integer accountId, Vehicle vehicle) {
        if (!accountRepository.existsById(accountId)) {
            throw new RuntimeException("Account not found");
        }

        if (vehicle.getId() == null) {
            vehcileRepository.save(vehicle);
        }
        vehcileRepository.associateVehicleToAccount(accountId, vehicle.getId());
    }

    public List<Account> getDeactivatedAccountsWithActiveVehicles() {
        return vehcileRepository.findDistinctAccountByVehicleStatusTrueAndAccountAccountStatusFalse();
    }

    public List<String> getActiveVehiclePlatesByDeactivatedAccounts() {
        return vehcileRepository.findPlateByVehicleStatusTrueAndAccountAccountStatusFalse();
    }
}
