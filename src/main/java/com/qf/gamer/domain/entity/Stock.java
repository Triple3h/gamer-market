package com.qf.gamer.domain.entity;

import lombok.Data;

@Data
public class Stock {
    /**
    * 库存id

    */
    private Integer stockId;

    /**
    * 库存数量
    */
    private Integer stockValue;

    /**
    * 游戏id
    */
    private Integer gameId;
}