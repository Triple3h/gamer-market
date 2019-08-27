package com.qf.gamer.service;

/**
 * @author SongZun
 * @date 2019/8/27 0027 下午 5:44
 */
public interface GameCartService {
    /**
     * 更新购物车的数量
     * @param cartId
     * @param number
     * @return
     */
    int updateCartNum(int cartId,int number);

    int deleteCartGame(int cartId);
}
