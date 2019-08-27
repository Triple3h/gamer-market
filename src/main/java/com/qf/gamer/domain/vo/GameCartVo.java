package com.qf.gamer.domain.vo;

import com.qf.gamer.domain.entity.Game;
import com.qf.gamer.domain.entity.ShopImages;
import lombok.Data;

import java.util.List;

/**
 * @Classname GameCartVo
 * @Date 2019/8/27
 * @Author Triple3H
 */

@Data
public class GameCartVo {
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
     * 游戏信息
     */
    private Game game;

}
