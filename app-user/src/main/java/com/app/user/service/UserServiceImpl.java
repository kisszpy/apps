package com.app.user.service;

import com.app.user.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by zhaop01 on 2015/4/17.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean auth() {
        System.out.println("hello,i am auth method!");
        return false;
    }

    @Override
    public User getUser() {
        User u = new User();
        u.setId(100);
        u.setName("app");
        return u;
    }
}
