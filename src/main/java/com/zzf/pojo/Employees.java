package com.zzf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employees {

    private int id;
    private String username;
    private String password;
    private String employeename;//员工姓名
    private String phonenumber;//手机号

}
