package com.qf.gamer.controller;

import com.qf.gamer.domain.vo.GameCartVo;
import com.qf.gamer.service.GameCartService;
import com.qf.gamer.utils.Constants;
import com.qf.gamer.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname CartController
 * @Date 2019/8/27
 * @Author Triple3H
 */

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Resource
    GameCartService cartService;

    @RequestMapping(value = "/getAll", params = {"uid"})
    public Result getCarts(int uid) {

        Result result = null;

        try {
            if (uid >= 0) {
                List<GameCartVo> carts = cartService.findCartsByUid(uid);
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

    @RequestMapping(value = "/add", params = {"gameId", "number", "uid"})
    public Result addCarts(int gameId, int number, int uid) {

        Result result = null;

        try {
            if (uid >= 0) {
                int rows = cartService.addGameCart(uid, gameId, number);

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
