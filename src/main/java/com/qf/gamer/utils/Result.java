package com.qf.gamer.utils;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


/**
 * @author SongZun
 * @date 2019/8/17 0017 上午 11:46
 */
@Data
@Component
@RequestScope
public class Result<T> {
    private T data;
    private Integer status;
    private String msg ;

    public static Result success(Object obj) {
        Result result = new Result();
        result.setStatus(Constants.SUCCESS_STATUS_200);
        result.setData(obj);
        result.setMsg(Constants.SUCCESS_MSG);
        return result;
    }


    public static Result error() {
        Result result = new Result();
        result.setStatus(Constants.ERROR_STATUS_404);
        result.setMsg(Constants.ERROR_MSG);
        return result;
    }

    public static Result loginFirst() {
        Result result = new Result();
        result.setMsg(Constants.LOGIN_FIRST);
        result.setStatus(Constants.ERROR_STATUS_250);
        return result;
    }
}
