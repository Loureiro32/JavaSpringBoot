package com.Mindera.FirstJavaApi.controller;


import com.Mindera.FirstJavaApi.entity.Account;
import com.Mindera.FirstJavaApi.repository.AccountRepository;
import com.Mindera.FirstJavaApi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Account")
public class AccountController {
    @Autowired
    private final AccountService accountService;


    public AccountController(AccountRepository repository, AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public long createAccount(@RequestBody Account account){
        this.accountService.saveOrCreateAccount(account);
        return account.getId();
    }

    @GetMapping
    public List<Account> getAllAccount(){
        return this.accountService.getAccounts();
    }


}
