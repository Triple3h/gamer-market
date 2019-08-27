package com.qf.gamer.mapper;

import com.qf.gamer.domain.entity.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/27 0027 上午 9:08
 */
public interface BannerMapper {
    /**
     * 轮播图
     * @param order
     * @return
     */
    List<Banner> findBanner(@Param("order") int order);
}
