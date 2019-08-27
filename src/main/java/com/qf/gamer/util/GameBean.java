package com.qf.gamer.util;

import com.qf.gamer.domain.entity.*;
import com.qf.gamer.mapper.GameMapper;
import lombok.Data;

import java.util.*;

/**
 * @ClassName GameBean
 * @Author lulei
 * @Data 2019/8/26 22:50
 */

@Data
public class GameBean {
    private Game game;
    private GameInfo gameInfo;
    private Platform platform;
    private ShopImages shopImages;
    private Stock stock;


    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
