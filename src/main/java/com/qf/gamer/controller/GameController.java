package com.qf.gamer.controller;

import com.qf.gamer.domain.vo.GameDetailVo;
import com.qf.gamer.domain.vo.GameVo;
import com.qf.gamer.service.GameService;
import com.qf.gamer.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname GameController
 * @Date 2019/8/26
 * @Author Triple3H
 */

@RestController
@RequestMapping("/api/games")
public class GameController {

    @Resource
    GameService gameService;

    /**
     * 查询所有游戏
     * @param pages
     * @param size
     * @return
     */
    @RequestMapping("/all")
    public Result getAllGames(int pages, int size) {

        Result result = null;

        try {

            if (pages == 0 && size == 0) {
                size = 12;
            } else {
                pages = (pages - 1) * size;
            }

            List<GameVo> games = gameService.getAllGames(pages, size);

            if (games.size() > 0) {
                result = Result.success(games);
            }

        } catch (Exception e) {
            e.printStackTrace();
            result = Result.error(e.getMessage());
        }
        return result;
    }

    /**
     * 按分类查询游戏
     * @param cateId
     * @param pages
     * @param size
     * @return
     */
    @RequestMapping(value = "/classify", params = {"cateId"})
    public Result getGamesByCate(int cateId, int pages, int size) {

        Result result = null;

        try {

            if (pages == 0 && size == 0) {
                size = 12;
            } else {
                pages = (pages - 1) * size;
            }

            List<GameVo> games = gameService.getGamesByCate(cateId, pages, size);

            if (games.size() > 0) {
                result = Result.success(games);
            }

        } catch (Exception e) {
            e.printStackTrace();
            result = Result.error(e.getMessage());
        }
        return result;
    }

    /**
     * 游戏详情
     * @param gameId
     * @return
     */
    @RequestMapping(value = "/detail", params = {"gameId"})
    public Result getGameDetail(int gameId) {

        Result result = null;

        try {

            GameDetailVo gameDetail = gameService.getGameDetail(gameId);

            if (gameDetail != null) {
                result = Result.success(gameDetail);
            }

        } catch (Exception e) {
            e.printStackTrace();
            result = Result.error(e.getMessage());
        }
        return result;
    }
}
