package com.app.web.api;

import com.app.user.model.User;
import com.app.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhaop01 on 2015/4/17.
 */
@Controller
@RequestMapping(value = "/api/user")
public class Users {



    @Autowired
    private UserService userService;

    @RequestMapping(value = "/say")
    public void say(){
        System.out.println("Hello.say!");
    }

    @RequestMapping(value = "/getUser")
    @ResponseBody
    public User getUser(){
        return this.userService.getUser();
    }

}
