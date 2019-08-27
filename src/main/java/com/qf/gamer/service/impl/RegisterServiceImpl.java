package com.qf.gamer.service.impl;

import com.qf.gamer.mapper.UserMapper;
import com.qf.gamer.service.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName RegisterServiceImpl
 * @Author lulei
 * @Data 2019/8/26 20:31
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    UserMapper userMapper;

    @Override
    public int saveUser(String username,String psd) {

        int cnt = userMapper.save(username, psd);


        return cnt;
    }
}
