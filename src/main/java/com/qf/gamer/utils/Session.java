package com.qf.gamer.utils;

import com.qf.gamer.domain.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.qf.gamer.utils.Constants.USER_SESSION;

/**
 * @author SongZun
 * @date 2019/8/27 0027 下午 4:50
 */
public class Session {
    public static User getSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        return (User) session.getAttribute(USER_SESSION);
    }
}
