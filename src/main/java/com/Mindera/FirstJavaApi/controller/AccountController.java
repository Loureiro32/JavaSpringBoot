package com.Mindera.FirstJavaApi.controller;


import com.Mindera.FirstJavaApi.entity.Account;
import com.Mindera.FirstJavaApi.repository.AccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Account")
public class AccountController {
    private final AccountRepository repository;


    public AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public void createAccount(@RequestBody Account account){
        repository.save(account);
    }

    @GetMapping
    public List<Account> getAllAccount(){
        return repository.findAll();
    }


}
