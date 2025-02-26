package com.Mindera.rac.repository;

import com.Mindera.rac.entity.Account;
import com.Mindera.rac.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehcileRepository extends JpaRepository<Vehicle, Integer> {

    boolean existsByPlate(String plate);

    @Query("UPDATE Vehicle v SET v.account.id = :accountId WHERE v.id = :vehicleId")
    void associateVehicleToAccount(@Param("accountId") Integer accountId, @Param("vehicleId") Integer vehicleId);

    List<Account> findDistinctAccountByVehicleStatusTrueAndAccountAccountStatusFalse();

    List<String> findPlateByVehicleStatusTrueAndAccountAccountStatusFalse();

}
