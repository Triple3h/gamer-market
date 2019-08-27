package com.qf.gamer.service;

import com.qf.gamer.domain.entity.Banner;

import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/27 0027 上午 9:30
 */
public interface BannerService {
    /**
     * 轮播图 1为大图 2为小图
     * @return
     */
    List<Banner> findBigBanner();
    /**
     * 轮播图 1为大图 2为小图
     * @return
     */
    List<Banner> findSmallBanner();
}
