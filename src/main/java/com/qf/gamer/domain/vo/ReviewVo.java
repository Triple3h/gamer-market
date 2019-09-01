package com.qf.gamer.domain.vo;

import com.qf.gamer.domain.entity.Review;
import com.qf.gamer.domain.entity.User;
import lombok.Data;

import java.util.List;

/**
 * @author SongZun
 * @date 2019/8/26 0026 下午 8:45
 */
@Data
public class ReviewVo extends Review {
    User users;
}
