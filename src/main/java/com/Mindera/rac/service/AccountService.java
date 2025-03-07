package com.Mindera.rac.service;


import com.Mindera.rac.dto.AccountDto;
import com.Mindera.rac.entity.Account;
import com.Mindera.rac.mapper.AccountMapper;
import com.Mindera.rac.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;


    public List<AccountDto> getAccounts() {
        List<Account> accounts = new ArrayList<>(accountRepository.findAll());

        return AccountMapper.accountMapper.accountsToAccountDtos(accounts);
    }

    public List<AccountDto> getDeactivatedAccounts() {
        List<Account> disableAccounts = new ArrayList<>();
        this.accountRepository.findByAccountStatusFalse().forEach(disableAccounts::add);
        return AccountMapper.accountMapper.accountsToAccountDtos(disableAccounts);
    }

    public AccountDto saveOrCreateAccount(AccountDto account) {
        Account accountEntity = AccountMapper.accountMapper.accountDtoToAccount(account);
        if (this.accountRepository.existsByFirstNameAndLastName(account.getFirstName(), account.getLastName())) {
            throw new IllegalStateException("Account Already exist");
        }
        this.accountRepository.save(accountEntity);
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

    public Account updateAccountName(Integer id, AccountDto accountDto) {
        Account account1 = this.accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found! Create One"));
        account1.setFirstName(accountDto.getFirstName());
        account1.setLastName(accountDto.getLastName());
        return this.accountRepository.save(account1);
    }

    public Integer updateAccount(Integer id, AccountDto accountDto) {
        Account account = AccountMapper.accountMapper.accountDtoToAccount(accountDto);
        this.accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found! Create One"));
        account.setId(id);
        return this.accountRepository.save(account).getId();
    }

    public List<String> getDisableAccountName() {
        List<Account> disableAccountsNames = this.accountRepository.findByAccountStatusFalse();
        List<String> result = new ArrayList<>();
        disableAccountsNames.forEach(account -> result.add(account.getFirstName() + account.getLastName()));
        return result;
    }
}
