package com.qf.gamer.service.impl;

import com.qf.gamer.domain.entity.Review;
import com.qf.gamer.domain.vo.ReviewVo;
import com.qf.gamer.mapper.ReviewMapper;
import com.qf.gamer.service.ReviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/26 0026 下午 8:59
 */
@Service
public class ReviewServiceImpl implements ReviewService {
    @Resource
    ReviewMapper reviewMapper;

    @Override
    public List<Review> findReviewByGameId(int gameId,int page,int size) {
        return reviewMapper.findReview(gameId,page,size);
    }
}
