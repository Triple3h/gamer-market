package com.qf.gamer.service.impl;

import com.qf.gamer.domain.entity.Review;
import com.qf.gamer.mapper.ReviewMapper;
import com.qf.gamer.service.ReviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname ReviewServiceImpl
 * @Date 2019/8/27
 * @Author Triple3H
 */

@Service
public class ReviewServiceImpl implements ReviewService {

    @Resource
    ReviewMapper reviewMapper;

    @Override
    public int insertNewReview(Review review) {
        return reviewMapper.insertNewReview(review);
    }

    @Override
    public int deleteReview(int reviewId) {
        return reviewMapper.deleteReview(reviewId);
    }
}
