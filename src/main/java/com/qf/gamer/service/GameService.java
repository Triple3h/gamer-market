package com.qf.gamer.service;

import com.qf.gamer.util.GameBean;

public interface GameService {

    int save(GameBean gameBean,String userName);

    int delete(Integer gameId);
}
