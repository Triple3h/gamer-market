package com.qf.gamer.service.impl;

import com.qf.gamer.domain.entity.User;
import com.qf.gamer.domain.vo.UserVo;
import com.qf.gamer.mapper.UserMapper;
import com.qf.gamer.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname UserServiceImpl
 * @Date 2019/8/29
 * @Author Triple3H
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public UserVo login(String userName, String passWord) {
        return userMapper.login(userName, passWord);
    }

    @Override
    public UserVo register(User user) {
        userMapper.register(user);
        return new UserVo(user.getUid(), user.getUserName(), user.getIsSuper());
    }
}
