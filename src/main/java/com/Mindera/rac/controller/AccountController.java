package com.Mindera.rac.controller;

import com.Mindera.rac.entity.Account;
import com.Mindera.rac.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(path = "{values}")
    public List<Account> getDesableAccount() {
        return this.accountService.getDeactivatedAccounts();
    }

    @PostMapping
    public void createAccount(@RequestBody Account account) {
        this.accountService.saveOrCreateAccount(account);
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
}
