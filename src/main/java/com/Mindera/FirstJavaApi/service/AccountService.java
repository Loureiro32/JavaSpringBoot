package com.Mindera.FirstJavaApi.service;


import com.Mindera.FirstJavaApi.entity.Account;
import com.Mindera.FirstJavaApi.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;


    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        this.accountRepository.findAll().forEach(accounts::add);
        return accounts;
    }

    public List<Account> getDeactivatedAccounts() {
        List<Account> disableAccounts = new ArrayList<>();
        this.accountRepository.findByAccountStatusFalse().forEach(disableAccounts::add);
        return disableAccounts;
    }

    public void saveOrCreateAccount(Account account) {
        if (this.accountRepository.existsByName(account.getName())) {
            throw new IllegalStateException("Account Already exist");
        }
        this.accountRepository.save(account);
    }

    public void deleteAccount(Integer id) {
        this.accountRepository.deleteById(id);
    }
}
