package com.qf.gamer.controller;

import com.qf.gamer.domain.entity.User;
import com.qf.gamer.service.LoginService;
import com.qf.gamer.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @ClassName LoginController
 * @Author lulei
 * @Data 2019/8/26 16:25
 */
@RestController
@RequestMapping("/api")
public class LoginController {

    @Resource
    LoginService loginService;

    /**
     * 登录
     * 把登录的信息存入Session
     *
     * @param username
     * @param psd
     * @param httpSession
     * @return
     */
    @PostMapping(value = "/login",params = {"username","psd"})
    public Result login(String username,String psd,HttpSession httpSession){
        Result<String> result = new Result<>();

        User user = loginService.login(username);


        if (username == null && "".equals(username) && psd == null && "".equals(psd)){
            return Result.error();
        }

        /*
         *如果用户名不存在
         * */
        if (user != null && psd.equals(user.getPassword())){
            if (user.getIsSuper() == 0){
                result.setData(user.getUserName());
                result.setStatus(200);

            } else {
                result.setStatus(250);
            }

            httpSession.setAttribute("userInfo",user);
            result.setMsg("成功");
            return result;

        }else {
            return Result.error();
        }
    }

}
