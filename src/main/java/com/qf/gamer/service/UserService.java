package com.qf.gamer.service;

import com.qf.gamer.domain.entity.User;
import com.qf.gamer.domain.vo.UserVo;

/**
 * @Date 2019/8/29
 * @Author Triple3H
 */

public interface UserService {

    UserVo login(String userName, String passWord);

    UserVo register(User user);

}
