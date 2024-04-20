package com.fapethedev.graphqlapi.accounts.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client
{
    private String id;
    private String accountId;
    private String firstName;
    private String middleName;
    private String lastname;
}
