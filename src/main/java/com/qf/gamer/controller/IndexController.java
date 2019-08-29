package com.qf.gamer.controller;

import com.qf.gamer.domain.vo.GameVo;
import com.qf.gamer.service.IndexService;
import com.qf.gamer.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname IndexController
 * @Date 2019/8/26
 * @Author Triple3H
 */

@RequestMapping("/api")
@RestController
public class IndexController {

    @Resource
    IndexService indexService;

    /**
     * 折扣游戏列表
     * @return
     */
    @RequestMapping("/discount")
    public Result gameDiscountList(int pages, int size) {

        Result result = null;

        try {

            if (pages == 0 && size == 0) {
                size = 12;
            } else {
                pages = (pages - 1) * size;
            }

            List<GameVo> games = indexService.getGameByIsOff(pages, size);

            if (games.size() > 0) {
                result = Result.success(games);
            }

        } catch (Exception e) {
            e.printStackTrace();
            result = Result.error(e.getMessage());
        }
        return result;
    }

}
