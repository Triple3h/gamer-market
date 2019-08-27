package com.qf.gamer.mapper;

import com.qf.gamer.domain.entity.GameCart;
import com.qf.gamer.domain.vo.GameCartVo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface GameCartMapper {

    /**
     * 通过用户id查找购物车信息
     * @param uid
     * @return
     */
    List<GameCartVo> findCartsByUid(@Param("uid") int uid);

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

    /**
     * 通过游戏id和用户id查找购物车信息(唯一)
     * @param uid
     * @param gameId
     * @return
     */
    GameCart findByUidAndGameId(@Param("uid") int uid, @Param("gameId") int gameId);

    /**
     * 添加新的购物车信息
     * @param uid
     * @param gameId
     * @param number
     * @return
     */
    int insertCart(@Param("uid") int uid, @Param("gameId") int gameId, @Param("number") int number);
}