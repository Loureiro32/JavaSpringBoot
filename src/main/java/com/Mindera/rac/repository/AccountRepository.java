package com.Mindera.rac.repository;

import com.Mindera.rac.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    boolean existsByName(String name);

    List<Account> findByAccountStatusFalse();
}
