package com.qf.gamer.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname Result
 * @Date 2019/8/22
 * @Author Triple3H
 */

@Data
public class Result<T> implements Serializable {
    private int status;
    private String msg;
    private T data;

    public static <T> Result success(T t) {
        Result<T> result = new Result<>();
        result.setData(t);
        result.setMsg("success");
        result.setStatus(200);
        return result;
    }

    public static Result error(String err) {
        Result result = new Result();
        result.setMsg(err);
        result.setStatus(404);
        return result;
    }

    public static Result loginFirst() {
        Result result = new Result();
        result.setMsg(Constants.LOGIN_FIRST);
        result.setStatus(250);
        return result;
    }

    public static Result forbidden() {
        Result result = new Result();
        result.setMsg(Constants.ACCESS_STRING);
        result.setStatus(403);
        return result;
    }

}
