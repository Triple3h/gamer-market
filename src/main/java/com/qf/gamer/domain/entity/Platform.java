package com.qf.gamer.domain.entity;

import lombok.Data;

@Data
public class Platform {
    /**
    * 平台id
    */
    private Integer platformId;

    /**
    * 平台名
    */
    private String platformName;

    /**
    * 游戏id
    */
    private Integer gameId;
}