package com.zzf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer userId;
    private String username;
    private String password;
    private Integer userType;
    private Integer balance;
}
