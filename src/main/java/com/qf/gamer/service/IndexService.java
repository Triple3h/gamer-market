package com.qf.gamer.service;

import com.qf.gamer.domain.vo.GameVo;

import java.util.List;

/**
 * @Classname GameService
 * @Date 2019/8/26
 * @Author Triple3H
 */

public interface IndexService {
    List<GameVo> getGameByIsOff(int pages,int size);
}
