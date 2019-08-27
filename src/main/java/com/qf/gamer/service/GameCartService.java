package com.qf.gamer.service;

import com.qf.gamer.domain.vo.GameCartVo;

import java.util.List;

/**
 * @Date 2019/8/27
 * @Author Triple3H
 */

public interface GameCartService {

    List<GameCartVo> findCartsByUid(int uid);

    int addGameCart(int uid, int gameId, int number);

}
