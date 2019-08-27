package com.qf.gamer.service.impl;

import com.qf.gamer.domain.entity.Game;
import com.qf.gamer.domain.vo.GameVo;
import com.qf.gamer.mapper.GameMapper;
import com.qf.gamer.service.GameService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/26 0026 下午 4:31
 */
@Service
public class GameServiceImpl implements GameService {
    @Resource
    GameMapper gameMapper;
    @Override
    public List<Game> findByName(String gameName) {
        return gameMapper.findByName(gameName);
    }

    @Override
    public List<Game> findByTime() {
        return gameMapper.findByTime();
    }

    @Override
    public List<Game> findByScore() {
        return gameMapper.findByScore();
    }


}
