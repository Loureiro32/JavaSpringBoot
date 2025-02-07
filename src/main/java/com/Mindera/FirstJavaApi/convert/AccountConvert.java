package com.Mindera.FirstJavaApi.builder;

import com.Mindera.FirstJavaApi.dto.AccountDto;
import com.Mindera.FirstJavaApi.entity.Account;
import lombok.Builder;

@Builder
public class AccountBuilder {

    public static AccountDto fromAccountToAccountDto(Account account){
        AccountDto accountDto = modelMapper

    }


    public static Account fromAccountDtoToAccount(AccountDto accountDto){


    }



}
