package com.qf.gamer.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author SongZun
 * @date 2019/8/27 0027 下午 5:40
 */

public interface GameCartMapper {


    /**
     * 更新购物车的数量
     * @param cartId
     * @param number
     * @return
     */
    int updateNumber(@Param("cartId") int cartId, @Param("number") int number);

    /**
     * 假删除购物车记录
     * @param cartId
     * @return
     */
    int deleteCart(@Param("cartId") int cartId);

}
