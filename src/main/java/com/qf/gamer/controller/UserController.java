package com.qf.gamer.controller;

import com.qf.gamer.domain.entity.User;
import com.qf.gamer.domain.vo.UserVo;
import com.qf.gamer.service.UserService;
import com.qf.gamer.utils.Constants;
import com.qf.gamer.utils.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Classname UserController
 * @Date 2019/8/29
 * @Author Triple3H
 */

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping(value = "/login", params = {"userName", "passWord"})
    public Result login(String userName, String passWord) {

        Result result = null;

        try {
            UserVo userVo = userService.login(userName, passWord);

            if (userVo != null) {
                result = Result.success(userVo);
            } else {
                result = Result.error(Constants.LOGIN_ERROR);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Result register(@RequestBody User user) {
        Result result = null;

        try {
            UserVo userVo = userService.register(user);

            if (userVo != null) {
                result = Result.success(userVo);
            } else {
                result = Result.error(Constants.EXCEPTION_MSG);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
