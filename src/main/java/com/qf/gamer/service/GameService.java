package com.qf.gamer.service;

import com.qf.gamer.domain.vo.GameDetailVo;
import com.qf.gamer.domain.vo.GameVo;

import java.util.List;

/**
 * @Date 2019/8/26
 * @Author Triple3H
 */

public interface GameService {
    List<GameVo> getAllGames(int pages, int size);

    List<GameVo> getGamesByCate(int cateId, int pages, int size);

    GameDetailVo getGameDetail(int gameId);
}
