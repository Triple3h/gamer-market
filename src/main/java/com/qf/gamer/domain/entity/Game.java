package com.qf.gamer.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Game {
    /**
    * 游戏Id
    */
    private Integer gameId;

    /**
    * 

游戏名

    */
    private String gameName;

    /**
    * 发售时间
    */
    private String releasedTime;

    /**
    * 一级分类
    */
    private Integer categoryId;

    /**
    * 发行商
    */
    private String gamePublisher;

    /**
    * 

评分

    */
    private Double score;

    /**
    * 价格
    */
    private Integer price;

    /**
    * 

是否打折
  0为不打折 1为打折  默认不打折
    */
    private Integer isOff;

    /**
    * 

折扣力度
  默认为1 用0.几
    */
    private Double discount;

    /**
    * 状态值 0为正常  1为删除
    */
    private Integer isUse;

    /**
    * 

更新时间

    */
    private Date createTime;


}