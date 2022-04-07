package com.zzf.mapper;

import com.zzf.pojo.Employees;
import com.zzf.pojo.MovieTable;
import com.zzf.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

@Mapper
public interface TestMapper {

    User selectall(Integer userId);

    @Insert("insert into user (username,password) values (#{username},#{password})")
    void saveUser(User user);

    //根据用账号和密码查询用户
    @Select("select * from user where username = #{username} and password = #{password}")
    User selectUser(String username, String password);
    //首页影片加载
    @Select("select * from movietable")
    Collection<MovieTable> selectMovieAll();

    //喜剧片查询
    @Select("select * from movietable where movieType=1")
    Collection<MovieTable> selectXijuAll();

    //动作片查询
    @Select("select * from movietable where movieType=2")
    Collection<MovieTable> selectDongzuoAll();

    //剧情片查询
    @Select("select * from movietable where movieType=3")
    Collection<MovieTable> selectJuqingAll();
    //搜索电影
    @Select("select * from movietable where moviename like concat('%',#{moviename},'%') ")
    Collection<MovieTable> movieSerch(String moviename);

    //座位存档
    @Insert("insert into movieorder(seat,seatnumber)values (#{seat},#{seatnumber})")
    int seatSave(String seat,Integer seatnumber);

    //员工登录
    @Select("select * from employees where username=#{username} and password=#{password}")
    Employees employeeSelect(Employees employees);

}
