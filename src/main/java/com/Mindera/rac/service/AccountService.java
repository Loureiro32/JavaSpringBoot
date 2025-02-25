package com.Mindera.rac.service;


import com.Mindera.rac.entity.Account;
import com.Mindera.rac.repository.AccountRepository;
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

    public Account saveOrCreateAccount(Account account) {
        if (this.accountRepository.existsByFirstNameAndLastName(account.getFirstName(), account.getLastName())) {
            throw new IllegalStateException("Account Already exist");
        }
        this.accountRepository.save(account);
        return account;
    }

    public void deleteAccount(Integer id) {
        this.accountRepository.deleteById(id);
    }

    public Account patchAccountTrue(Integer id, Boolean value) {
        Account account = this.accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        account.setAccountStatus(value);
        return this.accountRepository.save(account);
    }

    public Account patchAccountFalse(Integer id, Boolean value) {
        Account account = this.accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        account.setAccountStatus(value);
        return this.accountRepository.save(account);
    }

    public Account updateAccountName(Integer id, Account account) {
        Account account1 = this.accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found! Create One"));
        account1.setFirstName(account.getFirstName());
        account1.setLastName(account.getLastName());
        return this.accountRepository.save(account1);
    }

    public Account updateAccount(Integer id, Account account) {
        this.accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found! Create One"));
        return this.accountRepository.save(account);
    }

    public List<String> getDisableAccountName() {
        List<Account> disableAccountsNames = this.accountRepository.findByAccountStatusFalse();
        List<String> result = new ArrayList<>();
        disableAccountsNames.forEach(account -> result.add(account.getFirstName() + account.getLastName()));
        return result;
    }
}
