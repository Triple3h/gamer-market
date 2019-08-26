package com.qf.gamer.domain.entity;

import lombok.Data;

@Data
public class ShopImages {
    /**
    * 游戏图片id
    */
    private Integer shopImgId;

    /**
    * 图片
    */
    private String shopImg;

    /**
    * 游戏id
    */
    private Integer gameId;

    /**
    * 图片大小类型  big对应大图 small对应小图
    */
    private String imgType;
}