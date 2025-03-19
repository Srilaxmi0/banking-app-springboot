package net.springboot.banking_app.mapper;

import net.springboot.banking_app.dto.AccountDto;
import net.springboot.banking_app.entity.Account;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto){
        Account account= new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto=new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
