package com.qf.gamer.mapper;

import com.qf.gamer.domain.entity.Review;
import org.apache.ibatis.annotations.Param;

/**
 * @author HP
 */
public interface ReviewMapper {
    /**
     * 添加评论
     * @param review
     * @return
     */
    int insertNewReview(@Param("review") Review review);

    /**
     * 假删除评论
     * @param reviewId
     * @return
     */
    int deleteReview(@Param("reviewId") int reviewId);
}