package com.fapethedev.graphqlapi.accounts.service;

import com.fapethedev.graphqlapi.accounts.domain.BankAccount;
import com.fapethedev.graphqlapi.accounts.domain.Client;

import java.util.List;

public interface BankService
{
    List<BankAccount> getBankAccounts();

    Client getClientByAccountId(String accountId);
}
