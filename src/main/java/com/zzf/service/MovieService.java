package com.zzf.service;

import com.zzf.pojo.MovieTable;

import java.util.Collection;

public interface MovieService {
    //查询所有影片
    Collection<MovieTable> selectMovieAll();
    //查询所有喜剧片
    Collection<MovieTable> selectXijuAll();
    //查询所有动作片
    Collection<MovieTable> selectDongzuoAll();
    //剧情片查询
    Collection<MovieTable> selectJuqingAll();
    //搜索电影
    Collection<MovieTable> movieSerch(String moviename);
}
