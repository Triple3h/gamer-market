package com.qf.gamer.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Banner {
    /**
    * 轮播图id

    */
    private Integer bannerId;

    /**
    * 标题
    */
    private String title;

    /**
    * 图片
    */
    private String bannerImg;

    /**
    * 详细地址

    */
    private String detailUrl;

    /**
    * 排序顺序
  1为大轮播  2为小轮播
    */
    private Integer order;

    /**
    * 更新时间

    */
    private Date createTime;

    /**
    * 状态值 0为存在  1为删除  默认为0
    */
    private Integer isDelete;
}