package com.qf.gamer.controller;

import com.qf.gamer.domain.entity.Review;
import com.qf.gamer.domain.entity.User;
import com.qf.gamer.service.ReviewService;
import com.qf.gamer.utils.Constants;
import com.qf.gamer.utils.Result;
import com.qf.gamer.utils.SessionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Classname ReviewController
 * @Date 2019/8/27
 * @Author Triple3H
 */

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Resource
    HttpServletRequest request;

    @Resource
    ReviewService reviewService;

    /**
     * 添加最新评论
     * 返回200 表示成功
     * 返回250 表示需要登录
     * 返回404 表示操作失败
     *
     * @param review
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Result insertNewReview(@RequestBody Review review) {

        User user = SessionUtils.getSession(request);

        Result result;

        try {
            int rows;

            if (user != null) {
                rows = reviewService.insertNewReview(review);
            } else {
                SessionUtils.saveSession(request, review, Constants.REVIEW_SESSION);
                return Result.loginFirst();
            }
            if (rows > 0) {
                result = Result.success(rows);
            } else {
                throw new RuntimeException(Constants.EXCEPTION_MSG);
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = Result.error(e.getMessage());
        }
        return result;
    }

    /**
     * 管理员假删除评论
     * 返回200表示成功
     * 返回250 表示需要登录
     * 返回403表示没有权限操作
     * 返回404 表示操作失败
     *
     * @param reviewId
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
    public Result deleteReview(int reviewId) {

        User user = SessionUtils.getSession(request);

        Result result;

        try {
            int rows;

            if (user != null) {
                if (user.getIsSuper() == 1) {
                    rows = reviewService.deleteReview(reviewId);
                } else {
                    return Result.forbidden();
                }
            } else {
                return Result.loginFirst();
            }

            if (rows > 0) {
                result = Result.success(rows);
            } else {
                throw new RuntimeException(Constants.EXCEPTION_MSG);
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = Result.error(e.getMessage());
        }
        return result;
    }
}
