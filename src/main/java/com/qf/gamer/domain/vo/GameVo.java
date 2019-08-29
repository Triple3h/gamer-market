package com.qf.gamer.domain.vo;

import com.qf.gamer.domain.entity.Platform;
import com.qf.gamer.domain.entity.ShopImages;
import lombok.Data;
import java.util.List;

/**
 * @Classname GameVo
 * @Date 2019/8/26
 * @Author Triple3H
 */

@Data
public class GameVo {

    /**
     * 游戏Id
     */
    private Integer gameId;

    /**
     *游戏名
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
     *评分
     */
    private Double score;

    /**
     * 价格
     */
    private Integer price;

    /**
     *折扣力度  默认为1 用0.几
     */
    private Double discount;

    /**
     * 游戏图片
     */
    private ShopImages shopImages;

    /**
     * 游戏平台
     */
    private Platform platforms;
}
