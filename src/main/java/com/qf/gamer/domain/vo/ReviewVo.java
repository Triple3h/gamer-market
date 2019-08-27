package com.qf.gamer.domain.vo;

import com.qf.gamer.domain.entity.User;
import lombok.Data;

import java.util.Date;

/**
 * @Classname ReviewVo
 * @Date 2019/8/26
 * @Author Triple3H
 */

@Data
public class ReviewVo {
    /**
     * 评论id
     */
    private Integer reviewId;

    /**
     * 评论标题
     */
    private String reviewTitle;

    /**
     * 评论的内容
     */
    private String reviewContent;

    /**
     * 游戏评分
     */
    private Integer reviewScore;

    /**
     * 发布时间
     */
    private Date releaseTime;

    /**
     * 用户
     */
    private User user;

}
