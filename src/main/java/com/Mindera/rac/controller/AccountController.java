package com.Mindera.rac.controller;

import com.Mindera.rac.dto.AccountDto;
import com.Mindera.rac.entity.Account;
import com.Mindera.rac.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping
    public List<AccountDto> getAllAccount() {
        return this.accountService.getAccounts();
    }

    @GetMapping(path = "{deactivated}")
    public List<AccountDto> getDesableAccount() {
        return this.accountService.getDeactivatedAccounts();
    }

    @GetMapping(path = "{disable}/names")
    public List<String> getDisableAccountName() {
        return this.accountService.getDisableAccountName();
    }

    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@Valid @RequestBody AccountDto account, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(this.accountService.saveOrCreateAccount(account));
    }

    @DeleteMapping(path = "{AccountID}")
    public void deleteAccount(@PathVariable("AccountID") Integer id) {
        this.accountService.deleteAccount(id);
    }

    @PatchMapping(path = "/{id}/true")
    public ResponseEntity<Account> updateAccountStatusTrue(@PathVariable Integer id) {
        return ResponseEntity.ok(accountService.patchAccountTrue(id, true));
    }

    @PatchMapping(path = "/{id}/false")
    public ResponseEntity<Account> updateAccountStatusFalse(@PathVariable Integer id) {
        accountService.patchAccountFalse(id, false);
        return ResponseEntity.ok().build();
    }

    @PatchMapping(path = "{id}/name")
    public ResponseEntity<AccountDto> updateAccountName(@PathVariable Integer id, @RequestBody AccountDto accountDto) {
        this.accountService.updateAccountName(id, accountDto);
        return ResponseEntity.ok().build();
    }

    @PatchMapping(path = "{id}/accountupdate")
    public AccountDto updateAccountDetails(@PathVariable Integer id, @RequestBody AccountDto accountDto) {
        this.accountService.updateAccount(id, accountDto);
        return accountDto;
    }

}
