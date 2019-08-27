package com.qf.gamer.controller;

import com.qf.gamer.domain.entity.Game;
import com.qf.gamer.domain.entity.Review;
import com.qf.gamer.domain.vo.ReviewVo;
import com.qf.gamer.service.ReviewService;
import com.qf.gamer.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/26 0026 下午 9:00
 */
@RequestMapping("/review")
@RestController
@Slf4j
public class ReviewController {
    @Resource
    ReviewService reviewService;
    @RequestMapping(value = "/gameReview",params = {"gameId"})
    public Result findByGameId(int gameId){
        try {
            List<Review> reviewByGameId = reviewService.findReviewByGameId(gameId);
            return Result.success(reviewByGameId);

        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
    }

