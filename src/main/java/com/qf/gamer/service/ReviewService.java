package com.qf.gamer.service;

import com.qf.gamer.domain.entity.Review;
import com.qf.gamer.domain.vo.ReviewVo;

import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/26 0026 下午 7:57
 */
public interface ReviewService {
    List<Review> findReviewByGameId(int gameId,int page,int size);
}
