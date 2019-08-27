package com.qf.gamer.controller;

import com.qf.gamer.service.impl.RegisterServiceImpl;
import com.qf.gamer.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName Register
 * @Author lulei
 * @Data 2019/8/26 20:17
 */
@RestController
@RequestMapping("/api")
public class RegisterController {

    @Resource
    RegisterServiceImpl registerService;


    /*
    * 注册
    *
    * */
    @PostMapping(value = "/register",params = {"username","psd"})
    public Result Register(String username,String psd){


        try {
            int cnt = registerService.saveUser(username, psd);

            if (cnt > 0){
                return Result.success(cnt);
            }else {
                return Result.error();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return Result.error();

        }


    }
}
