package com.qf.gamer.service.impl;

import com.qf.gamer.domain.vo.GameVo;
import com.qf.gamer.mapper.GameMapper;
import com.qf.gamer.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Date 2019/8/26
 * @Author Triple3H
 */

@Service
public class IndexServiceImpl implements IndexService {

    @Resource
    GameMapper gameMapper;

    @Override
    public List<GameVo> getGameByIsOff(int pages, int size) {
        return gameMapper.getGameByIsOff(pages, size);
    }
}
