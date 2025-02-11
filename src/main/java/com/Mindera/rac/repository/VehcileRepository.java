package com.Mindera.rac.repository;

import com.Mindera.rac.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehcileRepository extends JpaRepository<Vehicle, Integer> {

    boolean existsByName(String plate);

}
