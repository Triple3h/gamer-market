package com.qf.gamer.domain.entity;

import lombok.Data;

@Data
public class GameInfo {
    /**
    * 详情id
    */
    private Integer gameInfoId;

    /**
    * 游戏简介
    */
    private String gameIntro;

    /**
    * 游戏故事
    */
    private String gameStory;

    /**
    * 游戏id
    */
    private Integer gameId;

    /**
    * 关于游戏
    */
    private String gameAbout;
}