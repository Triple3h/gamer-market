package com.qf.gamer.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Review {
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
    * 游戏id
    */
    private Integer gameId;

    /**
     * 游戏评分
     */
    private Integer reviewScore;

    /**
    * 发布时间

    */
    private Date releaseTime;

    /**
    * 用户id

    */
    private Integer uid;

    /**
    * 状态值 0为存在  1为删除  默认为0
    */
    private Integer isDelete;
}