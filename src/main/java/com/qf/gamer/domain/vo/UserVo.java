package com.qf.gamer.domain.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @Classname UserVo
 * @Date 2019/8/29
 * @Author Triple3H
 */

public class UserVo {

    public UserVo() {
    }

    public UserVo(Integer uid, String userName, Integer isSuper) {
        this.uid = uid;
        this.userName = userName;
        this.isSuper = isSuper;
    }

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 用户名
     */
    private String userName;

    /**
     *管理员  0为普通用户  1为管理员  默认为0
     */
    private Integer isSuper;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getIsSuper() {
        return isSuper;
    }

    public void setIsSuper(Integer isSuper) {
        this.isSuper = isSuper;
    }
}
