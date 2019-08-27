package com.qf.gamer.mapper;

import com.qf.gamer.domain.entity.Review;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/26 0026 下午 7:41
 */
public interface ReviewMapper {
    List<Review> findReview(@Param("gameId") int gameId,@Param("page") int page,@Param("size") int size);
}
