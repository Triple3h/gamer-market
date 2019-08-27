package com.qf.gamer.mapper;

import com.qf.gamer.domain.entity.Game;
import com.qf.gamer.domain.vo.GameVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/26 0026 下午 3:49
 */
public interface GameMapper {
    /**
     * 5.根据关键字查询游戏
     * @param gameName
     * @return
     */
    List<Game> findByName(@Param("gameName") String gameName);

    /**
     * 根据游戏发布时间排序,同时取到平台信息
     * @return
     */
    List<Game> findByTime();

    /**
     * 根据评分排出前三,关联详情表的简介字段
     * @return
     */
    List<Game> findByScore();


}
