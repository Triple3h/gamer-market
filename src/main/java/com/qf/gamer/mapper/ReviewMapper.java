package com.qf.gamer.mapper;

import com.qf.gamer.domain.entity.Review;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/26 0026 下午 7:41
 */
public interface ReviewMapper {
    /**
     * 根据游戏id查询评论,按发布时间排序分页(6个一页)
     * @param gameId
     * @param page
     * @param size
     * @return
     */
    List<Review> findReview(@Param("gameId") int gameId,@Param("page") int page,@Param("size") int size);
}
