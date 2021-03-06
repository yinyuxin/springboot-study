package com.yyx.springboot.mapper.test;

import com.yyx.springboot.entity.po.UserPo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Description: user mapper
 * @Auther: yinyuxin
 * @Date: 2018/11/12 15:47
 */
public interface UserMapper {

    @Select("select * from user where name=#{name}")
    UserPo findByName(@Param("name") String name);

    @Insert("insert into user(name,age) values (#{name},#{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
}
