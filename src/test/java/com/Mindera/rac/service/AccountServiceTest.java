package com.Mindera.rac.service;

import com.Mindera.rac.mapper.AccountMapper;
import com.Mindera.rac.repository.AccountRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {

    @Mock
    AccountRepository accountRepository;

    @Mock
    AccountMapper accountMapper;

    @InjectMocks
    AccountService accountService;


//    @Test
//    void then_ThereAreAccounts_then_getEmptyList() {
//        when(accountRepository.findAll()).thenReturn(new ArrayList<>());
//
//        List<AccountDto> account = accountService.getAccounts();
//
//        assertNotNull(account);
//        assertTrue(account.isEmpty());
//    }

//    @Test
//    void when_ThereAreAccounts_then_getList() {
//        List<Account> accountList = new ArrayList<>();
//        accountList.add(new Account(1, "Hugo", "Loureiro", false, 20));
//        accountList.add(new Account(2, "Loureiro", "Hugo", true, 20));
//
//        when(accountRepository.findAll()).thenReturn(accountList);
//
//        List<AccountDto> result = accountService.getAccounts();
//
//        assertNotNull(result);
//        assertEquals(2, result.size());
//
//        AccountDto firstAccount = result.get(0);
//        assertEquals("Hugo", firstAccount.getFirstName());
//        assertEquals(20, firstAccount.getAge());
//    }

}