package com.qf.gamer.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    /**
    * 用户id
    */

    /**
    * 用户名
    */
    private String userName;

    /**
    * 密码
    */
    private String password;

    /**
    * 注册时间
    */
    private Date joinDate;

    /**
    * 最后登录
    */
    private Date lastLogin;

    /**
    * 

管理员
 0为普通用户  1为管理员  默认为0
    */
    private Integer isSuper;

    /**
    * 删除  0为存在  1为删除  默认为0
    */
    private Integer isDelete;
}