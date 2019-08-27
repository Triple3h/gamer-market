package com.qf.gamer.controller;

import com.qf.gamer.domain.entity.Game;
import com.qf.gamer.service.impl.GameServiceImpl;
import com.qf.gamer.util.GameBean;
import com.qf.gamer.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName ShopControlller
 * @Author lulei
 * @Data 2019/8/26 19:15
 */
@RestController
@RequestMapping("/api")
public class GameController {


    @Resource
    GameServiceImpl gameService;

    /*
    *
    * 添加游戏
    *
    * */
    @PostMapping("/save")
    public Result save(@RequestBody GameBean gameBean,String userName){

        int cnt = 0;

        try {

            cnt = gameService.save(gameBean,userName);

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
    /**
     * 假删除
     * */
    @GetMapping(value = "/delete",params = {"gameId"})
    public Result delete(String gameId){


        try {
            int gIdInt = Integer.parseInt(gameId);
            int cnt = gameService.delete(gIdInt);
            return Result.success(cnt);

        } catch (Exception e) {
            e.printStackTrace();
            return Result.error();

        }
    }
}
