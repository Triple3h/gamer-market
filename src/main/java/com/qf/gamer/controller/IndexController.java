package com.qf.gamer.controller;

import com.qf.gamer.domain.entity.Banner;
import com.qf.gamer.domain.entity.Game;
import com.qf.gamer.domain.vo.GameVo;
import com.qf.gamer.service.BannerService;
import com.qf.gamer.service.GameService;
import com.qf.gamer.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/26 0026 下午 4:38
 */
@RequestMapping("/api")
@RestController
@Slf4j
public class IndexController {
    @Resource
    GameService gameService;
    @Resource
    BannerService bannerService;

    /**
     * 根据关键字查询游戏
     *
     * @param gameName
     * @return
     */
    @RequestMapping(value = "/findGame", params = {"gameName"})
    public Result findByName(String gameName) {
        try {
            List<Game> byName = gameService.findByName(gameName);
            if (null != byName) {
                return Result.success(byName);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    /**
     * 根据游戏发布时间排序,同时取到平台信息
     *
     * @return
     */
    @GetMapping("/findTime")
    public Result findByTime() {
        try {
            List<Game> byTime = gameService.findByTime();
            if (null != byTime) {
            return Result.success(byTime);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    /**
     * 根据评分排出前三,关联详情表的简介字段
     *
     * @return
     */
    @GetMapping("/findScore")
    public Result findByScore() {
        try {
            List<Game> byScore = gameService.findByScore();
            if (null!=byScore) {
                return Result.success(byScore);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    /**
     * 轮播图 1为大图 2为小图
     *
     * @return
     */
    @GetMapping("/bigBanner")
    public Result findBigBanner() {
        try {
            List<Banner> bigBanner = bannerService.findBigBanner();
            if(null != bigBanner) {
                return Result.success(bigBanner);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    /**
     * 轮播图 1为大图 2为小图
     *
     * @return
     */
    @GetMapping("/smallBanner")
    public Result findSmallBanner() {
        try {
            List<Banner> smallBanner = bannerService.findSmallBanner();
            if(null!=smallBanner) {
                return Result.success(smallBanner);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
