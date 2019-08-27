package com.qf.gamer.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class GameCart {
    /**
    * 购物车id
    */
    private Integer cartId;

    /**
    * 数量
    */
    private Integer number;

    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 游戏id
    */
    private Integer gameId;

    /**
    * 创建时间
    */
    private Date createDate;

    /**
    * 删除  0为存在  1为删除  默认为0
    */
    private Integer isDelete;
}