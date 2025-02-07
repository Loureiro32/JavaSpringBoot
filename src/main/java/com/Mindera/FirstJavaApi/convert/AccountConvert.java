package com.Mindera.FirstJavaApi.convert;

import com.Mindera.FirstJavaApi.dto.AccountDto;
import com.Mindera.FirstJavaApi.entity.Account;

import java.util.List;


public class AccountConvert {

    public static AccountDto fromAccountToAccountDto(List<Account> account){
        return AccountDto.builder().build();
    }


    public static Account fromAccountDtoToAccount(AccountDto accountDto){
        return Account.builder().build();
    }
}
