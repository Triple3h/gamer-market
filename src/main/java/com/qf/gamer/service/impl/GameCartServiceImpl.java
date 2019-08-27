package com.qf.gamer.service.impl;

import com.qf.gamer.domain.entity.GameCart;
import com.qf.gamer.domain.vo.GameCartVo;
import com.qf.gamer.mapper.GameCartMapper;
import com.qf.gamer.service.GameCartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname GameCartServiceImpl
 * @Date 2019/8/27
 * @Author Triple3H
 */

@Service
public class GameCartServiceImpl implements GameCartService {

    @Resource
    GameCartMapper gameCartMapper;

    @Override
    public List<GameCartVo> findCartsByUid(int uid) {
        return gameCartMapper.findCartsByUid(uid);
    }

    @Override
    public int addGameCart(int uid, int gameId, int number) {
        GameCart gameCart = gameCartMapper.findByUidAndGameId(uid, gameId);

        int rows;
        if (gameCart != null) {
            rows = gameCartMapper.updateNumber(gameCart.getCartId(), gameCart.getNumber() + number);
        } else {
            rows = gameCartMapper.insertCart(uid, gameId, number);
        }
        return rows;
    }
}
