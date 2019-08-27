package com.qf.gamer.service.impl;

import com.alibaba.druid.sql.visitor.functions.If;
import com.qf.gamer.domain.entity.*;
import com.qf.gamer.mapper.*;
import com.qf.gamer.service.GameService;
import com.qf.gamer.util.GameBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName GameServiceImpl
 * @Author lulei
 * @Data 2019/8/26 21:48
 */
@Service
@Slf4j
public class GameServiceImpl implements GameService {

    @Resource
    GameMapper gameMapper;

    @Resource
    GameInfoMapper gameInfoMapper;

    @Resource
    PlatformMapper platformMapper;

    @Resource
    ShopImagesMapper shopImagesMapper;

    @Resource
    StockMapper stockMapper;


    /*
    *判断是否为管理员
    * */
    UserMapper userMapper;



    @Override
    public int delete(Integer gameId) {

        int cnt = gameMapper.delete(gameId);

        return cnt;
    }

    /*
    * 一次保存数据
    * */
    @Override
    public int save(GameBean gameBean,String userName) {
        /**
         * 分解json对象
         * */
        Game game = gameBean.getGame();
        GameInfo gameInfo = gameBean.getGameInfo();
        Platform platform = gameBean.getPlatform();
        ShopImages shopImages = gameBean.getShopImages();
        Stock stock = gameBean.getStock();

        /*
        * 判断是否为管理员
        * */
        if (userName != null) {
            User user = userMapper.findByName(userName);
            /*0普通用户
              1管理员
            如果是普通用户*/
            if (user.getIsSuper() == 0){
                throw new RuntimeException();
            }
        }else {
            throw new RuntimeException();
        }

                if (game != null && platform != null && shopImages != null && stock != null) {
                    int cntGame = gameMapper.save(game);

                    Integer gameId = game.getGameId();

                    /*
                     * 设置在gameInfo中gameid的值
                     * */
                    gameInfo.setGameId(gameId);

                    int cntInfo = gameInfoMapper.saveGameInfo(gameInfo);

                    /*
                     * 设置在platform中gameid的值
                     * */

                    platform.setGameId(gameId);

                    int cntplat = platformMapper.savePlatform(platform);

                    shopImages.setGameId(gameId);
                    int cntImg = shopImagesMapper.saveShopImages(shopImages);

                    stock.setGameId(gameId);

                    int cnrstock = stockMapper.saveStock(stock);

                    int sum = cntImg + cnrstock + cntInfo + cntplat + cntGame;

                    return sum;

                } else {
                    throw new RuntimeException();
                }

        }


}
