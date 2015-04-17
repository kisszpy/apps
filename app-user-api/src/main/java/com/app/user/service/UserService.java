package com.app.user.service;

import com.app.user.model.User;

/**
 * Created by zhaop01 on 2015/4/17.
 */
public interface UserService {

    /**
     * 用户登录接口
     * @return
     */
    boolean auth();

    /**
     * 获取用户信息接口
     * @return
     */
    User getUser();

}
