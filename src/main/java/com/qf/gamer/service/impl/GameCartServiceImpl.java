package com.qf.gamer.service.impl;

import com.qf.gamer.mapper.GameCartMapper;
import com.qf.gamer.service.GameCartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author SongZun
 * @date 2019/8/27 0027 下午 5:46
 */
@Service
public class GameCartServiceImpl implements GameCartService {
    @Resource
    GameCartMapper gameCartMapper;
    @Override
    public int updateCartNum(int cartId, int number) {
        return gameCartMapper.updateNumber(cartId,number);
    }

    @Override
    public int deleteCartGame(int cartId) {
        return gameCartMapper.deleteCart(cartId);
    }
}
