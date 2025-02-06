package com.Mindera.FirstJavaApi.repository;

import com.Mindera.FirstJavaApi.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AccountRepository extends JpaRepository<Account, Integer> {
}
