package com.qf.gamer.mapper;

import com.qf.gamer.domain.entity.User;
import com.qf.gamer.domain.vo.UserVo;
import org.apache.ibatis.annotations.Param;

/**
 * @author HP
 */
public interface UserMapper {

    /**
     * 通过唯一的用户名查找用户
     * @param userName
     * @param passWord
     * @return
     */
    UserVo login(@Param("userName") String userName, @Param("passWord")String passWord);

    /**
     * 注册用户,返回自增的主键在对象中
     * @param user
     * @return
     */
    int register(@Param("user") User user);

}