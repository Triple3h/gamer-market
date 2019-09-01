package com.qf.gamer.controller;

import com.qf.gamer.domain.entity.Review;
import com.qf.gamer.service.ReviewService;
import com.qf.gamer.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/26 0026 下午 9:00
 */
@RequestMapping("/api")
@RestController
@Slf4j
public class ReviewController {
    @Resource
    ReviewService reviewService;

    /**
     * 根据游戏id查询评论,按发布时间排序分页(6个一页))
     * @param gameId
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/gameReview")
    public Result findByGameId(HttpServletRequest request, int gameId, int page, int size) {
        try {
//            User session = SessionUtils.getSession(request);
//            if (session!=null) {
                if (page == 0 && size == 0) {
                    size = 6;
                } else {
                    page = (page - 1) * size;
                }

                List<Review> reviewByGameId = reviewService.findReviewByGameId(gameId, page, size);
                if (reviewByGameId != null) {
                    return Result.success(reviewByGameId);
//                }
            }else {
                return Result.loginFirst();
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}

