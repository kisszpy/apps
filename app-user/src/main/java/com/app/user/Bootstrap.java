package com.app.user;

import lombok.extern.java.Log;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * Created by zhaop01 on 2015/4/17.
 */
@Log
public class Bootstrap {

    public static void main(String[] args) throws InterruptedException {
        final ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/user-dubbo-provider.xml");
        ctx.start();
        log.info("user service started successfully!");
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                log.info("Shutdown hook was invoked. Shutting down user Service.");
                ctx.close();
            }
        });
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.await();
    }
}
