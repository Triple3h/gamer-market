package com.qf.gamer.service.impl;

import com.qf.gamer.domain.entity.Banner;
import com.qf.gamer.mapper.BannerMapper;
import com.qf.gamer.service.BannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/27 0027 上午 9:31
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Resource
    BannerMapper bannerMapper;

    @Override
    public List<Banner> findBigBanner() {
        return bannerMapper.findBanner(1);
    }

    @Override
    public List<Banner> findSmallBanner() {
        return bannerMapper.findBanner(2);
    }
}
