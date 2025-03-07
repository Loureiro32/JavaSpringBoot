package com.Mindera.rac.mapper;

import com.Mindera.rac.dto.AccountDto;
import com.Mindera.rac.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    AccountMapper accountMapper = Mappers.getMapper(AccountMapper.class);

    Account accountDtoToAccount(AccountDto accountDto);

    AccountDto accountToAccountDto(Account account);

    //Account accountUpdateDtoToAccount(AccountDto accountDto);

    List<AccountDto> accountsToAccountDtos(List<Account> accountList);

    List<Account> studentDtosToStudents(List<AccountDto> accountDtoList);

}
