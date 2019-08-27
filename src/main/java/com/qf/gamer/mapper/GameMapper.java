package com.qf.gamer.mapper;

import com.qf.gamer.domain.entity.Game;

public interface GameMapper {

    int save(Game game);
    int delete(Integer game_id);

}