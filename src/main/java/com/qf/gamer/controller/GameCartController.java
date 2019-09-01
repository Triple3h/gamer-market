package com.qf.gamer.controller;

import com.qf.gamer.domain.entity.User;
import com.qf.gamer.service.GameCartService;
import com.qf.gamer.utils.Result;
import com.qf.gamer.utils.SessionUtils;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author SongZun
 * @date 2019/8/27 0027 下午 5:47
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class GameCartController {
    @Resource
    GameCartService gameCartService;

    /**
     * 更新购物车的数量
     *
     * @param cartId
     * @param number
     * @return
     */
    @GetMapping("/updateNum")
    public Result updateCartNum(HttpServletRequest request, int cartId, int number) {
        try {
            User session = SessionUtils.getSession(request);
            if (null != session) {
                int i = gameCartService.updateCartNum(cartId, number);
                if (i > 0) {
                    return Result.success(i);
                }
            } else {
                return Result.loginFirst();
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    @GetMapping("/deleteGame")
    public Result deleteCartGame(HttpServletRequest request, int cartId) {
        try {
            User session = SessionUtils.getSession(request);
            if (null != session) {
                int i = gameCartService.deleteCartGame(cartId);
                if (i > 0) {
                    return Result.success(i);
                }
            }else {
                return Result.loginFirst();
            }
            } catch(Exception e){
                log.error(e.getMessage());
            }
            return Result.error();
        }
    }
