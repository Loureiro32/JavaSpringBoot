package com.Mindera.rac.repository;

import com.Mindera.rac.entity.Account;
import com.Mindera.rac.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehcileRepository extends JpaRepository<Vehicle, Integer> {

    boolean existsByPlate(String plate);

//    void associateVehicleToAccount(Integer accountId, Vehicle vehicle);
//
//    List<Account> findDeactivatedAccountsWithActiveVehicles();
//
//    List<String> findActiveVehiclePlatesByDeactivatedAccounts();
}
