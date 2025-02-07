package com.Mindera.FirstJavaApi.controller;

import com.Mindera.FirstJavaApi.entity.Account;
import com.Mindera.FirstJavaApi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping
    public List<Account> getAllAccount() {
        return this.accountService.getAccounts();
    }

    @PostMapping
    public void createAccount(@RequestBody Account account) {
        this.accountService.saveOrCreateAccount(account);
    }


}
