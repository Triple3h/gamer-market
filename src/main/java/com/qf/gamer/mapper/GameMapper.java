package com.qf.gamer.mapper;

import com.qf.gamer.domain.vo.GameDetailVo;
import com.qf.gamer.domain.vo.GameVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GameMapper {

    /**
     * 查询打折游戏
     *
     * @return
     */
    List<GameVo> getGameByIsOff(@Param("pages") int pages, @Param("size") int size);

    /**
     * 获取所有游戏
     *
     * @param pages
     * @param size
     * @return
     */
    List<GameVo> getAllGames(@Param("pages") int pages, @Param("size") int size);

    /**
     * 根据分类查找游戏
     *
     * @param cateId
     * @param pages
     * @param size
     * @return
     */
    List<GameVo> getGamesByCate(@Param("cateId") int cateId, @Param("pages") int pages, @Param("size") int size);

    /**
     * 根据游戏id取得详情
     * @param gameId
     * @return
     */
    GameDetailVo getGameDetail(@Param("gameId") int gameId);
}