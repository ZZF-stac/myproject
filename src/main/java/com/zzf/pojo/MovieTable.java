package com.zzf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieTable {
    private int movieId;
    private String moviename;//电影名
    private Double price;//票价
    private Date updateDate;//更新日期
    private String photoname;//电话号码
    private String movieinfo;//电影描述
    private int movieType;//1喜剧类，2动作类，3剧情类;

}
