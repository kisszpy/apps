package com.app.web.api;

import com.app.user.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaop01 on 2015/4/17.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
        ctx.getEnvironment().setActiveProfiles("dev");
        System.out.println(ctx.getEnvironment().getActiveProfiles().length);
        ctx.getBean(UserService.class);

    }
}
