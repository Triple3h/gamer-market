package com.qf.gamer.service;

import com.qf.gamer.domain.entity.Review;

/**
 * @Date 2019/8/27
 * @Author Triple3H
 */

public interface ReviewService {
    int insertNewReview(Review review);

    int deleteReview(int reviewId);
}
