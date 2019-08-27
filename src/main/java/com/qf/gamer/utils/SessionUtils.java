package com.qf.gamer.utils;

import com.qf.gamer.domain.entity.Review;
import com.qf.gamer.domain.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Classname SessionUtils
 * @Date 2019/8/27
 * @Author Triple3H
 */

public class SessionUtils {

    /**
     * 获取会话中的用户
     *
     * @param request
     * @return
     */
    public static User getSession(HttpServletRequest request) {

        HttpSession session = request.getSession();

        return (User) session.getAttribute(Constants.USER_SESSION);
    }

    /**
     * 将对象存入会话
     *
     * @param request
     * @param object
     * @param sessionName
     */
    public static void saveSession(HttpServletRequest request, Object object, String sessionName) {

        HttpSession session = request.getSession();

        session.setAttribute(sessionName, object);

    }
}
