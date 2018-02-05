package com.rkhd.spring.springtest.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 7:50 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext; //注入applicationContext用来发布事件

    public void publish(String msg) {
        //使用ApplicationContext的publishEvent方法发布
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
