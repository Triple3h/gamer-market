package com.qf.gamer.service.impl;

import com.qf.gamer.domain.entity.User;
import com.qf.gamer.mapper.UserMapper;
import com.qf.gamer.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName LoginServiceImpl
 * @Author lulei
 * @Data 2019/8/26 16:15
 */

@Service
public class LoginServiceImpl implements LoginService {


    @Resource
    UserMapper userMapper;



    @Override
    public User login(String username) {

        User byName = userMapper.findByName(username);

        return byName;
    }
}
