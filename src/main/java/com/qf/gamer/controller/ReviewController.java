package com.qf.gamer.controller;

import com.qf.gamer.domain.entity.Review;
import com.qf.gamer.domain.entity.User;
import com.qf.gamer.service.ReviewService;
import com.qf.gamer.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Classname ReviewController
 * @Date 2019/8/27
 * @Author Triple3H
 */

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Resource
    HttpServletRequest req;

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
    @RequestMapping("/save")
    public Result insertNewReview(Review review) {

        HttpSession session = req.getSession();

        User user = (User) session.getAttribute("userInfo");

        Result result = null;

        try {
            int rows;

            if (user != null) {
                rows = reviewService.insertNewReview(review);
            } else {
                session.setAttribute("reviewInfo", review);
                result.setMsg("请先登录");
                result.setStatus(250);
                return result;
            }

            if (rows > 0) {
                result = Result.success(rows);
            } else {
                throw new RuntimeException("请先登录!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = Result.error(e.getMessage());
        }
        return result;
    }
}
