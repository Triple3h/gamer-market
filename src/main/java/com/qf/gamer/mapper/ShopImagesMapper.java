package com.qf.gamer.mapper;

import com.qf.gamer.domain.entity.ShopImages;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author HP
 */
public interface ShopImagesMapper {

    /**
     * 通过游戏id
     * @param gameId
     * @return
     */
    List<ShopImages> getShopImg(@Param("gameId") int gameId);

}