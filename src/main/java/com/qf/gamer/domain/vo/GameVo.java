package com.qf.gamer.domain.vo;

import com.qf.gamer.domain.entity.*;
import lombok.Data;

import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/26 0026 下午 5:16
 */
@Data
public class GameVo extends Game{
    Platform platforms;
    ShopImages shopImages;
    GameInfo gameInfos;
    List<Review> reviewList;
}
