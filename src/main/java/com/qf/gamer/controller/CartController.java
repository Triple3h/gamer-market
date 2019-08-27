package com.qf.gamer.controller;

import com.qf.gamer.domain.entity.User;
import com.qf.gamer.domain.vo.GameCartVo;
import com.qf.gamer.domain.vo.GameDetailVo;
import com.qf.gamer.service.GameCartService;
import com.qf.gamer.utils.Constants;
import com.qf.gamer.utils.Result;
import com.qf.gamer.utils.SessionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Classname CartController
 * @Date 2019/8/27
 * @Author Triple3H
 */

@RestController
@RequestMapping("/cart")
public class CartController {

    @Resource
    HttpServletRequest request;

    @Resource
    GameCartService cartService;

    @RequestMapping(value = "/getAll")
    public Result getCarts() {

        Result result = null;

        try {
            User user = SessionUtils.getSession(request);

            if (user != null) {
                List<GameCartVo> carts = cartService.findCartsByUid(user.getUid());
                if (carts.size() > 0) {
                    result = Result.success(carts);
                } else {
                    result = Result.error(Constants.EXCEPTION_MSG);
                }
            } else {
                result = Result.loginFirst();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping(value = "/add",params = {"gameId","number"})
    public Result addCarts(int gameId, int number) {

        Result result = null;

        try {
            User user = SessionUtils.getSession(request);

            if (user != null) {
                int rows = cartService.addGameCart(user.getUid(), gameId, number);

                if (rows > 0) {
                    result = Result.success(rows);
                } else {
                    result = Result.error(Constants.EXCEPTION_MSG);
                }
            } else {
                result = Result.loginFirst();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
