package com.Mindera.FirstJavaApi.service;


import com.Mindera.FirstJavaApi.entity.Account;
import com.Mindera.FirstJavaApi.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;


@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;


    public List<Account> getAccounts(){
        List<Account> accounts = new ArrayList<>();
        this.accountRepository.findAll().forEach(accounts::add);
        return accounts;
    }

    public void saveOrCreateAccount(@RequestBody Account account){
        accountRepository.save(account);
    }


}
