package com.jbc.spring.security.ldap.dto;

import lombok.Data;

@Data
public class UserDto {

    private long rid;

    private String firstName;

    private String lastName;

    private String email;
}
