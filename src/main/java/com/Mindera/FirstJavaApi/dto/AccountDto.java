package com.Mindera.FirstJavaApi.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AccountDto {

    private int age;
    private String name;
    private String lasName;
}
