package com.example.springsecurity.entity.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountLoginDto {
    private String username;
    private String password;
}
