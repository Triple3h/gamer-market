package com.qf.gamer.service.impl;

import com.qf.gamer.domain.vo.GameDetailVo;
import com.qf.gamer.domain.vo.GameVo;
import com.qf.gamer.mapper.GameMapper;
import com.qf.gamer.service.GameService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname GameServiceImpl
 * @Date 2019/8/26
 * @Author Triple3H
 */

@Service
public class GameServiceImpl implements GameService {

    @Resource
    GameMapper gameMapper;

    @Override
    public List<GameVo> getAllGames(int pages, int size){
        return gameMapper.getAllGames(pages, size);
    }

    @Override
    public List<GameVo> getGamesByCate(int cateId, int pages, int size){
        return gameMapper.getGamesByCate(cateId, pages, size);
    }

    @Override
    public GameDetailVo getGameDetail(int gameId){
        return gameMapper.getGameDetail(gameId);
    }
}
