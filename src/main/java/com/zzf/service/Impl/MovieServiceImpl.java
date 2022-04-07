package com.zzf.service.Impl;

import com.zzf.mapper.TestMapper;
import com.zzf.pojo.MovieTable;
import com.zzf.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    TestMapper testMapper;

    //查询所有电影
    @Override
    public Collection<MovieTable> selectMovieAll() {
        return testMapper.selectMovieAll();
    }

    //查询所有喜剧片
    @Override
    public Collection<MovieTable> selectXijuAll() {
        return testMapper.selectXijuAll();
    }

    //查询所有动作片
    @Override
    public Collection<MovieTable> selectDongzuoAll() {
        return testMapper.selectDongzuoAll();
    }

    //查询所有剧情片
    @Override
    public Collection<MovieTable> selectJuqingAll() {
        return testMapper.selectJuqingAll();
    }

    @Override
    public Collection<MovieTable> movieSerch(String moviename) {
        return testMapper.movieSerch(moviename);
    }
}
