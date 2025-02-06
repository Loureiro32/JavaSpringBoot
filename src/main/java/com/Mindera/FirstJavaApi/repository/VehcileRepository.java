package com.Mindera.FirstJavaApi.repository;

import com.Mindera.FirstJavaApi.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehcileRepository extends JpaRepository<Vehicle, Integer> {
}
