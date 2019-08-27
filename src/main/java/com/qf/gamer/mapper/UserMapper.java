package com.qf.gamer.mapper;

import com.qf.gamer.domain.entity.User;
import lombok.Data;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {

    //根据用户名查询
    User findByName(String userName);

    //添加用户
    int save(@Param("userName") String userName, @Param("psd") String psd);


}